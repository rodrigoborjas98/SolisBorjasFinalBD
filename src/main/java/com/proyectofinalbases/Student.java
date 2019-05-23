
package com.proyectofinalbases;
/*
 * @author Rodrigo Borjas
 */
public class Student {
    private String id;
    private String name;
    private String department;
    private int credits;
    private String advisor;
    
    public Student(){
        
    }
    public Student(String id, String name, String department, int credits, String advisor) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.credits = credits;
        this.advisor = advisor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

}
