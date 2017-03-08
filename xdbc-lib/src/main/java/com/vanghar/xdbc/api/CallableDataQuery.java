package com.vanghar.xdbc.api;

import java.sql.SQLException;

public interface CallableDataQuery<T>
    extends DataQuery<T>
{
    public void setParameters(CallableDbStatement stmt) throws SQLException;
    public int getReturnCode();
}
