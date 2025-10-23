import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        // ArrayList of Student
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(241511002, "Beni", "Informatics Engineering", "Jl. Komunikasi No. 1"));
        students.add(new Student(241511001, "Alda", "Informatics Engineering", "Jl. Telekomunikasi No. 1"));
        students.add(new Student(241511004, "Dinda", "Machine Engineering", "Jl. Komunikasi No. 2"));
        students.add(new Student(241511005, "Elbara", "Electric Engineering", "Jl. Telekomunikasi No. 3"));
        students.add(new Student(241511003, "Celis", "Informatics Engineering", "Jl. Telekomunikasi No. 2"));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("Hasil ArrayList Student setelah diurutkan namanya: \n");
        for (Student s : students)
        {
            System.out.println("NIM : "+ s.getID()+"\n" +"Nama : "+ s.getName()+"\n" +"Department : "+ s.getDepartment()+"\n" +"Alamat : "+ s.getAddress()+"\n");
        }


        // Vector of Student
        Vector<Student> vsiswa = new Vector<>();
        vsiswa.add(new Student(241511002, "Beni", "Informatics Engineering", "Jl. Komunikasi No. 1"));
        vsiswa.add(new Student(241511001, "Alda", "Informatics Engineering", "Jl. Telekomunikasi No. 1"));
        vsiswa.add(new Student(241511004, "Dinda", "Machine Engineering", "Jl. Komunikasi No. 2"));
        vsiswa.add(new Student(241511005, "Elbara", "Electric Engineering", "Jl. Telekomunikasi No. 3"));
        vsiswa.add(new Student(241511003, "Celis", "Informatics Engineering", "Jl. Telekomunikasi No. 2"));
        System.out.println("Hasil Vector vsiswa yang berada di department IE: \n");
        for (Student s : vsiswa)
        {
            if (s.getDepartment().equalsIgnoreCase("Informatics Engineering"))
            {
                System.out.println("NIM : "+ s.getID()+"\n" +"Nama : "+ s.getName()+"\n" +"Department : "+ s.getDepartment()+"\n" +"Alamat : "+ s.getAddress()+"\n");
            }
        }

    }
}
