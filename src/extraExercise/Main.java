package extraExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader date = new BufferedReader(new FileReader("files/grades.txt"));
        List<StudentGrade> student = new ArrayList<>();
        String baza;
        while ((baza = date.readLine()) != null) {
            String[] line = baza.split("[|]");
            for (int i = 0; i < line.length; i++) {
                String n = line[0];
                String d = line[1];
                int g = Integer.parseInt(line[2]);
                student.add(new StudentGrade(n, d, g));
            }
        }
        ClassRoom classRoom = new ClassRoom();
        for (StudentGrade stud : student) {
            classRoom.addStudent(stud);
        }
        System.out.println(classRoom.getGradesForDiscipline("Mathematics"));
        System.out.println(classRoom.getGradesForStudent("Utu Arcadius"));
        System.out.println(classRoom.getMaxGrade("Mathematics"));
        System.out.println(classRoom.getMaxGrade());
        System.out.println(classRoom.getAvarageGrade("Computer Science"));
        System.out.println(classRoom.getWrostGrade("Mathematics"));

    }
}