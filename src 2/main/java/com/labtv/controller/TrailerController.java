package com.labtv.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.labtv.model.Trailer;
import com.labtv.service.TrailerService;



@RestController
@RequestMapping("/labtv-api")

public class TrailerController {
	@Autowired 
	  private TrailerService trailerService;
	  
	  // http://localhost:8080/labtv-api/api/trailers/<idFilm>
	  
	  @GetMapping("/api/trailers/{id_film}") 
	  public Trailer getTrailerByIdFilm(@PathVariable("id_film") String id_film){
		  
		  return trailerService.getTrailerByIdFilm(id_film);
	  }
}
