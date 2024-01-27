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
@Table(name = "similar")

public class Similar {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
	

	@Column(name = "image")
	private String image;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "plot")
	private String plot;
	
	@OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER,orphanRemoval = true,mappedBy="similar")
	@JsonBackReference
	private List<Film> films = new ArrayList<>();

	// Metodi getter e setter per "id"
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		// Metodi getter e setter per "image"
		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		// Metodi getter e setter per "title"
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		// Metodi getter e setter per "plot"
		public String getPlot() {
			return plot;
		}

		public void setPlot(String plot) {
			this.plot = plot;
		}
		
		public List<Film> getFilms() {
			return films;
		}

		public void setFilms(List<Film> films) {
			this.films = films;
		}
}
