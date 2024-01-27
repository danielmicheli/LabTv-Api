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
@Table(name = "star")
public class Star {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
	

	@Column(name = "star_name")
	private String starName;
	
	@Column(name = "star_surname")
	private String starSurname;
	
	@Column(name = "star_bio")
	private String starBio;
	
	@OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER,orphanRemoval = true,mappedBy="star")
	@JsonBackReference
	private List<Film> films = new ArrayList<>();
	
	// Metodi getter e setter per "id"
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		// Metodi getter e setter per "starName"
		public String getStarName() {
			return starName;
		}

		public void setStarName(String starName) {
			this.starName = starName;
		}
		
		public String getStarSurname() {
			return starSurname;
		}

		public void setStarSurname(String starSurname) {
			this.starSurname = starSurname;
		}

		
		public String getStarBio() {
			return starBio;
		}

		public void setStarBio(String starBio) {
			this.starBio = starBio;
		}

		
		public List<Film> getFilms() {
			return films;
		}
		
		public void setFilms(List<Film> films) {
			this.films = films;
		}

}
