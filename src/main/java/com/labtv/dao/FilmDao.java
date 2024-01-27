package com.labtv.dao;
import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.labtv.model.Film;



public interface FilmDao extends CrudRepository<Film, String>{
	
	List<Film> findByTitleContaining(String title);

}

