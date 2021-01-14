package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.chicken.result.SoySauceChickens;

public class HoneyChickenQuestion extends Question {

    private static final String CONTENT = "달달한 건 좋아?";

    @Override
    public Recommend answerYes() {
        return SoySauceChickens.KYOCHON_HONEY_COMBO.getChicken();
    }

    @Override
    public Recommend answerNo() {
        return SoySauceChickens.KYOCHON_ORIGINAL.getChicken();
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
