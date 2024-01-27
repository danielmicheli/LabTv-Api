package com.labtv.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.labtv.model.FilmEvidenza;
import com.labtv.service.FilmEvidenzaService;



@RestController
@RequestMapping("/labtv-api")
public class FilmEvidenzaController {

	
	  @Autowired 
	  private FilmEvidenzaService filmEvidenzaService;
	  
	  // http://localhost:8080/labtv-api/api/evidenze
	  
	  @GetMapping("/api/evidenze") 
	  public List<FilmEvidenza> getFilmEvidenza(){
		  
		  return filmEvidenzaService.getFilmEvidenza();
	  }
	 
		
		
		
		
		
}

