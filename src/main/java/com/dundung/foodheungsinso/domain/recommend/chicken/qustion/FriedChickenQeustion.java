package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;

public class FriedChickenQeustion extends Question {
    private static final String CONTENT = "치킨은 무조건 후라이드 치킨이지 인정?";

    @Override
    protected Recommend answerYes() {
        return null;
    }

    @Override
    protected Recommend answerNo() {
        return null;
    }

    @Override
    protected String getContent() {
        return CONTENT;
    }
}
