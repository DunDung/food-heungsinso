package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.chicken.result.SeasonedChickens;

public class RiceAndChickenQuestion extends Question {

    private static final String CONTENT = "치밥이 먹고싶어.";

    @Override
    public Recommend answerYes() {
        return SeasonedChickens.GCOVA_BONELESS_SEASONED.getChicken();
    }

    @Override
    public Recommend answerNo() {
        return new SoySauceChickenQuestion();
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
