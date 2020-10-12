package bd.edu.seu.LibraryManage.Controlar;



import bd.edu.seu.LibraryManage.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class LibraryController {

    @Autowired
    private BookControl controlBook;

    // Save Book ...............
    @PostMapping("/addbook")
    public Book addBook(@RequestBody Book book){
        return controlBook.saveBook(book);
    }

    // Find book ............

    @GetMapping("/books")
    public List<Book> listAllBook(){
        return controlBook.listAllBook();
    }

    @GetMapping("/booksfindbyid/{id}")
    public Book findbyBookId(@PathVariable int id){
        return controlBook.getBookbyId(id);
    }

    @GetMapping("/books/{name}")
    public Book findByBookName(@PathVariable String name){
        return controlBook.getByBookName(name);
    }

    //Update

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book){
        return controlBook.updateBook(book);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        return controlBook.deleteBook(id);
    }

}
