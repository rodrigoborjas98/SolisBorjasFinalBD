
package com.mycompany.cesar;

import java.util.Objects;

public class Teaches {
    private int ID;
    private String course_id;
    private int sec_id;
    private String semester;
    private int year;

    public Teaches(int ID, String course_id, int sec_id, String semester, int year) {
        this.ID = ID;
        this.course_id = course_id;
        this.sec_id = sec_id;
        this.semester = semester;
        this.year = year;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public int getSec_id() {
        return sec_id;
    }

    public void setSec_id(int sec_id) {
        this.sec_id = sec_id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
   @Override
    public String toString() {
        return "Teaches{" + "ID=" + ID + ", course_id=" +course_id+ ", sec_id=" + sec_id + ", semester="+ semester +", year="+ year + '}';
    }
}
