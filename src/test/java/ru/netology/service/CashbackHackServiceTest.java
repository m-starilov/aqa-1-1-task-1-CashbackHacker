package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void calculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(850);
        int expected = 150;
        assertEquals(expected, actual);
    }
}
