package com.labtv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "evidenza")
public class FilmEvidenza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "rank")
    private Double rank;

    @Column(name = "rankupdown")
    private Double rankUpDown;

    @Column(name = "title")
    private String title;

    @Column(name = "fulltitle")
    private String fulltitle;

    @Column(name = "year")
    private Double year;

    @Column(name = "image")
    private String image;

    @Column(name = "crew")
    private String crew;

    @Column(name = "imdbrating")
    private String imdbrating;

    @Column(name = "imdbratingcount")
    private String imdbratingcount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public Double getRankUpDown() {
        return rankUpDown;
    }

    public void setRankUpDown(Double rankUpDown) {
        this.rankUpDown = rankUpDown;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFulltitle() {
        return fulltitle;
    }

    public void setFulltitle(String fulltitle) {
        this.fulltitle = fulltitle;
    }

    public Double getYear() {
        return year;
    }

    public void setYear(Double year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(String imdbrating) {
        this.imdbrating = imdbrating;
    }

    public String getImdbratingcount() {
        return imdbratingcount;
    }

    public void setImdbratingcount(String imdbratingcount) {
        this.imdbratingcount = imdbratingcount;
    }
}
