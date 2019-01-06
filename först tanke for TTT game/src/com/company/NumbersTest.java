package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumbersTest {

    @Test
    public void add() {

        //given
        Numbers nr = new Numbers(3,6);

        //when
        int result = nr.add();

        //then
        assertEquals(9,result);
    }


}