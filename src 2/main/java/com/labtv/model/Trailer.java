package com.labtv.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "trailer")
public class Trailer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
	
	@ManyToOne
    @JoinColumn(name = "id_film",referencedColumnName = "id")
	//@JsonManagedReference
	private Film film;
	
	@Column(name = "video_url")
	private String videoUrl;
	
	 @JsonIgnore
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	@JsonIgnore
	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	// Metodi getter e setter per "videoUrl"
	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	

}
