package com.vanghar.xdbc.api;

import java.sql.SQLException;
import java.util.concurrent.Callable;

public interface DataQuery<T>
    extends Callable<T>, ResultHandler<T>
{
    public T callAs(String userName, String password) throws Exception;
    
    public DbStatement createStatement(DbConnection conn) throws SQLException;
    public boolean executeStatement(DbStatement stmt) throws SQLException;
    
    public void onCompleted(DbStatement stmt) throws SQLException;
}
