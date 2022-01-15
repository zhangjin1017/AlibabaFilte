import com.zj.book.Book;
import com.zj.book.BookDao;

import java.sql.SQLException;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws SQLException {
         BookDao bookDao=new BookDao();
      List<Book> list= bookDao.findAll();
        System.out.println(list);
    }
}
