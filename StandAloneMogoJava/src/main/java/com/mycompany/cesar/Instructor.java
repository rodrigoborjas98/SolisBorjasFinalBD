
package com.mycompany.cesar;

import java.util.Objects;

/*
 * @author Rodrigo Borjas
 */
public class Instructor {
    private int ID;
    private String nombre;
    private String deptName;
    private Double salary;

    public Instructor(String nombre, String deptName, Double salary) {
        this.nombre = nombre;
        this.deptName = deptName;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Instructor{" + "nombre=" + nombre + ", deptName=" + deptName + ", salary=" + salary + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.deptName);
        hash = 53 * hash + Objects.hashCode(this.salary);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instructor other = (Instructor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.deptName, other.deptName)) {
            return false;
        }
        if (!Objects.equals(this.salary, other.salary)) {
            return false;
        }
        return true;
    }
    
}
