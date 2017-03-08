package com.vanghar.xdbc.util.func;

import java.sql.SQLException;

@FunctionalInterface
public interface DbTriConsumer<T,U,V>
{
    public void accept(T t, U u, V v) throws SQLException;
}
