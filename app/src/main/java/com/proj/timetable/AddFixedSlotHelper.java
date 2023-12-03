package com.proj.timetable;

public class AddFixedSlotHelper {


    public String id, commonid, time, lecHour, tutorHour, pracHour, credits, subject, facultyDivA, facultyDivB;

    public AddFixedSlotHelper() {
    }

    public AddFixedSlotHelper(String id, String commonid, String time, String lecHour, String tutorHour, String pracHour, String credits, String subject, String facultyDivA, String facultyDivB) {
        this.id = id;
        this.commonid = commonid;
        this.time = time;
        this.lecHour = lecHour;
        this.tutorHour = tutorHour;
        this.pracHour = pracHour;
        this.credits = credits;
        this.subject = subject;
        this.facultyDivA = facultyDivA;
        this.facultyDivB = facultyDivB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommonid() {
        return commonid;
    }

    public void setCommonid(String commonid) {
        this.commonid = commonid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLecHour() {
        return lecHour;
    }

    public void setLecHour(String lecHour) {
        this.lecHour = lecHour;
    }

    public String getTutorHour() {
        return tutorHour;
    }

    public void setTutorHour(String tutorHour) {
        this.tutorHour = tutorHour;
    }

    public String getPracHour() {
        return pracHour;
    }

    public void setPracHour(String pracHour) {
        this.pracHour = pracHour;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFacultyDivA() {
        return facultyDivA;
    }

    public void setFacultyDivA(String facultyDivA) {
        this.facultyDivA = facultyDivA;
    }

    public String getFacultyDivB() {
        return facultyDivB;
    }

    public void setFacultyDivB(String facultyDivB) {
        this.facultyDivB = facultyDivB;
    }
}
