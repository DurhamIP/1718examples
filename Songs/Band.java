import java.util.*;

public class Band extends Artist
{
    private HashSet<Soloist> members;

    public Band(String name){
        super(name);
        members = new HashSet<>();
    }

    @Override
    public String toString(){
        return "I am a band " + super.toString() +
        " and my members are " + members;
    }

    public void addMember(Soloist m){
        members.add(m);
    }

}
