package org.example.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.commons.dbutils.BeanProcessor;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class DbConection {
    public static Statement statement;
    public static Connection connection;

    public static void open(String db) throws SQLException {
        if (connection == null) {
            connection = getmysqlDataSource(db).getConnection();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }
    }

    public static ResultSet query(String query,Object... params) throws SQLException {
        if(params.length==0){
            return statement.executeQuery(query);

        }
        else {
            PreparedStatement preparedStatement =connection.prepareStatement(query);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i+1,params[i]);
            }
            return preparedStatement.executeQuery();
        }
    }

    public static void closeDb() throws SQLException {
        if(connection!=null){
            connection.close();
            connection=null;
        }
        if(statement!=null){
            statement.close();
            statement=null;
        }
    }


    public static MysqlDataSource getmysqlDataSource(String database) {
        MysqlDataSource mysql = new MysqlDataSource();
        mysql.setDatabaseName(database);
        mysql.setPortNumber(3306);
        mysql.setUser("root");
        mysql.setPassword("chika007");
        mysql.setServerName("localhost");
        return mysql;
    }
}
