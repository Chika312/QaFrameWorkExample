package org.example.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.dbutils.BeanProcessor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Data
@NoArgsConstructor
public class User {
    int emp_no;
    String first_name;
    String birth_date;
    String last_name;
    String gender;
    String hire_date;

    public User(ResultSet resultSet) throws SQLException {
        new BeanProcessor().populateBean(resultSet, this);
    }

    public static List<User> getAllUser() throws SQLException {
        String query = "Select * from employees";
        try (ResultSet resultSet = DbConection.query(query)) {
            return new BeanProcessor().toBeanList(resultSet, User.class);
        }
    }

    public static User getUserByName(String column, String name) throws SQLException {
        String query = "Select * from employees where " + column + "=?";
        ResultSet resultSet = DbConection.query(query, name);
        if (!resultSet.next()) return null;
        return new BeanProcessor().toBean(resultSet, User.class);
    }










    public static List<User>getByGender (String column,String gender) throws SQLException {
        String query = "Select * from employees where "+ column + "= ?";
        ResultSet resultSet = DbConection.query(query,gender);
        if (!resultSet.next())return null;
        return new BeanProcessor().toBeanList(resultSet,User.class);
    }















}
