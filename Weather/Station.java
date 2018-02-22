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
            urlsc.next();
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

   
}
