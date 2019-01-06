package com.company;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TwoStringsTest {

    @Test
    public void canAdd() {

        //given
        TwoStrings twoStr = new TwoStrings("one", "two");
        TwoStrings twoStr2 = new TwoStrings("onE" ,"two");

        //when
        String result =twoStr.add();
        String result2 = twoStr2.add();

        //then
        assertEquals("onetwo",result);
        assertEquals("onEtwo" ,result2);
    }

    @Test
    public void canSubtract() {
        //given
        TwoStrings twoStr = new TwoStrings("David","Per");
        TwoStrings oneIsShorter = new TwoStrings("Per","David");
        TwoStrings equalSize = new TwoStrings("Per","Six");
        //when
        String result = twoStr.subtract();
        String result2 = oneIsShorter.subtract();
       String result3 = equalSize.subtract();
        //then
        assertEquals("id",result);
        assertEquals("id",result2);
        assertEquals("",result3);

    }
}