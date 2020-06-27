package com.moon.generator.service;

import com.moon.generator.entity.GenTableColumn;
import com.moon.generator.mapper.GenMapper;
import com.moon.generator.properties.GenProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述: 获取所有表信息
 * 创建人：小月
 * 创建时间：2020-06-27 17:46
 */
@Service
@RunWith(SpringRunner.class)
@SpringBootTest
public class TableInfoService {

    @Autowired
    private GenMapper genMapper;

    @Autowired
    private GenProperties g;

    @Test
    public  void getTableInfo(){
        List<GenTableColumn> tableInfo = this.findTableInfo();
        Map<String, List<GenTableColumn>> mmaps = this.groupByTableName(tableInfo);
        return;
    }

    private List<GenTableColumn> findTableInfo(){
        String schema = g.parseUrl();
        List<GenTableColumn> allTableColumn = genMapper.findAllTableColumn(schema);
        return allTableColumn;
    }

    /**
     * 将数据按表进行拆分组合
     */
    private Map<String, List<GenTableColumn>> groupByTableName(List<GenTableColumn> list) {
        Map<String, List<GenTableColumn>> map = new HashMap<>();
        for (GenTableColumn g : list) {
            String tableName = g.getTableName();
            boolean b = map.containsKey(tableName);
            List<GenTableColumn> genTableColumns = new ArrayList<>();
            if (b) {
                genTableColumns = map.get(tableName);
            } else {
                map.put(tableName, genTableColumns);
            }
            GenTableColumn genTableColumn = new GenTableColumn();
            genTableColumn.setTableName(tableName);
            genTableColumn.setColumnName(g.getColumnName());
            genTableColumn.setDataType(g.getDataType());
            genTableColumn.setExtra(g.getExtra());
            genTableColumn.setColumnComment(g.getColumnComment());
            genTableColumn.setColumnKey(g.getColumnKey());
            genTableColumns.add(genTableColumn);
        }
        return map;
    }





}
