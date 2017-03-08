package com.vanghar.xdbc.api;

import java.sql.SQLException;
import java.sql.Statement;

public interface DbStatement 
    extends Statement
{
    @Override
    public DbResultSet executeQuery(String sql) throws SQLException;
    // These methods should have been available in JDBC
    public DbResultSet executeQuery() throws SQLException;
    public boolean execute() throws SQLException;
    public int executeUpdate() throws SQLException;
    
    @Override
    public DbResultSet getResultSet() throws SQLException;
    @Override
    public DbConnection getConnection() throws SQLException;

}
