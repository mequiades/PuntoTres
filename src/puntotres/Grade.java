
package puntotres;


public class Grade {
    private int mark;
    private Module module;
    private Student student;

    public Grade(int mark, Module module, Student student) {
        this.mark = mark;
        this.module = module;
        this.student = student;
    }

    public int getMark() {
        return mark;
    }

    public Module getModule() {
        return module;
    }

    public Student getStudent() {
        return student;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    
}
