
package com.mycompany.cesar;

import java.util.Objects;

public class Department {
    private String dept_name;
    private String building;
    private int budget;

    public Department(String dept_name, String building, int budget) {
        this.dept_name = dept_name;
        this.building = building;
        this.budget = budget;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

   @Override
    public String toString() {
        return "Department{" + "dept_name=" + dept_name + ", building=" +  building+ ", budget=" + budget + '}';
    }
}
