package com.danny;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class OperacionTest {

    Double x;
    Double y;
    Double z;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        x = 10.0;
        y = 5.0;
    }

    @Test
    public void sumaTest() {
        Suma suma = new Suma (x, y);
        assertEquals (15, suma.getRes ());
    }

    @Test
    public void restaTest() {
        Resta resta = new Resta (x, y);
        assertEquals (5, resta.getRes ());
    }

    @Test
    public void divTest() {
        Division div = new Division (x, y);
        assertEquals (2, div.getRes ());
    }

    @Test
    public void divTestNull() {
        assertThrows (NullPointerException.class, () ->
                new Division (x, z));
    }

    @Test
    public void divTestZero() {
        z = 0.0;
        assertThrows (IllegalArgumentException.class, () ->
                new Division (x, z));
    }

    @Test
    public void divisionTest() {
        Division div = new Division (x, y);
        assertEquals (2.0, div.getRes ());
    }

    @Test
    public void divisionTest2() {
        Division div = new Division (x, y);
        assertEquals (2.0, div.getRes ());
    }

    @Test
    public void multTest() {
        Multiplicacion mult = new Multiplicacion (x, y);
        assertEquals (50.0, mult.getRes ());
    }
}