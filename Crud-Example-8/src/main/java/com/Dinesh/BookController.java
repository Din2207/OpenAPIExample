package com.Dinesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	@GetMapping("/allbooks")
	public List<Book> getAllBook(){
		return bookService.retrieve();
	}
	
	@GetMapping("/books/{id}")
	
    public Book getById(@PathVariable String id) {
	return  bookService.getById(id);
}
	
	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updatebook(@PathVariable String id,@RequestBody Book book) {
		Book updatedbook=bookService.putByid(id,book);
		if(updatedbook !=null) {
			return new ResponseEntity<>(updatedbook,HttpStatus.OK);
		}
		else {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable String id) {
		bookService.deleteBook(id);
	}

}
