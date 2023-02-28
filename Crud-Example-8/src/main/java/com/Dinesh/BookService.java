package com.Dinesh;

import java.util.List; 
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	private static Logger logger=org.apache.log4j.LogManager.getLogger(BookService.class);

	 
	public Book createBook(Book book) {
		logger.info("Book Created : " + book);
		return bookRepository.save(book);
	}
	public List<Book> retrieve(){
		logger.info("All Books Retrieved By JSON Format ");
		return bookRepository.findAll();
	}
	public Book getById(String id){
		logger.info("Book Readed By Id is : " + id);
		return bookRepository.findById(id).orElse(null);
	} 
	public Book putByid(String id, Book book) {
		Optional<Book> optionalbook=bookRepository.findById(id);
		if(optionalbook.isPresent()) {
			Book NewBook= optionalbook.get();
			Book updatedbook=bookRepository.save(NewBook);
			NewBook.setTitle(book.getTitle());
			NewBook.setAuthor(book.getAuthor());
			@SuppressWarnings("unused")
			Book updatedBook=bookRepository.save(NewBook);
		logger.info("Book Updated By is : " + id);
		return updatedbook;
		}else {
			logger.info("Book Not Updated");
        return null;
       
	}}
        
        public void deleteBook(String id) {
        	logger.info("Book Deleted By Id is : " + id);
        	 bookRepository.deleteById(id);
		}

	

}
