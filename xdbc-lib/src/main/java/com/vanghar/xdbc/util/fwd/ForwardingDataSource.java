package com.vanghar.xdbc.util.fwd;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

public abstract class ForwardingDataSource
    implements DataSource
{
    private final DataSource delegate;
    protected ForwardingDataSource(final DataSource delegate)
    {
        this.delegate = delegate;
    }
    public PrintWriter getLogWriter() throws SQLException
    {
        return delegate.getLogWriter();
    }
    public <T> T unwrap(Class<T> iface) throws SQLException
    {
        return delegate.unwrap(iface);
    }
    public void setLogWriter(PrintWriter out) throws SQLException
    {
        delegate.setLogWriter(out);
    }
    public boolean isWrapperFor(Class<?> iface) throws SQLException
    {
        return delegate.isWrapperFor(iface);
    }
    public Connection getConnection() throws SQLException
    {
        return delegate.getConnection();
    }
    public void setLoginTimeout(int seconds) throws SQLException
    {
        delegate.setLoginTimeout(seconds);
    }
    public Connection getConnection(String username, String password) throws SQLException
    {
        return delegate.getConnection(username, password);
    }
    public int getLoginTimeout() throws SQLException
    {
        return delegate.getLoginTimeout();
    }
    public Logger getParentLogger() throws SQLFeatureNotSupportedException
    {
        return delegate.getParentLogger();
    }
    
    
}
