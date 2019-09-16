package com.wangcan.mybatis.demo;

import com.wangcan.mybatis.demo.domain.EnableEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;

public class EnumHandler <E extends EnableEnum> extends BaseTypeHandler<E> {
    private Class<E> type;
    private final Hashtable<Integer,E> enums;

    public EnumHandler(Class<E> type) {
        this.type=type;
        E[] enums1=type.getEnumConstants();

        enums=new Hashtable<Integer,E>();
        for (E e : enums1) {
            enums.put(e.getValue(),e);
        }

    }
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i,parameter.ordinal());
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int i=rs.getInt(columnName);
        return enums.get(i);
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int i=rs.getInt(columnIndex);
        return enums.get(i);
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int i=cs.getInt(columnIndex);
        return enums.get(i);
    }
}

