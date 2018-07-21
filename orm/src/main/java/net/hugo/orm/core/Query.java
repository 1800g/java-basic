package net.hugo.orm.core;

import java.util.List;

/**
 * 负责查询(对外提供服务的核心类)
 * @author hugo
 * */
public interface Query {

    /**
     * 直接执行一个查询语句
     * @param sql sql语句
     * @param params 参数
     * @return 影响记录行数
     */
    int executeDML(String sql,Object[] params);

    /**
     * 存储对象
     * @param object
     */
    void insert(Object object);

    /**
     * 删除clazz对应表中记录
     * @param clazz
     * @param id
     * @return
     */
    int delete(Class clazz,int id);

    /**
     * 删除对象
     * @param object
     */
    void delete(Object object);

    /**
     * 更新对象对应的记录，并且指更新指定的字段值
     * @param object
     * @param fieldNames
     * @return 影响记录行数
     */
    int update(Object object,String[] fieldNames);

    /**
     * 查询返回多行记录
     * @param sql
     * @param clazz
     * @param params
     * @return
     */
    List queryRows(String sql, Class clazz, Object[] params);

    /**
     * 查询返回一行记录
     * @param sql
     * @param clazz
     * @param params
     * @return
     */
    Object queryUniqueRows(String sql, Class clazz, Object[] params);

    /**
     * 查询返回一个值（一行一列）
     * @param sql
     * @param params
     * @return
     */
    Object queryValue(String sql, Object[] params);

    /**
     * 查询返回一个数字（一行一列）
     * @param sql
     * @param params
     * @return
     */
    Number queryNumber(String sql, Object[] params);
}
