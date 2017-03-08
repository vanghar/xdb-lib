package com.vanghar.xdbc.api;

public interface DbProcedure
{
    public String name();
    public int argCount();
    public boolean hasRetCode();
    public String calledAs();
}
