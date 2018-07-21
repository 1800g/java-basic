package net.hugo.orm.core;

/**
 * Java类型和数据库类型的互相转换
 * @author hugo
 */
public interface TypeConvertor {

    String databaseType2JavaType(String columnType);

    String javaTypeType2DatabaseType(String javaDataType);
}
