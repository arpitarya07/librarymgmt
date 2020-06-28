package com.mgmt.librarymgmt.Service;

import com.mgmt.librarymgmt.DataAccessLayer.Book;
import com.mgmt.librarymgmt.DataAccessLayer.BookRepository;
import com.mgmt.librarymgmt.DataAccessLayer.IssuedBooksRepository;
import com.mgmt.librarymgmt.DataAccessLayer.UserRepository;
import com.mgmt.librarymgmt.Exception.BookNotFoundException;
import com.mgmt.librarymgmt.Util.BookValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class BookService {

    public final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @Autowired
    BookRepository bookRepository;

    BookValidator validator = new BookValidator();


    public List<Book> findAllBooks() throws BookNotFoundException {

        LOGGER.info("findAllBooks called");
        List<Book> books = bookRepository.findAll();
        if (books.size() == 0) {
            LOGGER.severe("No book found");
            throw new BookNotFoundException();
        }
        return books;
    }

    public Book addBook(Book book) {
        if (validator.isBookValid(book)) {
            return bookRepository.save(book);
        } else {
            LOGGER.severe("Book not valid" + book);
            return null;
        }
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> booksByAuthor = bookRepository.findByAuthor(author);
        if (booksByAuthor.size() == 0) {
            LOGGER.severe("No books available by author : " + author);
        }
        return booksByAuthor;
    }

    public List<Book> getBooksBySubject(String subject) {
        List<Book> booksBySubject = bookRepository.findBySubject(subject);
        if (booksBySubject.size() == 0) {
            LOGGER.severe("No books available by subject : " + subject);
        }
        return booksBySubject;
    }
}
