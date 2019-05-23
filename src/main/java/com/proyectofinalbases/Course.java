package com.proyectofinalbases;

import java.util.Objects;
/*
 * @author Rodrigo Borjas
 */
public class Course {
    private String course_id;
    private String title;
    private String dept_name;
    private int credits;

    public Course(){

}
    public Course(String course_id, String title, String dept_name, int credits) {
        this.course_id = course_id;
        this.title = title;
        this.dept_name = dept_name;
        this.credits = credits;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
