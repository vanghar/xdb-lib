package com.vanghar.xdbc.api;

import java.sql.SQLException;

public interface ResultHandler<T>
{
    public int onResultSet(DbResultSet rs) throws SQLException;
    public T getResult();
    public void onUpdate(int count);
    public int getUpdateCount();
}
