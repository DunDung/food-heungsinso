package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.chicken.result.OtherChickens;

public class RoastChickenQuestion extends Question {

    private static final String CONTENT = "구운 치킨(로스트 치킨) 좋아.";

    @Override
    public Recommend answerYes() {
        return OtherChickens.GOOBNE_GOBASAK.getChicken();
    }

    @Override
    public Recommend answerNo() {
        return OtherChickens.PURADAK_BONELESS_CHILI_MAYO.getChicken();
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
