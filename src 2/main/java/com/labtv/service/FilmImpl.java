package com.labtv.service;


import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labtv.dao.FilmDao;
import com.labtv.model.Film;




@Service
public class FilmImpl implements FilmService{
	
	@Autowired
	private FilmDao filmDao;
	
	@Override
	public Film getFilmById(String id) {
		
		Optional<Film> filmOptional = filmDao.findById(id);
		if(!filmOptional.isPresent())
			return new Film();
		Film film = filmOptional.get();
		
		return film;
	}
	
	@Override
	public List<Film> getFilmByTitle(String title) {
		
		 List<Film> films = filmDao.findByTitleContaining(title);
		    
		    
		    if (films.isEmpty()) {
				/*
				 * Collections.emptyList();
				 *
				 */
		    	
		        Film noFilmFound = new Film();
		        noFilmFound.setTitle("Nessun film trovato con il titolo: " + title);
		        films.add(noFilmFound);
		    }
		    
		    return films;
	}

}
