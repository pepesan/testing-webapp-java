package com.cursosdedesarrollo.app;


import org.junit.Test;

/**
 * Created by pepesan on 8/6/15.
 */

public class SuiteTwo {
        private void println(String string) {
                System.out.println(string);
        }
        @Test
        public void test2() {
                this.println("@Test test2()");
        }
}
