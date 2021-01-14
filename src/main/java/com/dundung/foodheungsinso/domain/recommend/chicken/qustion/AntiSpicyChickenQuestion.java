package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.chicken.result.SoySauceChickens;

public class AntiSpicyChickenQuestion extends Question {

    private static final String CONTENT = "조금이라도 매운건 절대 싫어.";

    @Override
    public Recommend answerYes() {
        return new HoneyChickenQuestion();
    }

    @Override
    public Recommend answerNo() {
        return SoySauceChickens.HOSIGI_SPICY_SOY_SAUCE.getChicken();
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
