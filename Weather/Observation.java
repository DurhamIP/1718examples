import java.util.*;

/** 
 **
 ** Represent historical weather observations 
 ** as provided by https://www.metoffice.gov.uk/public/weather/climate-historic/#?tab=climateHistoric
 */
public class Observation
{
    private int year;
    private int month;
    private Double tmax;
    private Double tmin;
    private Integer airfrost;
    private Double rain;
    private Double sun;

    public Observation(){

    }

    public Observation(int year, int month, double tmax, double tmin){
        this.year = year;
        this.month = month;
        this.tmax = tmax;
        this.tmin = tmin;
    }

    public double getSun() {
        return sun;
    }

    public void setSun(double sun) {
        this.sun = sun;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public int getAirfrost() {
        return airfrost;
    }

    public void setAirfrost(int airfrost) {
        this.airfrost = airfrost;
    }

    public double getTmin() {
        return tmin;
    }

    public void setTmin(double tmin) {
        this.tmin = tmin;
    }

    public double getTmax() {
        return tmax;
    }

    public void setTmax(double tmax) {
        this.tmax = tmax;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static Observation fromHistoryLine(String text){
        try{
            Observation o = new Observation();
            Scanner lsc = new Scanner(text);
            o.setYear(lsc.nextInt());
            o.setMonth(lsc.nextInt());
            if(lsc.hasNextDouble()){
                o.setTmax(lsc.nextDouble());
            }
            else{
                lsc.next();   
            }
            if(lsc.hasNextDouble()){
                o.setTmin(lsc.nextDouble());
            }
            else{
                lsc.next();   
            }
            if(lsc.hasNextInt()){
                o.setAirfrost(lsc.nextInt());
            }
            else{
                lsc.next();   
            }
            if(lsc.hasNextDouble()){
                o.setRain(lsc.nextDouble());
            }
            else{
                lsc.next();   
            }
            return o;
        }
        catch(InputMismatchException e){
            System.out.println("problem with " + text);
            throw e;
        }

    }
}
