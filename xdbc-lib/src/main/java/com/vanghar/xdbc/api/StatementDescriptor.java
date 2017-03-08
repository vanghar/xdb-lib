package com.vanghar.xdbc.api;

import java.sql.SQLException;

@FunctionalInterface
public interface StatementDescriptor<T,S extends PreparedDbStatement>
{
    public void accept(T source, S stmt) throws SQLException;
}
