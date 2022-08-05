package com.example.calculator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@Controller
public class CalculatorController {

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
    public void calculator(List<Integer> num, List<String> code) {
        /* 초기화버튼 클릭시 계산 종료 */
        /*if(initialization == true) {

        }
        calculator( ); //계산후 나온 결과를 계산할수 있게 재귀호출
        */
    }
}
