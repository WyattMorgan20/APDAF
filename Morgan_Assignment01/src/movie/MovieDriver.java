/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movie;

/**
 *
 * @author Wyatt Morgan
 */
public class MovieDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        
        // movie1 getters and setters for printing:
        movie1.setTitle("Mission Impossible: Ghost Protocol");
        movie1.setDirector("Brad Bird");
        movie1.setDuration(133);
        
        System.out.println("Title: " + movie1.getTitle());
        System.out.println("Director: " + movie1.getDirector());
        System.out.println("Total Duration: " + movie1.getDuration() + " minutes.");
        
        System.out.println("");
        
        // movie2 getters and setters for printing:
        movie2.setTitle("The Man from U.N.C.L.E.");
        movie2.setDirector("Guy Ritchie");
        movie2.setDuration(116);
        
        System.out.println("Title: " + movie2.getTitle());
        System.out.println("Director: " + movie2.getDirector());
        System.out.println("Total Duration: " + movie2.getDuration() + " minutes.");
        
    }
    
}
