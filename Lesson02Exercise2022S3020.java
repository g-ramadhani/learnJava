import java.util.Locale;

public class Lesson02Exercise2022S3020 {
    public static void main(String[] args) {
       String name = "Stephen Curry";
       String gender = "Laki-laki";
       int age = 34;
       float height = 1.88f;

       System.out.printf("Info Aktor%n");
       System.out.printf("Nama: %s%n", name);
       System.out.printf("Jenis Kelamin: %s%n", gender);
       System.out.printf("Umur: %d tahun%n", age);
       System.out.printf("Tinggi Badan: %f m%n", height);

       System.out.printf("%nNama idola saya %s, jenis kelamin %s, umur %d tahun, tinggi badan %f m%n", name, gender, age, height);

       System.out.printf("%nInfo Aktor%n");
       System.out.printf("Nama\t\t: %s%n", name);
       System.out.printf("Jenis Kelamin\t: %s%n", gender);
       System.out.printf("Umur\t\t: %d tahun%n", age);
       System.out.printf(new Locale("in","ID"),"Tinggi Badan\t: %,.2f m%n", height);
    }
}
