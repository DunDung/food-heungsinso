package com.dundung.foodheungsinso.domain.recommend;

import org.springframework.stereotype.Component;

@Component
public class RecommendedProcessor {

    public Recommend getNextRecommend(Question question, Answers answers) {
        if (answers == Answers.YES) {
            return question.answerYes();
        }
        return question.answerNo();
    }
}
