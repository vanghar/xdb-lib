package com.vanghar.xdbc.api;

import java.sql.SQLException;
import javax.sql.DataSource;

public interface DbDataSource
    extends DataSource, AutoCloseable
{
    @Override
    public DbConnection getConnection() throws SQLException;
    @Override
    public DbConnection getConnection(String username, String password) throws SQLException;
    
}
