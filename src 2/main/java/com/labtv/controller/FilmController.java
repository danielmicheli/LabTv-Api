package com.labtv.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labtv.model.Film;


import com.labtv.service.FilmService;



@RestController
@RequestMapping("/labtv-api")
public class FilmController {
	
	@Autowired 
	  private FilmService filmService;
	  
	  //  http://localhost:8080/labtv-api/api/films/<id>
	  
	  @GetMapping("/api/films/{id}") 
	  public Film getFilmById(@PathVariable("id") String id){
		  
		  return filmService.getFilmById(id);
	  }
	  
	  //  http://localhost:8080/labtv-api/api/films/titoli/<testo-digitato>
	  
	  @GetMapping("/api/films/titoli/{title}") 
	  public List<Film> getFilmByTitle(@PathVariable("title") String title){
		  
		  return filmService.getFilmByTitle(title);
	  }
		
	  

}
