import java.util.ArrayList;
import java.util.List;

public class Persona extends Human {
//    public String FullName;

    public Persona(String Name, String Sex, int Age) {
        SetSex(Sex);
        SetName(Name);
        SetAge(Age);
    }

    ArrayList<Persona> listName = new ArrayList<>();

    public void AddName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public void Voice() {
        String name = GetName();
        System.out.println("Меня зовут " + name);
    }
}