package com.labtv.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "film")
public class Film {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
	

	@Column(name = "image")
	private String image;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "plot")
	private String plot;
	
	@ManyToOne
    @JoinColumn(name = "fk_star",referencedColumnName = "id")
	@JsonManagedReference
	private Star star;
	
	@ManyToOne
    @JoinColumn(name = "fk_director",referencedColumnName = "id")
	@JsonManagedReference
	private Director director;
	
	@ManyToOne
    @JoinColumn(name = "fk_genre",referencedColumnName = "id")
	@JsonManagedReference
	private Genre genre;
	
	@ManyToOne
    @JoinColumn(name = "fk_similar",referencedColumnName = "id")
	@JsonManagedReference
	private Similar similar;
	
	@OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER,orphanRemoval = true,mappedBy="film")
	@JsonBackReference
	private List<Trailer> trailers = new ArrayList<>();
	
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

		// Metodi getter e setter per "star"
		public Star getStar() {
			return star;
		}

		public void setStar(Star star) {
			this.star = star;
		}

		// Metodi getter e setter per "director"
		public Director getDirector() {
			return director;
		}

		public void setDirector(Director director) {
			this.director = director;
		}

		// Metodi getter e setter per "genre"
		public Genre getGenre() {
			return genre;
		}

		public void setGenre(Genre genre) {
			this.genre = genre;
		}
		
		public Similar getSimilar() {
			return similar;
		}

		public void setSimilar(Similar similar) {
			this.similar = similar;
		}
	
}
