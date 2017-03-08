package com.vanghar.xdbc.api;

import java.sql.CallableStatement;

public interface CallableDbStatement
    extends PreparedDbStatement,
        CallableStatement,
        BoxedPrimitives.Getter.ByIdx,
        BoxedPrimitives.Getter.ByName,
        BoxedPrimitives.Setter.ByName,
        TimeValues.Getter.ByIdx,
        TimeValues.Getter.ByName,
        TimeValues.Setter.ByName
{
    public boolean hasReturnCode();
    public String getProcedureName();
}
