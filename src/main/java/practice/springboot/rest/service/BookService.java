package practice.springboot.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice.springboot.rest.model.Book;
import practice.springboot.rest.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	public Book getBookByTitle(String title) {
		return bookRepository.findByTitle(title);
	}

	public Book getBookByIsbn(String isbn) {
		return bookRepository.findByIsbn(isbn);
	}

	public List<Book> getBookByPageCount(int pageCount) {
		return bookRepository.findByPageCount(pageCount);
	}

	public void deleteBook(String id) {
		bookRepository.deleteById(Long.valueOf(id));

	}

	public void updateBook(Book book) {
		bookRepository.save(book);
	}

	public void createBook(Book book) {
		bookRepository.save(book);
	}

	public Optional<Book> getBookById(Long id) {
		return bookRepository.findById(id);
	}

}
