package com.cursosdedesarrollo.app;

import org.junit.Test;

/**
 * Created by pepesan on 8/6/15.
 */
public class SuiteOne {
    private void println(String string) {
        System.out.println(string);
    }
    @Test
    public void test1() {
        this.println("@Test test1()");
    }
}
