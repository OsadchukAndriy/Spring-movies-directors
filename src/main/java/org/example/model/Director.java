package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Director")
public class Director {
    @Id
    @Column(name="director_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int directorId;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

   @OneToMany
   @JoinColumn(name = "director")
   private List<Movie> directors;

    public Director() {
    }

    public Director(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Movie> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Movie> directors) {
        this.directors = directors;
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Director{" +
                "directorId=" + directorId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
