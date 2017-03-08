package com.vanghar.xdbc.api;

import java.util.Collection;

import com.google.common.util.concurrent.ListenableFuture;

// FIXME - add DbCredentials class
public interface DataQueryScheduler
{
    public DataQueryExecutor getQueryExecutor();
    
    public <T> ListenableFuture<T> submitQuery(DataQuery<T> query);
    public <T> ListenableFuture<T> submitQueryAs(String userName, String password, DataQuery<T> query);
    
    public ListenableFuture<DbResultSet> submitSql(String sql);
    public ListenableFuture<DbResultSet> submitSqlAs(String userName, String password, String sql);
    
    public ListenableFuture<Collection<?>> submitBatch(Collection<DataQuery<?>> queries);
    // TODO - submitBatchAs
    
    public ListenableFuture<Collection<?>> submitTranBatch(Collection<DataQuery<?>> queries);
    // TODO - submitTranBatchAs
}
