package com.labtv.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labtv.dao.FilmDao;
import com.labtv.dao.TrailerDao;
import com.labtv.model.Film;
import com.labtv.model.Trailer;

@Service
public class TrailerImpl implements TrailerService {

	@Autowired
	private TrailerDao trailerDao;
	
	@Override
	public Trailer getTrailerByIdFilm(String id_film) {
		
		Optional<Trailer> trailerOptional = trailerDao.findByFilmId(id_film);
		if(!trailerOptional.isPresent())
		return new Trailer();
		Trailer trailer = trailerOptional.get();
		
		return trailer;
	}
}
