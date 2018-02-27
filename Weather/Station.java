import java.util.*;
import java.net.*;
import java.io.*;

public class Station
{
    private String name;
    private List<Observation> observations;

    public Station(String name){
        this.name = name;
        observations = new ArrayList<>();
    }

    public void loadObservations() throws Exception{
        URI uri = new URI("https://www.metoffice.gov.uk/pub/data/weather/uk/climate/stationdata/durhamdata.txt");
        URL url = uri.toURL();
        InputStream in = url.openStream();
        Scanner urlsc = new Scanner(in);
        for(int i = 0; i<8; i++){
            urlsc.nextLine();
        }

        while(urlsc.hasNextLine()){
            String line = urlsc.nextLine();
            Observation o = Observation.fromHistoryLine(line);
            observations.add(o);
        }
    }

    public int totalafYear(int year){
        int aftotal = 0;
        for(Observation o: observations){
            if(o.getYear()==year){
                aftotal += o.getAirfrost();
            }
        }
        return aftotal;
    }

    public double totalrainYear(int year){
        double raintotal = 0;
        for(Observation o: observations){
            if(o.getYear()==year){
                raintotal += o.getRain();
            }
        }
        return raintotal;
    }

    public static void main(String[] args) throws Exception{
        int year = 0;
        if(args.length > 0 ){
            year = Integer.parseInt(args[0]);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome user");
        if(year ==0 ){
            System.out.println("Which year are you interested in?");
            year = in.nextInt();
        }
        Station durham = new Station("Durham");
        durham.loadObservations();

        System.out.println("frost or rain?");
        String input = in.next();
        switch(input){
            case "frost":
            System.out.println("Air frost days in " + year + " = " + durham.totalafYear(year));

            case "rain":
            System.out.println("Rainfall days in " + year + " = " + durham.totalrainYear(year));

        }

    }
}
