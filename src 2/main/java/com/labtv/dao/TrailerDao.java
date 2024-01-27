package com.labtv.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.labtv.model.Trailer;

public interface TrailerDao extends CrudRepository<Trailer, String>{
	Optional<Trailer> findByFilmId(String id);
}
