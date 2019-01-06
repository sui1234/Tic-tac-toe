package com.company;

public class TwoStrings {
    private String strOne;
    private String strTwo;

    public TwoStrings(String one, String two) {

        this.strOne = strOne;
        this.strTwo = strTwo;
    }

    public String add(){
        return strOne + strTwo;
    }

    public String subtract(){
        if(strTwo.length() >= strOne.length())
        return strTwo.substring(strOne.length());

        return strOne.substring(strTwo.length());//börja ta substring från plats(--- strTwo.length() == 2)
    }
}


