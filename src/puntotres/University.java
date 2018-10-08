
package puntotres;

import java.util.ArrayList;


public class University {
    private ArrayList<Student> students;
    private ArrayList<Module> modules;

    public University() {
        this.students = new ArrayList<>();
        this.modules = new ArrayList<>();
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

}
