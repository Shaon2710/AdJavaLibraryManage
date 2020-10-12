package bd.edu.seu.LibraryManage.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BOOK_TABLE")
public class Book {

    @Id
    @GeneratedValue
    private int id;
    private String bookName;
    private String bookAuthor;
    private Float version;
    private int remain;
    private String bookSelf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Float getVersion() {
        return version;
    }

    public void setVersion(Float version) {
        this.version = version;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    public String getBookSelf() {
        return bookSelf;
    }

    public void setBookSelf(String bookSelf) {
        this.bookSelf = bookSelf;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", version=" + version +
                ", remain=" + remain +
                ", bookSelf='" + bookSelf + '\'' +
                '}';
    }
}
