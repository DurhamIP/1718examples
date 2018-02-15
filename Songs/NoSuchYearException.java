
public class NoSuchYearException extends Exception
{
    private int year;
    
    public NoSuchYearException(int y){
        
        year = y;
    }
}
