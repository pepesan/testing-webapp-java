package com.cursosdedesarrollo.app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by pepesan on 8/6/15.
 */
public class TestMatchers {
    @Test
    public void testWithMatch() {
        assertThat("this string", is("this string"));
        assertThat(123, is(123));
    }
    @Test
    public void testWithNotMatch() {

        assertThat(123, not(is(345)) );

    }
    @Test
    public void testEquals() {
        String s=new String();
        assertThat(s, equalTo(s));
    }
    @Test
    public void testAnything() {
        String s=new String();
        assertThat(s, equalTo(s));
    }

    @Test
    public void testAny(){
        assertThat("Hola", is(equalTo("Hola")));
        assertThat("Hola", is(not(equalTo("Holas"))));
        assertThat("Hola", containsString("Ho"));
        //assertEquals("abc", 123);
        assertThat("test", anyOf(is("test"), containsString("te")));
        //assertThat(new String[] {"test3", "test4"}, is(new String[] {"test1", "test2"}));
        assertThat(true, is(true));
        assertThat(false, is(false));
        assertThat(null, nullValue());
        assertThat("No null", notNullValue());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testForExceptions1() {

        throw  new IllegalArgumentException();
    }
}
