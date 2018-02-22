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
    private double tmax;
    private double tmin;
    private int airfrost;
    private double rain;
    private double sun;

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
        Observation o = new Observation();
        Scanner lsc = new Scanner(text);
        o.setYear(lsc.nextInt());
        o.setMonth(lsc.nextInt());
        o.setTmax(lsc.nextDouble());
        o.setTmin(lsc.nextDouble());
        o.setAirfrost(lsc.nextInt());
        return o;

    }
}
