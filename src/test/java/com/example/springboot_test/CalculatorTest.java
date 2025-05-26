package com.example.springboot_test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("使用 beforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("使用 afterAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("使用 beforeEach");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("使用 afterEach");
    }

    @Disabled
    @Test
    public void test() {
        Calculator calculator = new Calculator();

        int result = calculator.add(1, 2);

        assertEquals(3, result);

        System.out.println("驗證加法");
    }

    @DisplayName("測試 test2")
    @Test
    public  void test2() {
        System.out.println("執行 test2");
    }
}