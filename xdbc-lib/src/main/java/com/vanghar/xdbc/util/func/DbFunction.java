package com.vanghar.xdbc.util.func;

import java.sql.SQLException;

@FunctionalInterface
public interface DbFunction<T,R>
{
    public R apply(T t) throws SQLException;
}
