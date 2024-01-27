package com.labtv.model;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "genre")

public class Genre {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
	

	@Column(name = "genre_name")
	private String genreName;
	
	@OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER,orphanRemoval = true,mappedBy="genre")
	@JsonBackReference
	private List<Film> films = new ArrayList<>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getGenreName() {
		return genreName;
	}
	
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
	public List<Film> getFilms() {
		return films;
	}
	
	public void setFilms(List<Film> films) {
		this.films = films;
	}

}
