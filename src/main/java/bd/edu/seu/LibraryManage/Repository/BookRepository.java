package bd.edu.seu.LibraryManage.Repository;

import bd.edu.seu.LibraryManage.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByBookName(String name);
}
