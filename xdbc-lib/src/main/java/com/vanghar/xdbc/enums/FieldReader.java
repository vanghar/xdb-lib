package com.vanghar.xdbc.enums;

import com.vanghar.common.util.func.FluentBiFunction;

public interface FieldReader<
    E extends Enum<E>,
    B>
{
    public FluentBiFunction<B,EnumResultSet<E>,E> reader();
    public B readInto(EnumResultSet<E> ers, B builder);
}
