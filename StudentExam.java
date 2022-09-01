import java.util.Scanner;

public class StudentExam {
    
    //field
    Student student = new Student();
    Course[] courses;

    //constructor
    public StudentExam(){
        System.out.printf("StudentExam Constructor invoke...%n");
    }

    //method read data
    public void readData(){
        Scanner scanner = new Scanner(System.in); 
        String inputData;
        Course course;
        int courseSize, count;
        float score;

        //read student info from keyboard
        System.out.printf("%nProgram mengelola nilai siswa %n");
        System.out.printf("%nNama Siswa : ");
        inputData = scanner.nextLine();
        student.setName(inputData);

        //read number of courses to be process
        System.out.printf("Jumlah Pelajaran : ");
        inputData = scanner.nextLine();
        courseSize = Integer.parseInt(inputData);
        courses = new Course[courseSize];

        //read courses info
        for (count = 0;count < courseSize;count++){
            course = new Course(); 
            System.out.printf("%nPelajaran ke-%d%n", count+1);
            System.out.printf("Nama  : ");
            inputData = scanner.nextLine();
            course.setName(inputData);

            System.out.printf("Nilai : ");
            inputData = scanner.nextLine();
            score = Float.parseFloat(inputData);
            course.setScore(score);

            //input data to array
            courses[count] = course;
        }
    }

    //method sorting data
    public void SortingData(){
        Course courseTemp;
        int courseSize = courses.length;
        boolean kondisi = true;

        while(kondisi){
            kondisi = false;
            for(int count = 0;count < courseSize-1;count++){
                if (courses[count].getScore() < courses[count+1].getScore()) {
                    courseTemp = courses[count];
                    courses[count] = courses[count+1];
                    courses[count+1] = courseTemp;
                    kondisi = true;
                }
            }
        }
    }
    
    //method show Data
    public void showData(){
        Course course;
        int courseSize = courses.length;

        System.out.printf("%nInformasi Nilai Siswa%n");
        System.out.printf("Nama Siswa : %s%n", student.getName());
        System.out.printf("%nHasil Ujian Pelajaran Siswa diurutkan berdasarkan nilai teritnggi :%n");
        System.out.printf("No  Pelajaran       Nilai%n");
        System.out.printf("=========================%n");

        for (int count = 0;count < courseSize;count++){
            course = courses[count];
            System.out.printf("%3d %-15s %.0f%n", count+1, course.getName(), course.getScore());
        }
        System.out.printf("=========================%n");
    }
}
