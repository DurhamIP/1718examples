
public class Song
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
    }

}