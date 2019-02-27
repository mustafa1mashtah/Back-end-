package com.example.demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PrimeAdderTest {
    @Autowired
    PrimeAdder primeAdder;


    @ParameterizedTest
    @CsvSource({
            "129, 10",
            "24133, 100",

    })
    void testPrime(Integer expected, Integer number) {


        assertEquals(expected, primeAdder.getSum(number));
    }
}