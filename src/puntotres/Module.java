
package puntotres;

import java.util.ArrayList;


public class Module {
    private String lecturer;
    private String name;
    private ArrayList<Grade> grades;

    public Module(String lecturer, String name, ArrayList<Grade> grades) {
        this.lecturer = lecturer;
        this.name = name;
        this.grades = grades;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    
    
            
}
