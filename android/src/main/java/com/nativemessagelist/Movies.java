package com.nativemessagelist;

import androidx.annotation.NonNull;

import java.util.Objects;

public class Movies {

    private String name;
    private String director;
    private int year;
    private String image;

    public Movies(String name, String director, int year, String image) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movies movies = (Movies) o;
        return year == movies.year && Objects.equals(name, movies.name) && Objects.equals(director, movies.director) && Objects.equals(image, movies.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, director, year, image);
    }
}
