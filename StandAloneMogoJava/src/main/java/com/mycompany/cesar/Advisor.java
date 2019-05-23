
package com.mycompany.cesar;

import java.util.Objects;

public class Advisor {
    private int s_ID;
    private int i_ID;

    public Advisor(int s_ID, int i_ID) {
        this.s_ID = s_ID;
        this.i_ID = i_ID;
    }

    public int getS_ID() {
        return s_ID;
    }

    public void setS_ID(int s_ID) {
        this.s_ID = s_ID;
    }

    public int getI_ID() {
        return i_ID;
    }

    public void setI_ID(int i_ID) {
        this.i_ID = i_ID;
    }
   @Override
    public String toString() {
        return "Advisor{" + "s_ID=" + s_ID + ", i_ID=" + i_ID + '}';
    }
}
