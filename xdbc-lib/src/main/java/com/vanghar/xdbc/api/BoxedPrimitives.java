package com.vanghar.xdbc.api;

import java.sql.SQLException;

public interface BoxedPrimitives
{
    public interface Getter
    {
        public interface ByIdx
        {
            public Boolean getBooleanX(int idx) throws SQLException;
            public Byte getByteX(int idx) throws SQLException;
            public Double getDoubleX(int idx) throws SQLException;
            public Float getFloatX(int idx) throws SQLException;
            public Integer getIntX(int idx) throws SQLException;
            public Long getLongX(int idx) throws SQLException;
            public Short getShortX(int idx) throws SQLException;
        }
        public interface ByName
        {
            public Boolean getBooleanX(String name) throws SQLException;
            public Byte getByteX(String name) throws SQLException;
            public Double getDoubleX(String name) throws SQLException;
            public Float getFloatX(String name) throws SQLException;
            public Integer getIntX(String name) throws SQLException;
            public Long getLongX(String name) throws SQLException;
            public Short getShortX(String name) throws SQLException;            
        }
        public interface ByType<T>
        {
            public Boolean getBooleanX(T col) throws SQLException;
            public Byte getByteX(T col) throws SQLException;
            public Double getDoubleX(T col) throws SQLException;
            public Float getFloatX(T col) throws SQLException;
            public Integer getIntX(T col) throws SQLException;
            public Long getLongX(T col) throws SQLException;
            public Short getShortX(T col) throws SQLException;
        }    
    }
    
    public interface Updater
    {
        public interface ByIdx
        {
            public void updateBooleanX(int idx, Boolean x) throws SQLException;
            public void updateByteX(int idx, Byte x) throws SQLException;
            public void updateDoubleX(int idx, Double x) throws SQLException;
            public void updateFloatX(int idx, Float x) throws SQLException;
            public void updateIntX(int idx, Integer x) throws SQLException;
            public void updateLongX(int idx, Long x) throws SQLException;
            public void updateShortX(int idx, Short x) throws SQLException;            
        }
        public interface ByName
        {
            public void updateBooleanX(String name, Boolean x) throws SQLException;
            public void updateByteX(String name, Byte x) throws SQLException;
            public void updateDoubleX(String name, Double x) throws SQLException;
            public void updateFloatX(String name, Float x) throws SQLException;
            public void updateIntX(String name, Integer x) throws SQLException;
            public void updateLongX(String name, Long x) throws SQLException;
            public void updateShortX(String name, Short x) throws SQLException;            
        }
        public interface ByType<T>
        {
            public void updateBooleanX(T col, Boolean x) throws SQLException;
            public void updateByteX(T col, Byte x) throws SQLException;
            public void updateDoubleX(T col, Double x) throws SQLException;
            public void updateFloatX(T col, Float x) throws SQLException;
            public void updateIntX(T col, Integer x) throws SQLException;
            public void updateLongX(T col, Long x) throws SQLException;
            public void updateShortX(T col, Short x) throws SQLException;            
        }
    }
    
    public interface Setter
    {
        public interface ByIdx
        {
            public void setBooleanX(int idx, Boolean x) throws SQLException;
            public void setByteX(int idx, Byte x) throws SQLException;
            public void setDoubleX(int idx, Double x) throws SQLException;
            public void setFloatX(int idx, Float x) throws SQLException;
            public void setIntX(int idx, Integer x) throws SQLException;
            public void setLongX(int idx, Long x) throws SQLException;
            public void setShortX(int idx, Short x) throws SQLException;            
        }
        public interface ByName
        {
            public void setBooleanX(String name, Boolean x) throws SQLException;
            public void setByteX(String name, Byte x) throws SQLException;
            public void setDoubleX(String name, Double x) throws SQLException;
            public void setFloatX(String name, Float x) throws SQLException;
            public void setIntX(String name, Integer x) throws SQLException;
            public void setLongX(String name, Long x) throws SQLException;
            public void setShortX(String name, Short x) throws SQLException;            
        }
        public interface ByType<T>
        {
            public void setBooleanX(T col, Boolean x) throws SQLException;
            public void setByteX(T col, Byte x) throws SQLException;
            public void setDoubleX(T col, Double x) throws SQLException;
            public void setFloatX(T col, Float x) throws SQLException;
            public void setIntX(T col, Integer x) throws SQLException;
            public void setLongX(T col, Long x) throws SQLException;
            public void setShortX(T col, Short x) throws SQLException;            
        }        
    }
}
