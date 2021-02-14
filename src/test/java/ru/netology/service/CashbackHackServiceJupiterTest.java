package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJupiterTest {
    @Test
    public void shouldCalculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(100);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCalculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
