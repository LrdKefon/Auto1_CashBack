package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountBelowBoundary() {
        int actual = service.remain(999);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void amountAboveBoundary() {
        int actual = service.remain(1001);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void amountEqualBoundary() {
        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}