
package puntotres;

import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Grade> grades;
    private ArrayList<Module> takes;

    public Student(String name, ArrayList<Module> takes) {
        this.name = name;
        this.takes = takes;
        this.grades = new ArrayList<>();
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

    public ArrayList<Module> getTakes() {
        return takes;
    }

    public void setTakes(ArrayList<Module> takes) {
        this.takes = takes;
    }
    
    
    
    
   
            
}
