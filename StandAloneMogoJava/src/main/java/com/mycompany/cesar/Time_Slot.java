
package com.mycompany.cesar;

import java.util.Objects;

public class Time_Slot {
    private String time_slot_id;
    private String day;
    private int start_hr;
    private int start_min;
    private int end_hr;
    private int end_min;

    public Time_Slot(String time_slot_id, String day, int start_hr, int start_min, int end_hr, int end_min) {
        this.time_slot_id = time_slot_id;
        this.day = day;
        this.start_hr = start_hr;
        this.start_min = start_min;
        this.end_hr = end_hr;
        this.end_min = end_min;
    }

    public String getTime_slot_id() {
        return time_slot_id;
    }

    public void setTime_slot_id(String time_slot_id) {
        this.time_slot_id = time_slot_id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getStart_hr() {
        return start_hr;
    }

    public void setStart_hr(int start_hr) {
        this.start_hr = start_hr;
    }

    public int getStart_min() {
        return start_min;
    }

    public void setStart_min(int start_min) {
        this.start_min = start_min;
    }

    public int getEnd_hr() {
        return end_hr;
    }

    public void setEnd_hr(int end_hr) {
        this.end_hr = end_hr;
    }

    public int getEnd_min() {
        return end_min;
    }

    public void setEnd_min(int end_min) {
        this.end_min = end_min;
    }
    
   @Override
    public String toString() {
        return "Time_Slot{" + "time_slot_id=" + time_slot_id + ", day=" + day + ", start_hr=" + start_hr + ", start_min="+ start_min + ", end_hr="+ end_hr +", ="+ end_min +'}';    }
}
