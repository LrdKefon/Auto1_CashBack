package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountBelowBoundary() {
        int expected = 0;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void amountAboveBoundary() {
        int expected = 1000;
        int actual = service.remain(1001);
        assertEquals(expected, actual);

    }

    @Test
    public void amountEqualBoundary() {
        int expected = 1000;
        int actual = service.remain(1000);
        assertEquals(expected, actual);

    }
}