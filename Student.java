/**
 * Student
 */
public class Student {
    
    //Field
    private String nisn;
    private String name;
    private String gender;
    private String address;

    //Constructor
    public Student(){}

    //Method Set NISN
    public void setNisn(String nisn){
        this.nisn = nisn;
    }

    //Method Get NISN
    public String getNisn(){
        return this.nisn;
    }

    //Method Set Name
    public void setName(String name){
        this.name = name;
    }

    //Method Get Name
    public String getName(){
        return this.name;
    }

    //Method Set Gender
    public void setGender(String gender){
        this.gender = gender;
    }

    //Method Get Gender
    public String getGender(){
        return this.gender;
    }

    //Method Set Address
    public void setAddress(String address){
        this.address = address;
    }

    //Method Get Address
    public String getAddress(){
        return this.address;
    }
}
