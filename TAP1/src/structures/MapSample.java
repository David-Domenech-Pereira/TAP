package structures;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by pedro on 9/9/15.
 */
public class MapSample { //es un hashmap
    public static void main(String args[]){
        Person p1 = new Person("111","pedro",1);
        Person p2 = new Person("222","pep",2);
        Person p3 = new Person("333","pere",3);

        Map<String,Person> persons = new HashMap<String,Person>();
        persons.put(p1.getDni(),p1); //con el put añadimos una persona
        persons.put(p2.getDni(), p2);
        persons.put(p3.getDni(), p3);

        System.out.println(persons.get("222")); //con el get obtenemos una persona por la clave


    }
}
