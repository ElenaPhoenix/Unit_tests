package Seminar4.book;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    private BookService bookService;
    private BookRepository bookRepositoryMock;

    @BeforeEach
    void setUp() {
        // создаем мок-объект для BookRepository
        bookRepositoryMock = mock(BookRepository.class);
        // передаем объекту BookService мок-объект
        bookService = new BookService(bookRepositoryMock);
    }

    @AfterEach
    void tearDown() {
        bookService = null;
    }

    @Test
    @DisplayName("Проверяем метод поиска книги по id")
    void testFindBookById() {

        when(bookRepositoryMock.findById("123")).thenReturn(new Book("123", "TestBook", "TestAuthor"));

        Book result = bookService.findBookById("123");

        assertEquals("TestBook", result.getTitle());
        assertEquals("TestAuthor", result.getAuthor());
    }

    @Test
    @DisplayName("Проверяем метод поиска книг из нашего списка")
    void testFindAllBooks() {

        when(bookRepositoryMock.findAll())
                .thenReturn(List.of(new Book("123", "TestBook", "TestAuthor")));

        List<Book> result = bookService.findAllBooks();

        assertEquals(1, result.size());
        assertEquals("TestBook", result.get(0).getTitle());
        assertEquals("TestAuthor", result.get(0).getAuthor());
    }
}