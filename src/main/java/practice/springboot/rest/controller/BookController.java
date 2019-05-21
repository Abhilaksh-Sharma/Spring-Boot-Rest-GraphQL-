package practice.springboot.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import practice.springboot.rest.model.Book;
import practice.springboot.rest.service.BookService;

@ComponentScan
@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}

	
	@PostMapping("/book/{id}/{title}/{isbn}/{pageCount}")
	public void postBook(@PathVariable String id, @PathVariable String title, @PathVariable String isbn,
			@PathVariable String pageCount) {
		bookService.createBook(new Book(Long.valueOf(id), title, isbn, Integer.valueOf(pageCount)));
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/bookDelete/{id}")
	public void deleteBook(@PathVariable String id) {
		bookService.deleteBook(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/bookUpdate/{id}/{title}/{isbn}/{pageCount}")
	public void updateBook(@PathVariable String id, @PathVariable String title, @PathVariable String isbn,
			@PathVariable String pageCount) {
		bookService.updateBook(new Book(Long.valueOf(id), title, isbn, Integer.valueOf(pageCount)));
	}
	
	@GetMapping("/bookId/{id}")
	public Optional<Book> getBookById(@PathVariable String id) {
		return bookService.getBookById(Long.valueOf(id));
	}

	@GetMapping("/bookTitle/{title}")
	public Book getBookByTitle(@PathVariable String title) {
		System.out.println("Request recieved");
		return bookService.getBookByTitle(title);
	}

	@GetMapping("/bookIsbn/{isbn}")
	public Book getBookByIsbn(@PathVariable String isbn) {
		return bookService.getBookByTitle(isbn);
	}

	@GetMapping("/book/{pageCount}")
	public List<Book> getBookByPageCount(@PathVariable String pageCount) {
		return bookService.getBookByPageCount(Integer.parseInt(pageCount));
	}
}
