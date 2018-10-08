/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntotres;

/**
 *
 * @author aguil_000
 */
public class University {
    private Student student;
    private Module modules;

    public University(Student student, Module modules) {
        this.student = student;
        this.modules = modules;
    }

    public Student getStudent() {
        return student;
    }

    public Module getModules() {
        return modules;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setModules(Module modules) {
        this.modules = modules;
    }
    
    
}
