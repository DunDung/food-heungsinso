package com.dundung.foodheungsinso.domain.recommend;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RecommendUtils {

    public static Recommend getNextRecommend(Question question, Answers answers) {
        if (answers == Answers.YES) {
            return question.answerYes();
        }
        return question.answerNo();
    }
}
