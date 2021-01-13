package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;

public class FriedChickenQuestion extends Question {

    private static final String CONTENT = "후라이드 치킨만 먹어요.";

    @Override
    public Recommend answerYes() {
        return new ALittleSpicyQuestion();
    }

    @Override
    public Recommend answerNo() {
        return new RedSeasonedChickenQuestion();
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
