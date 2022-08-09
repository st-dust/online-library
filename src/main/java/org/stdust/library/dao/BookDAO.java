package org.stdust.library.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.stdust.library.models.Book;
import org.stdust.library.models.Person;

import java.util.List;
import java.util.Optional;

@Component
public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index() {
        return jdbcTemplate.query("SELECT * FROM book", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book findByID(int id) {
        return jdbcTemplate.query("SELECT * FROM book WHERE book_id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Book.class))
                .stream().findAny().orElse(null);
    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO book(name, author, year_of_release) VALUES(?, ?, ?)",
                book.getName(), book.getAuthor(), book.getYearOfRelease());
    }

    public void update(int id, Book updatedBook) {
        jdbcTemplate.update("UPDATE book SET name=?, author=?, year_of_release=? WHERE book_id=?",
                updatedBook.getName(), updatedBook.getAuthor(), updatedBook.getYearOfRelease(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM book WHERE book_id=?", id);
    }

    public Optional<Person> getBookOwner(int bookId) {
        return jdbcTemplate.query("SELECT * FROM book JOIN person ON book.owner_id = person.id WHERE book.book_id=?",
                        new Object[]{bookId}, new BeanPropertyRowMapper<>(Person.class))
                .stream().findAny();
    }

    public void releaseBook(int id) {
        jdbcTemplate.update("UPDATE book SET owner_id=NULL WHERE book_id=?", id);
    }
}
