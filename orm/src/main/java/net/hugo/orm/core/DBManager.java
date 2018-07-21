package net.hugo.orm.core;

import net.hugo.orm.bean.Configuration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 根据配置信息，维持连接对象的管理
 * @author hugo
 */
public class DBManager {
    private static Configuration conf;

    static {
        Properties pros = new Properties();

        try {
            pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        conf = new Configuration();
        conf.setDriver(pros.getProperty("driver"));
        conf.setPoPackage(pros.getProperty("poPackage"));
        conf.setSrcPath(pros.getProperty("srcPath"));
        conf.setUser(pros.getProperty("user"));
        conf.setPwd(pros.getProperty("pwd"));
        conf.setUrl(pros.getProperty("url"));
        conf.setUsingDB(pros.getProperty("usingDB"));
    }

    public static Connection getConn(){
        try {
            Class.forName(conf.getDriver());
            return DriverManager.getConnection(conf.getUrl(),conf.getUser(),conf.getPwd());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
