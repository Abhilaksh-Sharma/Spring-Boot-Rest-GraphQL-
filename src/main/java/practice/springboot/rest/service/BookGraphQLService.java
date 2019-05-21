package practice.springboot.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import practice.springboot.rest.model.Book;
import practice.springboot.rest.repository.BookRepository;

@Service
@GraphQLApi
public class BookGraphQLService {
	
	@Autowired
	private BookRepository bookRepository;

	@GraphQLQuery(name = "books")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	@GraphQLMutation
	public String createBook(long id, String title, String isbn, int pageCount) {
		bookRepository.save(new Book(id,title,isbn,pageCount));
		return "Created Successfully";
	}

}
