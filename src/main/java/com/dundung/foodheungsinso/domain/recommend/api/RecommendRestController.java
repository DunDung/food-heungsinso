package com.dundung.foodheungsinso.domain.recommend.api;

import com.dundung.foodheungsinso.domain.recommend.Answers;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.pizza.question.TempQuestion;
import com.dundung.foodheungsinso.domain.recommend.service.RecommendService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recommends")
public class RecommendRestController {

    private final RecommendService recommendService;

    @GetMapping("/chickens")
    public Recommend startChickenRecommend(HttpSession httpSession) {
        return recommendService.startChickenRecommend(httpSession);
    }

    @GetMapping("/chickens/{answer}")
    public Recommend respondNextRecommended(@PathVariable Answers answer, HttpSession httpSession) {
        return recommendService.nextRecommend(answer, httpSession);
    }

    @GetMapping("/pizzas")
    public Recommend startPizzaRecommend() {
        return new TempQuestion();
    }
}
