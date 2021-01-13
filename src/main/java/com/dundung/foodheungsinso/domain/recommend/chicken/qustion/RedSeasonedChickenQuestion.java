package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;

public class RedSeasonedChickenQuestion extends Question {

    private static final String CONTENT = "빨간색 양념 치킨이 제일 맛있어.";

    @Override
    public Recommend answerYes() {
        return new DifferentRedSeasonedChickenQuestion();
    }

    @Override
    public Recommend answerNo() {
        return new BestSellerChickenQuestion();
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
