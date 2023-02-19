package com.unforgettable.library.controller;

import com.unforgettable.library.entity.Book;
import com.unforgettable.library.entity.Student;
import com.unforgettable.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping()
    public void saveBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @DeleteMapping("{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookService.deleteBookById(id);
    }

    @GetMapping("/list")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/list/{title}")
    public List<Book> getBooksByTitle(@PathVariable(name = "title") String title) {
        return bookService.getBooksByTitle(title);
    }

    @GetMapping("/students-read/{title}")
    public List<Student> getStudentsWhoReadBook(@PathVariable String title) {
        return bookService.getStudentsWhoReadBook(title);
    }
}
