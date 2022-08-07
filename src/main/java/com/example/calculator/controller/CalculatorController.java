package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Controller
public class CalculatorController {

    @Resource
    private CalculatorService calculatorService;

    //초기화 유무 (기본 false)
    private boolean initialization = false;

    /* api 테스트 */
    @GetMapping("/api/ping")
    public void apiTest() {
      log.info("ping!");
    }

    /* 메인페이지 */
    @GetMapping("/")
    public String home() {
        return "/index.html";
    }

    /* 계산기 */
    @PostMapping("/")
    public int calculator(List<Integer> num, List<String> code, boolean initial) {
        /* 초기화버튼 클릭시 계산 종료 */
        if(initial) {
            log.info("초기화 합니다.");
            initialization = true;
        }

        /* 서비스에서 계산한 후 값 반환. */
        var result = 0;
        List<Integer> number1;
        for(int s : num) {
            for(String c : code) {
                switch (c) {
                    case "+":
                        result = calculatorService.plus(s, s);
                        break;
                    case "-":
                        result = calculatorService.minus(s, s);
                        break;
                    case "*":
                        result = calculatorService.mult(s, s);
                        break;
                    case "/":
                        result = calculatorService.quotient(s, s);
                        break;
                    case "%":
                        result = calculatorService.remainder(s, s);
                        break;
                }
            }
        }
        return result;
    }
}
