
public class Song
{
    private int year;
    private String genre;
    private String name;
    private int tempo; // bpm
    private Artist artist;

    public Song(String songName, Artist a){
        name = songName;
        artist = a;
    }

    public Song(String songName, String artistName){
        name = songName;
        artist = new Artist(artistName);
    }

    public String getName(){
        return name;
    }

    public String getArtistName(){
        return artist.getName();
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
        System.out.println("Artist:" + artist.getName());
    }

}
