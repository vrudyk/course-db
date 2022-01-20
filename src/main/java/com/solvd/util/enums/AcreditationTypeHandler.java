package com.solvd.util.enums;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcreditationTypeHandler extends BaseTypeHandler<Acreditation> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Acreditation acreditation, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, acreditation.getValue());
    }

    @Override
    public Acreditation getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return Acreditation.getValue(resultSet.getString(s));
    }

    @Override
    public Acreditation getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return Acreditation.getValue(resultSet.getString(i));
    }

    @Override
    public Acreditation getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return Acreditation.getValue(callableStatement.getString(i));
    }
}
