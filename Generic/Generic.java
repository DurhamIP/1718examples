// class definition: class name starts upper case
public class Generic
{
    // here are the fields
    // this is a comment
    private int field1;
    private String field2;
    private double field3;
    /* can have as many fields as you want, whatever types or names
    this is a mult-line comment */
    
    // this is a constructor
    public Generic(int param1){
        // this is an assignment
        field1 = param1; 
        // this assigns a default value to a field     
        field2 = "I am generic";
        
        // field3 is not initialised
    }
    
    // this is an accessor method
    public int getField1(){
        return field1;
    }
    
    public void setField1(int newval){
        field1 = newval;
    }
}
