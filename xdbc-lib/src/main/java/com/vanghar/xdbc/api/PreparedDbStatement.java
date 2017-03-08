package com.vanghar.xdbc.api;

import java.sql.PreparedStatement;

public interface PreparedDbStatement
    extends DbStatement,
        PreparedStatement,
        BoxedPrimitives.Setter.ByIdx,
        TimeValues.Setter.ByIdx
{
}
