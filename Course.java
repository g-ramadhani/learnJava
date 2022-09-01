public class Course {

    //field
    private String name;
    private float score;

    //constructor
    public Course(){
        System.out.printf("Course Constructor invoke...%n");
    }

    //method
    public void setName(String name){
        this.name = name;
    }

    //method
    public String getName(){
        return this.name;
    }

    //method
    public void setScore(float score){
        this.score = score;
    }

    //method
    public float getScore(){
        return this.score;
    }
}
