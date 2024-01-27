package com.labtv.service;
import java.util.List;
import com.labtv.model.Film;

public interface FilmService {

	Film getFilmById(String id);
	
	List<Film> getFilmByTitle(String title);
}
