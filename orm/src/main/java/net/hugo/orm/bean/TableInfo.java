package net.hugo.orm.bean;

import java.util.Map;

/**
 * 存储表结构信息
 * @author hugo
 */
public class TableInfo {

    private String name;
    private Map<String,ColumnInfo> columns;
    private ColumnInfo primaryKey;

    public TableInfo(String name, Map<String, ColumnInfo> columns, ColumnInfo primaryKey) {
        this.name = name;
        this.columns = columns;
        this.primaryKey = primaryKey;
    }

    public TableInfo() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, ColumnInfo> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, ColumnInfo> columns) {
        this.columns = columns;
    }

    public ColumnInfo getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(ColumnInfo primaryKey) {
        this.primaryKey = primaryKey;
    }
}
