/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie;

/**
 *
 * @author Wyatt Morgan
 */
public class Movie {
    private String title;
    private String director;
    private int duration;
    
    public Movie(String title, String director){
        this.title = title;
        this.director = director;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }
    
    
}