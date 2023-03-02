package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.BookEntity;
import com.example.demo.Repository.BookRepo;
@Service
public class BookService {
	@Autowired //extends another class
    BookRepo stRepo; //reference variable
	
	public BookEntity saveDetails(BookEntity e) {
		return stRepo.save(e);
	}
	public List <BookEntity>getDetails()

{
		return stRepo.findAll();
		
}
	public BookEntity UpdateDetails(BookEntity e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int id)
	{
		stRepo.deleteById(id);
	}

}