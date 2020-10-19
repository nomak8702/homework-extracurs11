package extraExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassRoom {
    List<StudentGrade> students = new ArrayList<>();

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade stud : students) {
            if (stud.getDiscipline().equalsIgnoreCase(discipline)) {
                result.add(stud.getGrade());
            }
        }
        return result;
    }

    public List<StudentGrade> getGradesForStudent(String student) {
        List<StudentGrade> result = new ArrayList<>();
        for (StudentGrade stud : students) {
            if (stud.getName().equalsIgnoreCase(student)) {
                result.add(stud);
            }
        }
        return result;
    }

    public List<StudentGrade> getMaxGrade(String discipline) {
        List<Integer> maxi = new ArrayList<>();
        List<StudentGrade> disciplin = new ArrayList<>();
        List<StudentGrade> result = new ArrayList<>();
        for (StudentGrade studi : students) {
            if (studi.getDiscipline().equalsIgnoreCase(discipline)) {
                disciplin.add(studi);
            }
        }
        for (StudentGrade studi : disciplin) {
            maxi.add(studi.getGrade());
        }
        for (StudentGrade stud : disciplin) {
            if (stud.getGrade() == Collections.max(maxi)) {
                result.add(stud);
            } else {

            }
        }
        return result;
    }

    public List<StudentGrade> getMaxGrade() {
        List<Integer> maxi = new ArrayList<>();
        List<StudentGrade> result = new ArrayList<>();
        for (StudentGrade studi : students) {
            maxi.add(studi.getGrade());
        }
        for (StudentGrade stud : students) {
            if (stud.getGrade() == Collections.max(maxi)) {
                result.add(stud);
            } else {

            }
        }
        return result;
    }

    public int getAvarageGrade(String discipline) {

        List<Integer> result = new ArrayList<>();
        for (StudentGrade stud : students) {
            if (stud.getDiscipline().equalsIgnoreCase(discipline)) {
                result.add(stud.getGrade());
            }
        }
        int sum = 0;
        int avarage = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
            avarage = sum / result.size();
        }

        return avarage;

    }

    public List<StudentGrade> getWrostGrade(String discipline) {
        List<Integer> maxi = new ArrayList<>();
        List<StudentGrade> disciplin = new ArrayList<>();
        List<StudentGrade> result = new ArrayList<>();
        for (StudentGrade studi : students) {
            if (studi.getDiscipline().equalsIgnoreCase(discipline)) {
                disciplin.add(studi);
            }
        }
        for (StudentGrade studi : disciplin) {
            maxi.add(studi.getGrade());
        }
        for (StudentGrade stud : disciplin) {
            if (stud.getGrade() == Collections.min(maxi)) {
                result.add(stud);
            } else {

            }
        }
        return result;
    }

    public void addStudent(StudentGrade studentList) {
        students.add(studentList);
    }
}
