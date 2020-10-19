package extraExercise;

public class StudentGrade {
    String name;
    String discipline;
    int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }
    public String getDiscipline(){
        return discipline;
    }
    public int getGrade(){
        return grade;
    }

    public String toString(){
        return  name+" "+discipline+" "+grade+"\n";
    }
}
