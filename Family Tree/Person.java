
public class Person
{
    private String name;
    private char gender;
    private java.util.Date dob;
    private Person father;
    private Person mother;
    private Person spouse;
    private double height;
    
    public Person(String name){
        this.name = name;
        height = 1.83;
    }
    
    public void setFather(Person father){
        this.father = father;
    }
    
    public void setMother(Person mother){
        this.mother = mother;
    }
    
    public Person getMother(){
        return mother;
    }
    
    public Person getMaternalGrandmother(){
        return mother.getMother();
    }
}
