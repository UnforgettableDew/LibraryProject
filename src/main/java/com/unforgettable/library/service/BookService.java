package com.unforgettable.library.service;

import com.unforgettable.library.entity.Book;
import com.unforgettable.library.entity.Student;
import com.unforgettable.library.exception.BookNotFoundException;
import com.unforgettable.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findBookById(id).orElseThrow(
                () -> new BookNotFoundException("Book with ID=" + id + " not found")
        );
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBookById(Long id) {
        bookRepository.delete(getBookById(id));
    }

    public List<Book> getBooksByTitle(String title) {
        List<Book> books = bookRepository.findBooksByTitle(title);
        if (books.isEmpty())
            throw new BookNotFoundException("No books with title='" + title + "' were found");
        return books;
    }

    public List<Student> getStudentsWhoReadBook(String title) {
        List<Book> books = getBooksByTitle(title);
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            students.add(books.get(i).getStudent());
        }
        return students;
    }
}
