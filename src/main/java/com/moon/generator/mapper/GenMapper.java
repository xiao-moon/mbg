package com.moon.generator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moon.generator.entity.GenTableColumn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 描述:
 * 创建人：小月
 * 创建时间：2020-06-27 17:35
 */
@Mapper
public interface GenMapper extends BaseMapper<GenTableColumn> {

    @Select("SELECT T.TABLE_NAME 'tableName' ," +
            "T.COLUMN_NAME 'columnName'," +
            "T.DATA_TYPE 'dataType' ," +
            "T.EXTRA 'extra' ," +
            "T.COLUMN_COMMENT 'columnComment' ," +
            "T.COLUMN_KEY 'columnKey'" +
            "FROM INFORMATION_SCHEMA.COLUMNS T " +
            "WHERE T.TABLE_SCHEMA = #{tableName}")
    List<GenTableColumn> findAllTableColumn(String tableName);

}
