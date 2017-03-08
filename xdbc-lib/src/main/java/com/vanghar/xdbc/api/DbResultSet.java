package com.vanghar.xdbc.api;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DbResultSet
    extends ResultSet,
        BoxedPrimitives.Getter.ByIdx,
        BoxedPrimitives.Getter.ByName,
        BoxedPrimitives.Updater.ByIdx,
        BoxedPrimitives.Updater.ByName,
        TimeValues.Getter.ByIdx,
        TimeValues.Getter.ByName,
        TimeValues.Updater.ByIdx,
        TimeValues.Updater.ByName
{
    @Override
    public DbStatement getStatement() throws SQLException;
}
