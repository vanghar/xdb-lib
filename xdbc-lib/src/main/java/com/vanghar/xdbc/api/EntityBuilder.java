package com.vanghar.xdbc.api;

import java.util.function.Function;

public interface EntityBuilder<T>
    extends Function<DbResultSet,T>
{
    public T getDefault();
    public void finished();
}
