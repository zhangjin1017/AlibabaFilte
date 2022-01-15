package com.zj.book;

import com.mysql.cj.QueryResult;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BookDao {
    private QueryRunner qr=new QueryRunner();

    Connection conn;
    {
        try {
            conn = DBUtilsByDruid.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Book> findAll() throws SQLException {
            String sql = "select * from t_book";
            return qr.query(conn,sql,new BeanListHandler<Book>(Book.class));
        }
        public List<Book> findByCategory(int category) throws SQLException {
            String sql = "select * from t_book where category=?";
            return qr.query(conn,sql,new BeanListHandler<Book>(Book.class),category);
        }
}
