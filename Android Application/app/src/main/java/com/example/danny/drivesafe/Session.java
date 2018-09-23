package com.example.danny.drivesafe;

public class Session {
    public boolean  driveSafe; //good and bad output
    public String date;//unix timestanp
    public float driven; //km driven
    public boolean acidents;

    public Session(boolean driveSafe, float driven, String date) {
        this.driveSafe = driveSafe;
        this.driven = driven;
        this.date = date;
    }

    /*

        public Session(long date) {
            this.date = date;
        }
        */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getDriven() {
        return driven;
    }

    public void setDriven(float driven) {
        this.driven = driven;
    }

    public boolean isAcidents() {
        return acidents;
    }
    public void setDriveSafe(boolean driveSafe) {
        this.driveSafe = driveSafe;
    }

    public boolean isDriveSafe() {
        return driveSafe;
    }

    public void setAcidents(boolean acidents) {
        this.acidents = acidents;
    }
}
