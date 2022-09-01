public class Airplane {

    //fields
    private String type;
    private int capacity;

    //contructor tanpa parameter
    public Airplane(){
        System.out.printf("Constructor () invoke ...%n");
    }

    //constructor dengan parameter
    public Airplane(String type, int capacity){
        this.type = type;
        this.capacity = capacity;
    }

    //method
    public void startEngine(){
        System.out.printf("Airplane engine started ...%n");
    }

    //method
    public void takeOff(){
        System.out.printf("Airplane take off ...%n");
    }

    //method
    public void landing(){
        System.out.printf("Airplane landing ...%n");
    }

    //method
    public void shutdownEngine(){
        System.out.printf("Airplane engine shutdown ...%n");
    }

    //method
    public void showDetail(){
        System.out.printf("Tipe pesawat\t: %s%n", this.type);
        System.out.printf("Kapasitas\t: %d%n",this.capacity);
    }
}
