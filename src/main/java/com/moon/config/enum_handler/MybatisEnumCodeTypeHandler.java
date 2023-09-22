package com.moon.config.enum_handler;

import com.moon.model.enums.ValueEnum;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.springframework.util.Assert;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

/**
 * mybatis 枚举转换
 * https://cloud.tencent.com/developer/article/2291805
 */
@Slf4j
@NoArgsConstructor
public class MybatisEnumCodeTypeHandler<V, E extends ValueEnum<V>> extends BaseTypeHandler<E> {

    private Class<E> type;

    public MybatisEnumCodeTypeHandler(Class<E> type) {
        Assert.notNull(type, "type argument can not be null");
        this.type = type;
    }

    /**
     * 用于定义设置参数时把Java类型的参数转换为对应的数据库类型
     */
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, E e, JdbcType jdbcType) throws SQLException {
        preparedStatement.setObject(i, e.getValue());
    }

    /**
     * 用于定义通过字段名称获取字段数据时把数据库类型转换为对应的Java类型
     */
    @SuppressWarnings("unchecked")
    @Override
    public E getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return Objects.isNull(resultSet.getObject(s)) ? null : E.valueToEnum(type, (V) resultSet.getObject(s));
    }

    /**
     * 用于定义通过字段索引获取字段数据时把数据库类型转换为对应的Java类型
     */
    @SuppressWarnings("unchecked")
    @Override
    public E getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return Objects.isNull(resultSet.getObject(i)) ? null : E.valueToEnum(type, (V) resultSet.getObject(i));
    }

    /**
     * 用定义调用存储过程把数据库类型转换为对应的Java类型
     */
    @SuppressWarnings("unchecked")
    @Override
    public E getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return Objects.isNull(callableStatement.getObject(i)) ? null : E.valueToEnum(type, (V) callableStatement.getObject(i));
    }
}
