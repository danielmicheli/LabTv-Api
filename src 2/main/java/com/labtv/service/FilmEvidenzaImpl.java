package com.labtv.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.labtv.dao.FilmEvidenzaDao;
import com.labtv.model.FilmEvidenza;


@Service
public class FilmEvidenzaImpl implements FilmEvidenzaService{
	
	@Autowired
	private FilmEvidenzaDao filmEvidenzaDao;
	
	@Override
	public List<FilmEvidenza> getFilmEvidenza() {
		
		return (List<FilmEvidenza>) filmEvidenzaDao.findAll();
		
	}
}










	
	
	
	
	