
package com.mycompany.cesar;

import java.util.Objects;

public class Section {
    private String course_id;
    private int sec_id;
    private String semester;
    private int year;
    private String building;
    private int room_number;
    private String time_slot_id;

    public Section(String course_id, int sec_id, String semester, int year, String building, int room_number, String time_slot_id) {
        this.course_id = course_id;
        this.sec_id = sec_id;
        this.semester = semester;
        this.year = year;
        this.building = building;
        this.room_number = room_number;
        this.time_slot_id = time_slot_id;
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

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getTime_slot_id() {
        return time_slot_id;
    }

    public void setTime_slot_id(String time_slot_id) {
        this.time_slot_id = time_slot_id;
    }
    
   @Override
    public String toString() {
     return "Section{"+"course_id="+ course_id + ", sec_id=" +
             sec_id +", semester="+ semester + ", year=" + year + 
             ", building=" + building + ", room_number=" + room_number+
             ", time_slot_id="+ time_slot_id+'}';
    }
}
