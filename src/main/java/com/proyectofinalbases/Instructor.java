
package com.proyectofinalbases;

/*
 * @author Rodrigo Borjas
 */
public class Instructor {
    private String ID;
    private String nombre;
    private String deptName;
    private Double salary;

    public Instructor(){
        
    }
    public Instructor(String id, String nombre, String deptName, Double salary) {
        this.nombre = nombre;
        this.deptName = deptName;
        this.salary = salary;
        this.ID = id;
    }
 
    public String getId() {
        return ID;
    }

    public void setId(String id) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
}
