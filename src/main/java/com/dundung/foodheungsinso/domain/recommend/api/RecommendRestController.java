package com.dundung.foodheungsinso.domain.recommend.api;

import com.dundung.foodheungsinso.domain.recommend.Answers;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.pizza.question.TempQuestion;
import com.dundung.foodheungsinso.domain.recommend.service.RecommendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    public ResponseEntity<Recommend> startChickenRecommend(HttpSession httpSession) {
        Recommend startChickenRecommend = recommendService.startChickenRecommend(httpSession);
        return ResponseEntity.ok(startChickenRecommend);
    }

    @DeleteMapping("/chickens")
    public ResponseEntity<Void> endChickenRecommend(HttpSession httpSession) {
        recommendService.endChickenRecommend(httpSession);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/chickens/{answer}")
    public ResponseEntity<Recommend> respondNextRecommended(@PathVariable Answers answer, HttpSession httpSession) {
        Recommend nextChickenRecommend = recommendService.nextRecommend(answer, httpSession);
        return ResponseEntity.ok(nextChickenRecommend);
    }

    @GetMapping("/pizzas")
    public Recommend startPizzaRecommend() {
        return new TempQuestion();
    }
}
