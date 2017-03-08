package com.vanghar.xdbc.api;

import java.sql.SQLException;

public interface TimeValues
{
    public interface Getter
    {
        public interface ByIdx
        {
            public long getDate_ms(int idx) throws SQLException;
            public long getTime_ms(int idx) throws SQLException;
            public long getTimestamp_ms(int idx) throws SQLException;
            public Long getDateX_ms(int idx) throws SQLException;
            public Long getTimeX_ms(int idx) throws SQLException;
            public Long getTimestampX_ms(int idx) throws SQLException;
        }
        
        public interface ByName
        {
            public long getDate_ms(String name) throws SQLException;
            public long getTime_ms(String name) throws SQLException;
            public long getTimestamp_ms(String name) throws SQLException;
            public Long getDateX_ms(String name) throws SQLException;
            public Long getTimeX_ms(String name) throws SQLException;
            public Long getTimestampX_ms(String name) throws SQLException;
        }
        
        public interface ByType<T>
        {
            public long getDate_ms(T col) throws SQLException;
            public long getTime_ms(T col) throws SQLException;
            public long getTimestamp_ms(T col) throws SQLException;
            public Long getDateX_ms(T col) throws SQLException;
            public Long getTimeX_ms(T col) throws SQLException;
            public Long getTimestampX_ms(T col) throws SQLException;
        }
    }
    
    public interface Updater
    {
        public interface ByIdx
        {
            public void updateDate_ms(int idx, long ms) throws SQLException;
            public void updateTime_ms(int idx, long ms) throws SQLException;
            public void updateTimestamp_ms(int idx, long ms) throws SQLException;
            public void updateDateX_ms(int idx, Long ms) throws SQLException;
            public void updateTimeX_ms(int idx, Long ms) throws SQLException;
            public void updateTimestampX_ms(int idx, Long ms) throws SQLException;
        }
        
        public interface ByName
        {
            public void updateDate_ms(String name, long ms) throws SQLException;
            public void updateTime_ms(String name, long ms) throws SQLException;
            public void updateTimestamp_ms(String name, long ms) throws SQLException;
            public void updateDateX_ms(String name, Long ms) throws SQLException;
            public void updateTimeX_ms(String name, Long ms) throws SQLException;
            public void updateTimestampX_ms(String name, Long ms) throws SQLException;            
        }
        
        public interface ByType<T>
        {
            public void updateDate_ms(T col, long ms) throws SQLException;
            public void updateTime_ms(T col, long ms) throws SQLException;
            public void updateTimestamp_ms(T col, long ms) throws SQLException;
            public void updateDateX_ms(T col, Long ms) throws SQLException;
            public void updateTimeX_ms(T col, Long ms) throws SQLException;
            public void updateTimestampX_ms(T col, Long ms) throws SQLException;            
        }
    }
    
    public interface Setter
    {
        public interface ByIdx
        {
            public void setDate_ms(int idx, long ms) throws SQLException;
            public void setTime_ms(int idx, long ms) throws SQLException;
            public void setTimestamp_ms(int idx, long ms) throws SQLException;
            public void setDateX_ms(int idx, Long ms) throws SQLException;
            public void setTimeX_ms(int idx, Long ms) throws SQLException;
            public void setTimestampX_ms(int idx, Long ms) throws SQLException;
        }
        
        public interface ByName
        {
            public void setDate_ms(String name, long ms) throws SQLException;
            public void setTime_ms(String name, long ms) throws SQLException;
            public void setTimestamp_ms(String name, long ms) throws SQLException;
            public void setDateX_ms(String name, Long ms) throws SQLException;
            public void setTimeX_ms(String name, Long ms) throws SQLException;
            public void setTimestampX_ms(String name, Long ms) throws SQLException;            
        }
        
        public interface ByType<T>
        {
            public void setDate_ms(T col, long ms) throws SQLException;
            public void setTime_ms(T col, long ms) throws SQLException;
            public void setTimestamp_ms(T col, long ms) throws SQLException;
            public void setDateX_ms(T col, Long ms) throws SQLException;
            public void setTimeX_ms(T col, Long ms) throws SQLException;
            public void setTimestampX_ms(T col, Long ms) throws SQLException;
        }
    }    
}
