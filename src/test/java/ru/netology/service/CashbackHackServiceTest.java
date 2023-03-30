package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert.*;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void WhenCountingCashbackFromSeveralThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void WhenCashbackIsNotCredited() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    public void WhenExactlyThousandIsSpent() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}