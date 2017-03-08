package com.vanghar.xdbc.enums;

import com.vanghar.xdbc.api.CallableDbStatement;

public interface ParamWriter<
    E extends Enum<E>,
    M>
{
    public void writeOnto(M entity, CallableDbStatement stmt);
}
