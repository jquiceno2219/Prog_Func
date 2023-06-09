package BiFunction;

public class Mechanic {

    private int id;
    private String name;
    private String lastName;


    public Mechanic(int id, String name, String lastName) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Mechanic [id= " + id + "\n name= " + name + "\n lastName= " + lastName + "]\n";
    }
}
