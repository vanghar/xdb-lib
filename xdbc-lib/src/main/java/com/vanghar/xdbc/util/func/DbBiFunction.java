package com.vanghar.xdbc.util.func;

import java.sql.SQLException;

@FunctionalInterface
public interface DbBiFunction<T,U,R>
{
    public R apply(T t, U u) throws SQLException;
}
