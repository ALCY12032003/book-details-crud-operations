package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.BookEntity;
import com.example.demo.Service.BookService;

@RestController
public class BookController {
	@Autowired //extends another class
         BookService stuService;
	
	@PostMapping("/addDetails")
	
	public BookEntity addInfo(@RequestBody BookEntity st) {
		return stuService.saveDetails(st);
	}
	@GetMapping("/showDetails")
	public List<BookEntity>fetchDetails()
	{
		return stuService.getDetails();
	}
	@PutMapping("/UpdateDetails")
	public BookEntity UpdateInfo(@RequestBody BookEntity st1)
	{
		return stuService.UpdateDetails(st1);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id")int id)
	{
		stuService.deleteDetails(id);
		return "Deleted details";
	}
}