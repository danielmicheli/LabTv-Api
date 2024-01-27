package com.labtv.model;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Table(name = "director")
public class Director {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
	

	@Column(name = "director_name")
	private String directorName;
	
	@Column(name = "director_surname")
	private String directorSurname;
	
	@Column(name = "director_bio")
	private String directorBio;
	
	
	@OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER,orphanRemoval = true,mappedBy="director")
	@JsonBackReference
	private List<Film> films = new ArrayList<>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getDirectorName() {
		return directorName;
	}
	
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	

	
	public String getDirectorSurname() {
		return directorSurname;
	}

	public void setDirectorSurname(String directorSurname) {
		this.directorSurname = directorSurname;
	}

	
	public String getDirectorBio() {
		return directorBio;
	}

	public void setDirectorBio(String directorBio) {
		this.directorBio = directorBio;
	}
	
	public List<Film> getFilms() {
		return films;
	}
	
	public void setFilms(List<Film> films) {
		this.films = films;
	}

}
