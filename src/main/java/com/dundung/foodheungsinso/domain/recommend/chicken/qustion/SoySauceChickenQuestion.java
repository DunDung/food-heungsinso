package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;

public class SoySauceChickenQuestion extends Question {

    private static final String CONTENT = "간장 치킨 좋아해?";

    @Override
    public Recommend answerYes() {
        return new AntiSpicyChickenQuestion();
    }

    @Override
    public Recommend answerNo() {
        return new RoastChickenQuestion();
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
