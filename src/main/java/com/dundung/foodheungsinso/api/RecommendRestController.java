package com.dundung.foodheungsinso.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recommends")
public class RecommendRestController {

    @DeleteMapping
    public void completeRecommend() {
        System.out.println("끝");
    }

    @GetMapping
    public void start() {
        System.out.println("시작");
    }
}
