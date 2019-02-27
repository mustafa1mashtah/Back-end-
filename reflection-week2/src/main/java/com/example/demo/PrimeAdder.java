package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
@RequiredArgsConstructor


public class PrimeAdder {
    private final Primes primes;


    public Integer getSum(Integer numberOfPrimes) {
        return IntStream.iterate(2, n -> n + 1)
                .filter(primes::isPrime)
                .limit(numberOfPrimes)
                .sum();

    }
}
