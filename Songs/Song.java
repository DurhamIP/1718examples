import java.io.*;
import java.util.*;

public class Song implements Comparable<Song>
{
    private int year;
    private String genre;
    private String name;
    private int tempo; // bpm

    public Song(String songName){
        name = songName;
    }

    public String getName(){
        return name;
    }

    public void setYear(int year) throws NoSuchYearException{
        if(year<0){
            throw new NoSuchYearException(year);
        }
        else{
            this.year = year;
        }
    }

    public int getYear(){
        return year;
    }

    public void setGenre(String g){
        genre = g;
    }

    public void print(){
        if(genre == null){
            System.out.println("Title: " + name);      
        }
        else{
            System.out.println("Title: " + name + " genre: " + genre);   
        }

        if(isFolk()){
            System.out.println("Folkarama");
        }
    }

    public boolean isFolk(){
        if(genre == null){
            return false;
        }
        String lowercase = genre.toLowerCase();
        return lowercase.contains("folk");
        /*
        if(genre == "folk"){
        return true;
        }
        return false;
         */

    }

    @Override
    public boolean equals(Object s){
        if(this==s){
            return true;
        }
        if(!(s instanceof Song)){
            return false;
        }
        Song song = (Song) s;
        return name.equals(song.name) && year==song.year;
    }

    @Override
    public String toString(){
        return "Wow what a great song " + name;
    }

    public static void main(String[] args){
        String firstname;
        if(args.length > 0){
            firstname = args[0];
        }
        else{
            firstname = "John";
        }
        Song s = new Song(firstname  + " Ball");
        System.out.println(s);
    }

    public int compareTo(Song s){
        return this.year - s.year;
    }

    public void saveToFile(String fname){
        try{
            FileWriter f = new FileWriter(fname);
            f.write(""+year);
            f.write("\n");
            if(genre==null){
                genre="no genre";
            }
            f.write(genre);
            f.write("\n");
            f.write(name);
            f.write("\n");
            f.write(tempo);
            f.write("\n");
            f.close();
        }
        catch(IOException e){
            System.out.println("Oops silly file " + fname);
        }
    }

    public static Song createFromFile(String fname){
        int year = 0;
        try{
            Scanner sc = new Scanner(new File(fname));
            // each token is a line
            sc.useDelimiter("\\n");

            if(sc.hasNextInt()){
                year = sc.nextInt();
            }
            else{
                sc.next();
            }
            String genre = sc.next();
            if(genre.equals("no genre")){
                genre = null;
            }
            String name = sc.next();
            int tempo = 0;
            if(sc.hasNextInt()){
                tempo = sc.nextInt();
            }
            Song s = new Song(name);
            s.setYear(year);
            s.setGenre(genre);
            s.tempo = tempo;

            return s;
        }
        catch(IOException e){
            System.out.println("That did not work");
            return null;
        }
        catch(NoSuchYearException f){
            System.out.println("Bad year: " + year);
            return null;
        }
    }

}
