//package com.moon.generator.service;
//
//import com.moon.BlogApplication;
//import com.moon.generator.entity.GenTableColumn;
//import com.moon.generator.entity.QGenTableColumn;
//import com.moon.generator.utils.GenUtil;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import lombok.extern.java.Log;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.stereotype.Service;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.swing.filechooser.FileSystemView;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.OutputStreamWriter;
//import java.time.Clock;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
///**
// * 描述:
// * 创建人: 小月
// * 创建时间: 2020-06-23 23:34
// */
//@Service
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {BlogApplication.class})// 指定启动类
//@Log
//public class GenService {
//
//    @Autowired
//    private JPAQueryFactory jpaQueryFactory;
//
//    private final String TABLE_SCHEMA = "blog";
//
//    private static final String MODEL_PACKAGE_LOCATION = "package com.moon.model.entity;";
//    private static final String MODEL_IMPORT = "import com.moon.model.entity.";
//
//    private static final String DTO_PACKAGE_LOCATION = "package com.moon.model.dto;";
//    private static final String DTO_IMPORT = "import com.moon.model.dto.";
//
//    private static final String MAPPER_PACKAGE_LOCATION = "package com.moon.repository;";
//    private static final String MAPPER_IMPORT = "import com.moon.model.entity.";
//
//    @Test
//    public void gen() throws Exception {
//        List<GenTableColumn> genTableColumns = this.selectTableInfos();
//        Map<String, List<GenTableColumn>> tables = getTables(genTableColumns);
//
//        File desktopDir = FileSystemView.getFileSystemView().getHomeDirectory();
//        String desktopPath = desktopDir.getAbsolutePath();
//        File ParentFile = new File(desktopPath + "\\MOON");
//        if (!ParentFile.exists()) {
//            ParentFile.mkdirs();
//        }
//        String doPath = ParentFile.getAbsolutePath() + "\\entity";
//        String dtoPath = ParentFile.getAbsolutePath() + "\\dto";
//        String mapperPath = ParentFile.getAbsolutePath() + "\\repository";
//
//        //生成entity实体类
//        this.genTableDO(tables, doPath);
//        this.genTableDTO(tables, dtoPath);
//        log.info("SUCCESS!!!");
//
//    }
//
//    /**
//     * 从数据库查到表信息
//     */
//    private List<GenTableColumn> selectTableInfos() {
//        QGenTableColumn genTableColumn = QGenTableColumn.genTableColumn;
//        List<GenTableColumn> genTableColumns = jpaQueryFactory
//                .select(
//                        genTableColumn.tableName,
//                        genTableColumn.columnName,
//                        genTableColumn.dataType,
//                        genTableColumn.extra,
//                        genTableColumn.columnComment,
//                        genTableColumn.columnKey
//                )
//                .from(genTableColumn)
//                .where(genTableColumn.tableSchema.eq(TABLE_SCHEMA))
//                .fetch()
//                .stream()
//                .map(tuple -> GenTableColumn.builder()
//                        .tableName(tuple.get(genTableColumn.tableName))
//                        .columnName(tuple.get(genTableColumn.columnName))
//                        .dataType(tuple.get(genTableColumn.dataType))
//                        .extra(tuple.get(genTableColumn.extra))
//                        .columnComment(tuple.get(genTableColumn.columnComment))
//                        .columnKey(tuple.get(genTableColumn.columnKey))
//                        .build()
//                )
//                .collect(Collectors.toList());
//        return genTableColumns;
//    }
//
//
//    /**
//     * 将数据按表进行拆分组合
//     */
//    private Map<String, List<GenTableColumn>> getTables(List<GenTableColumn> list) {
//        Map<String, List<GenTableColumn>> map = new HashMap<>();
//        for (GenTableColumn g : list) {
//            String tableName = g.getTableName();
//            boolean b = map.containsKey(tableName);
//            List<GenTableColumn> genTableColumns = new ArrayList<>();
//            if (b) {
//                genTableColumns = map.get(tableName);
//            } else {
//                map.put(tableName, genTableColumns);
//            }
//            GenTableColumn genTableColumn = new GenTableColumn();
//            genTableColumn.setTableName(tableName);
//            genTableColumn.setColumnName(g.getColumnName());
//            genTableColumn.setDataType(g.getDataType());
//            genTableColumn.setExtra(g.getExtra());
//            genTableColumn.setColumnComment(g.getColumnComment());
//            genTableColumn.setColumnKey(g.getColumnKey());
//            genTableColumns.add(genTableColumn);
//        }
//        return map;
//    }
//

//
//
//    /**
//     * 生成DTO实体类
//     */
//    private void genTableDTO(Map<String, List<GenTableColumn>> genTables, String parentFilePath) throws Exception {
//        if (genTables != null && genTables.size() > 0) {
//            for (List<GenTableColumn> genTableList : genTables.values()) {
//                String tableName = genTableList.get(0).getTableName();
//                String[] s = tableName.split("_");
//                String firstUpperTableName = GenUtil.firstUpper(s);
//                String firstLowerTableName = GenUtil.firstLower(s);
//                String filePath = parentFilePath + "\\" + firstUpperTableName + "DTO.java";
//                File file = new File(filePath);
//                this.createFile(file);
//                FileOutputStream fos = new FileOutputStream(file);
//                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
//                //获取当前时间
//                LocalDateTime time = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Shanghai")));
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//                String nowTime = time.format(formatter);
//
//                bw.write(DTO_PACKAGE_LOCATION + "\n");
//                bw.write("\n");
//                bw.write("import lombok.AllArgsConstructor;\n");
//                bw.write("import lombok.Builder;\n");
//                bw.write("import lombok.Data;\n");
//                bw.write("import lombok.NoArgsConstructor;\n");
//                bw.write("import io.swagger.annotations.ApiModel;\n");
//                bw.write("import io.swagger.annotations.ApiModelProperty;\n");
////                bw.write("import java.lang.byte[];\n");
//                bw.write("\n");
//                bw.write("/**\n");
//                bw.write(" * 描述: " + firstUpperTableName + "DTO实体类\n");
//                bw.write(" * 创建人: 小月\n");
//                bw.write(" * 创建时间: " + nowTime + "\n");
//                bw.write(" */\n");
//
//                bw.write("@Data\n");
//                bw.write("@AllArgsConstructor\n");
//                bw.write("@NoArgsConstructor\n");
//                bw.write("@Builder\n");
//                bw.write("@ApiModel(description = \"" + firstUpperTableName + "DTO\")\n");
//                bw.write("public class " + firstUpperTableName + "DTO {\n");
//                bw.write("\n");
//
//                for (GenTableColumn column : genTableList) {
//                    bw.write("    /**\n");
//                    bw.write("     * " + (column.getColumnComment() == null ? GenUtil.firstLower(column.getColumnName().split("_")) : column.getColumnComment()) + "\n");
//                    bw.write("     */\n");
//                    bw.write("    @ApiModelProperty(value = \"" + (column.getColumnComment() == null ? GenUtil.firstLower(column.getColumnName().split("_")) : column.getColumnComment()) + "\")\n");
//                    bw.write("    private String " + GenUtil.firstLower(column.getColumnName().split("_")) + ";\n");
//                    bw.write("\n");
//                }
//
//                bw.write("\n");
//                bw.write("}\n");
//
//                bw.close();
//                fos.close();
//            }
//        }
//    }
//

//
//}
