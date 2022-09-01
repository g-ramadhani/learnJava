import java.util.Scanner;

/**
 * StudentRegistration
 */
public class StudentRegistration {

    //Field
    private School school = new School();
    private Classroom classroom = new Classroom();
    private Student[] students;

    //Constructor
    public StudentRegistration(){}

    //Method Read Data
    public void readData(){
        Scanner scanner = new Scanner(System.in);
        String inputData;
        Student student;
        int studentsSize, count;
        
        //Read School Info
        System.out.printf("%nProgram Mengelola Data Pelajar%n");
        System.out.printf("%nInformasi Sekolah%n");
        
        System.out.printf("Nama\t: ");
        inputData = scanner.nextLine();
        school.setName(inputData);

        System.out.printf("Alamat  : ");
        inputData = scanner.nextLine();
        school.setAddress(inputData);

        //Read Class Info
        System.out.printf("%nInformasi Kelas%n");

        System.out.printf("Tingkat (SD / SMP / SMA) : ");
        inputData = scanner.nextLine();
        classroom.setLevel(inputData);

        System.out.printf("Nama : ");
        inputData = scanner.nextLine();
        classroom.setName(inputData);

        System.out.printf("Jumlah Pelajar : ");
        inputData = scanner.nextLine();
        studentsSize = Integer.parseInt(inputData);

        //Create Array Object
        students = new Student[studentsSize];

        //Read Students Info
        for (count = 0;count < studentsSize;count++){
            student = new Student();
            System.out.printf("%nPelajar Ke-%d%n",count+1);

            System.out.printf("NISN : ");
            inputData = scanner.nextLine();
            student.setNisn(inputData);

            System.out.printf("Nama : ");
            inputData = scanner.nextLine();
            student.setName(inputData);

            System.out.printf("Jenis Kelamin (Laki-laki / Perempuan) : ");
            inputData =scanner.nextLine();
            student.setGender(inputData);

            System.out.printf("Alamat : ");
            inputData = scanner.nextLine();
            student.setAddress(inputData);

             //Input Data Student to Array
             students[count] = student;
        }
    }

    //Method Sorting Data
    public void sortingData(){
        Student studentTemp;
        String studentName1, studentName2;
        int studentsSize = students.length, count;
        boolean kondisi = true;

        while (kondisi) {
            kondisi = false;
            for (count = 0;count < studentsSize-1;count++){
                studentName1 = students[count].getName();
                studentName2 = students[count+1].getName();
                if (studentName1.compareToIgnoreCase(studentName2) > 0){
                    studentTemp = students[count];
                    students[count] = students[count+1];
                    students[count+1] = studentTemp;
                    kondisi = true;
                }
            }
        }
    }

    //Method Show Data
    public void showData(){
        Student student;
        int studentsSize = students.length, count;

        System.out.printf("%nInformasi Sekolah%n");
        System.out.printf("Nama\t: %s%n", school.getName());
        System.out.printf("Alamat  : %s%n", school.getAddress());

        System.out.printf("%nInformasi Kelas%n");
        System.out.printf("Tingkat : %s%n", classroom.getLevel());
        System.out.printf("Nama\t: %s%n", classroom.getName());

        System.out.printf("%n%-3s %-15s %-14s %-14s %s%n", "No", "NISN", "Nama", "Jenis Kelamin", "Alamat");
        System.out.printf("==================================================================%n");
        for (count = 0;count < studentsSize;count++){
            student = students[count];
            System.out.printf("%-3d %-15s %-14s %-14s %s%n", count+1,  student.getNisn(), student.getName(), student.getGender(), student.getAddress());
        }
        System.out.printf("==================================================================%n");
    }
}
