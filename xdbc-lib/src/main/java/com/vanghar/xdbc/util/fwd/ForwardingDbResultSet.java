package com.vanghar.xdbc.util.fwd;

import java.sql.SQLException;

import com.vanghar.xdbc.api.DbResultSet;
import com.vanghar.xdbc.api.DbStatement;

public class ForwardingDbResultSet
    extends ForwardingResultSet 
    implements DbResultSet
{
    private final DbResultSet delegate;
    protected ForwardingDbResultSet(final DbResultSet delegate)
    {
        super(delegate);
        this.delegate = delegate;
    }
    // ------------------------------------------------------------------------
    public Boolean getBooleanX(int idx) throws SQLException
    {
        return delegate.getBooleanX(idx);
    }
    public Byte getByteX(int idx) throws SQLException
    {
        return delegate.getByteX(idx);
    }
    public Double getDoubleX(int idx) throws SQLException
    {
        return delegate.getDoubleX(idx);
    }
    public Float getFloatX(int idx) throws SQLException
    {
        return delegate.getFloatX(idx);
    }
    public Integer getIntX(int idx) throws SQLException
    {
        return delegate.getIntX(idx);
    }
    public Long getLongX(int idx) throws SQLException
    {
        return delegate.getLongX(idx);
    }
    public Short getShortX(int idx) throws SQLException
    {
        return delegate.getShortX(idx);
    }
    // ------------------------------------------------------------------------
    public Boolean getBooleanX(String name) throws SQLException
    {
        return delegate.getBooleanX(name);
    }
    public Byte getByteX(String name) throws SQLException
    {
        return delegate.getByteX(name);
    }
    public Double getDoubleX(String name) throws SQLException
    {
        return delegate.getDoubleX(name);
    }
    public Float getFloatX(String name) throws SQLException
    {
        return delegate.getFloatX(name);
    }
    public Integer getIntX(String name) throws SQLException
    {
        return delegate.getIntX(name);
    }
    public Long getLongX(String name) throws SQLException
    {
        return delegate.getLongX(name);
    }
    public Short getShortX(String name) throws SQLException
    {
        return delegate.getShortX(name);
    }
    // ------------------------------------------------------------------------
    public void updateBooleanX(int idx, Boolean x) throws SQLException
    {
        delegate.updateBooleanX(idx, x);
    }
    public void updateByteX(int idx, Byte x) throws SQLException
    {
        delegate.updateByteX(idx, x);
    }
    public void updateDoubleX(int idx, Double x) throws SQLException
    {
        delegate.updateDoubleX(idx, x);
    }
    public void updateFloatX(int idx, Float x) throws SQLException
    {
        delegate.updateFloatX(idx, x);
    }
    public void updateIntX(int idx, Integer x) throws SQLException
    {
        delegate.updateIntX(idx, x);
    }
    public void updateLongX(int idx, Long x) throws SQLException
    {
        delegate.updateLongX(idx, x);
    }
    public void updateShortX(int idx, Short x) throws SQLException
    {
        delegate.updateShortX(idx, x);
    }
    // ------------------------------------------------------------------------
    public void updateBooleanX(String name, Boolean x) throws SQLException
    {
        delegate.updateBooleanX(name, x);
    }
    public void updateByteX(String name, Byte x) throws SQLException
    {
        delegate.updateByteX(name, x);
    }
    public void updateDoubleX(String name, Double x) throws SQLException
    {
        delegate.updateDoubleX(name, x);
    }
    public void updateFloatX(String name, Float x) throws SQLException
    {
        delegate.updateFloatX(name, x);
    }
    public void updateIntX(String name, Integer x) throws SQLException
    {
        delegate.updateIntX(name, x);
    }
    public void updateLongX(String name, Long x) throws SQLException
    {
        delegate.updateLongX(name, x);
    }
    public void updateShortX(String name, Short x) throws SQLException
    {
        delegate.updateShortX(name, x);
    }
    // ------------------------------------------------------------------------
    public long getDate_ms(int idx) throws SQLException
    {
        return delegate.getDate_ms(idx);
    }
    public long getTime_ms(int idx) throws SQLException
    {
        return delegate.getTime_ms(idx);
    }
    public long getTimestamp_ms(int idx) throws SQLException
    {
        return delegate.getTimestamp_ms(idx);
    }
    public Long getDateX_ms(int idx) throws SQLException
    {
        return delegate.getDateX_ms(idx);
    }
    public Long getTimeX_ms(int idx) throws SQLException
    {
        return delegate.getTimeX_ms(idx);
    }
    public Long getTimestampX_ms(int idx) throws SQLException
    {
        return delegate.getTimestampX_ms(idx);
    }
    // ------------------------------------------------------------------------
    public long getDate_ms(String name) throws SQLException
    {
        return delegate.getDate_ms(name);
    }
    public long getTime_ms(String name) throws SQLException
    {
        return delegate.getTime_ms(name);
    }
    public long getTimestamp_ms(String name) throws SQLException
    {
        return delegate.getTimestamp_ms(name);
    }
    public Long getDateX_ms(String name) throws SQLException
    {
        return delegate.getDateX_ms(name);
    }
    public Long getTimeX_ms(String name) throws SQLException
    {
        return delegate.getTimeX_ms(name);
    }
    public Long getTimestampX_ms(String name) throws SQLException
    {
        return delegate.getTimestampX_ms(name);
    }
    // ------------------------------------------------------------------------
    public void updateDate_ms(int idx, long ms) throws SQLException
    {
        delegate.updateDate_ms(idx, ms);
    }
    public void updateTime_ms(int idx, long ms) throws SQLException
    {
        delegate.updateTime_ms(idx, ms);
    }
    public void updateTimestamp_ms(int idx, long ms) throws SQLException
    {
        delegate.updateTimestamp_ms(idx, ms);
    }
    public void updateDateX_ms(int idx, Long ms) throws SQLException
    {
        delegate.updateDateX_ms(idx, ms);
    }
    public void updateTimeX_ms(int idx, Long ms) throws SQLException
    {
        delegate.updateTimeX_ms(idx, ms);
    }
    public void updateTimestampX_ms(int idx, Long ms) throws SQLException
    {
        delegate.updateTimestampX_ms(idx, ms);
    }
    // ------------------------------------------------------------------------    
    public void updateDate_ms(String name, long ms) throws SQLException
    {
        delegate.updateDate_ms(name, ms);
    }
    public void updateTime_ms(String name, long ms) throws SQLException
    {
        delegate.updateTime_ms(name, ms);
    }
    public void updateTimestamp_ms(String name, long ms) throws SQLException
    {
        delegate.updateTimestamp_ms(name, ms);
    }
    public void updateDateX_ms(String name, Long ms) throws SQLException
    {
        delegate.updateDateX_ms(name, ms);
    }
    public void updateTimeX_ms(String name, Long ms) throws SQLException
    {
        delegate.updateTimeX_ms(name, ms);
    }
    public void updateTimestampX_ms(String name, Long ms) throws SQLException
    {
        delegate.updateTimestampX_ms(name, ms);
    }
    public DbStatement getStatement() throws SQLException
    {
        return delegate.getStatement();
    }
}
