package com.proj.timetable;

import java.util.ArrayList;

public class Algorithm {


    int tutorHour, lecHour;


    public String creditsSubjectOne;
    public String creditsSubjectTwo;
    public String creditsSubjectThree;
    public String creditsSubjectFour;
    public String creditsSubjectFive;
    public String creditsSubjectSix;

    public String divNumbers;

    public String sessionDetails;

    ArrayList<AddDetailsHelper> arrlst;

    public Algorithm(ArrayList<AddDetailsHelper> arrlst){
        this.arrlst = arrlst;
    }

    public Algorithm(String creditsSubjectOne, String creditsSubjectTwo, String creditsSubjectThree, String creditsSubjectFour, String creditsSubjectFive, String creditsSubjectSix, String divNumbers, String sessionDetails, ArrayList<AddDetailsHelper> arrlst) {
        this.creditsSubjectOne = creditsSubjectOne;
        this.creditsSubjectTwo = creditsSubjectTwo;
        this.creditsSubjectThree = creditsSubjectThree;
        this.creditsSubjectFour = creditsSubjectFour;
        this.creditsSubjectFive = creditsSubjectFive;
        this.creditsSubjectSix = creditsSubjectSix;
        this.divNumbers = divNumbers;
        this.sessionDetails = sessionDetails;
        this.arrlst = arrlst;
    }





    public ArrayList<AddDetailsHelper> getTTSlots(){

            for(int i = 0; i < arrlst.size(); i++){

            }



        return arrlst;
    }

}
