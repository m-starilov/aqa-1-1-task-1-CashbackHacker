package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(850);
        int expected = 150;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotCalculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
