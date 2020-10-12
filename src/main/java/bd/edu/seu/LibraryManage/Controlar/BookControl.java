package bd.edu.seu.LibraryManage.Controlar;


import bd.edu.seu.LibraryManage.Model.Book;
import bd.edu.seu.LibraryManage.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookControl {

    @Autowired
    private BookRepository bookRepository;


    // Find Methods.................
    public List<Book> listAllBook(){
        return bookRepository.findAll();

    }
    public Book getBookbyId(Integer id){

        return bookRepository.findById(id).orElse(null);
    }

    public Book getByBookName(String name){
        return bookRepository.findByBookName(name);
    }

    // Save Methords..............

    public Book saveBook(Book book){

        return bookRepository.save(book);

    }

    //Update Method
    public Book updateBook(Book book){
      Book presentBook = bookRepository.findById(book.getId()).orElse(null);
      presentBook.setBookName(book.getBookName());
      presentBook.setBookAuthor(book.getBookAuthor());
      presentBook.setVersion(book.getVersion());
      presentBook.setRemain(book.getRemain());
      presentBook.setBookSelf(book.getBookSelf());

      return bookRepository.save(presentBook);
    }

    // Delete Methord
    public String deleteBook(int id){
         bookRepository.deleteById(id);
        String s = "Book are Delete";
        return s;
    }

}
