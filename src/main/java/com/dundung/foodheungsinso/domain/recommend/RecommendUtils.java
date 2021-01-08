package com.dundung.foodheungsinso.domain.recommend;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RecommendUtils {

    public Question respond(Question question, Answer answer) {
        if (answer == Answer.YES) {
            return question.answerYes();
        }
        return question.answerNo();
    }

}
