package practice.springboot.rest.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import practice.springboot.rest.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Long>{
	
	Optional<Book> findById(Long id);
	
	Book findByTitle(String title);
	
	Book findByIsbn(String isbn);
	
	List<Book> findByPageCount(int pageCount);

}
