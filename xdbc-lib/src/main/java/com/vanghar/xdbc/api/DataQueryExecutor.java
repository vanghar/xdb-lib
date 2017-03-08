package com.vanghar.xdbc.api;

import java.util.Collection;
import java.util.function.Function;

public interface DataQueryExecutor
    extends AutoCloseable
{
    public void makeAndExecute(Function<DataQueryExecutor, DataQuery<?>> queryFn);
    public void makeAndExecuteAs(String userName, String password,
            Function<DataQueryExecutor, DataQuery<?>> queryFn);
    
    public void executeQuery(DataQuery<?> query);
    public void executeQueryAs(String userName, String password, DataQuery<?> query);
    
    public void executeBatch(Collection<DataQuery<?>> queries);
    public void executeBatchAs(String userName, String password, 
            Collection<DataQuery<?>> queries);
    
    public void executeTranBatch(Collection<DataQuery<?>> queries);
    public void executeTranBatchAs(String userName, String password, 
            Collection<DataQuery<?>> queries);
}
