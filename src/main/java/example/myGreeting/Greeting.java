package example.myGreeting;

import java.util.ArrayList;
import java.util.List;

public class Greeting {

    private final long id;
    private final String content;
    private final List<String> greetings;



    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
        this.greetings = new ArrayList<>();
    }

    public long getId(){
        return id;
    }   

    public String getContent(){
        return content;
    }   

    public List<String> getGreetings(){
        return greetings;
    }





}
