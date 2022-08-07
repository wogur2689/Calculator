package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    /* */
    public void math() {

    }

    /* 더하기 */
    public int plus(int a, int b) {
        return a + b;
    }
    /* 빼기 */
    public int minus(int a, int b) {
        return a - b;
    }
    /* 곱하기 */
    public int mult(int a, int b) {
        return a * b;
    }
    /* 나누기 */
    public int quotient(int a, int b) {
        return a / b;
    }
    /* 나머지 */
    public int remainder(int a, int b) {
        return a % b;
    }
    /* 계산 초기화 */
}
