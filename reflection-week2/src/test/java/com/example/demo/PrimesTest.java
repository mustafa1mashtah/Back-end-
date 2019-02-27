package com.example.demo;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class PrimesTest {

    @Autowired
    Primes primes;

    @ParameterizedTest
    @CsvSource({
            "false, 0",
            "false, 1",
            "false, 22",
            "true, 29",
    })
    void testPrime(boolean expected, Integer number) {


        assertEquals(expected, primes.isPrime(number));
    }
}