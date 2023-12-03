package com.proj.timetable;

public class AddDetailsHelper {

    public String id, commonid, lecturehour, tutoriralhour, practicalhour, credits, subjects, facultyAdiv, facultyBdiv;

    public AddDetailsHelper() {
    }

    public AddDetailsHelper(String id, String commonid, String lecturehour, String tutoriralhour, String practicalhour, String credits, String subjects, String facultyAdiv, String facultyBdiv) {
        this.id = id;
        this.commonid = commonid;
        this.lecturehour = lecturehour;
        this.tutoriralhour = tutoriralhour;
        this.practicalhour = practicalhour;
        this.credits = credits;
        this.subjects = subjects;
        this.facultyAdiv = facultyAdiv;
        this.facultyBdiv = facultyBdiv;
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

    public String getLecturehour() {
        return lecturehour;
    }

    public void setLecturehour(String lecturehour) {
        this.lecturehour = lecturehour;
    }

    public String getTutoriralhour() {
        return tutoriralhour;
    }

    public void setTutoriralhour(String tutoriralhour) {
        this.tutoriralhour = tutoriralhour;
    }

    public String getPracticalhour() {
        return practicalhour;
    }

    public void setPracticalhour(String practicalhour) {
        this.practicalhour = practicalhour;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getFacultyAdiv() {
        return facultyAdiv;
    }

    public void setFacultyAdiv(String facultyAdiv) {
        this.facultyAdiv = facultyAdiv;
    }

    public String getFacultyBdiv() {
        return facultyBdiv;
    }

    public void setFacultyBdiv(String facultyBdiv) {
        this.facultyBdiv = facultyBdiv;
    }
}