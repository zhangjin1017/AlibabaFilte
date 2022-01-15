package com.zj.book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "BookServlet", value = "/BookServlet")
public class BookServlet extends BaseServlet {
    private BookDao bookDao=new BookDao();
    public String findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {
        req.setAttribute("bookList",bookDao.findAll());
        return "f:/showBook.jsp";
    }
    public String findByCategory(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {
        String value=req.getParameter("category");
        int category=Integer.parseInt(value);
        req.setAttribute("bookList",bookDao.findByCategory(category));
        return "f:/showBook.jsp";
    }

}
