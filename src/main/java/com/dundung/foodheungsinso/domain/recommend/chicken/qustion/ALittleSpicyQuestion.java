package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.chicken.result.FriedChickens;

public class ALittleSpicyQuestion extends Question {

    private static final String CONTENT = "좀 매콤하면 더 좋아.";

    @Override
    public Recommend answerYes() {
        return FriedChickens.BHC_HOT_FRIED.getChicken();
    }

    @Override
    public Recommend answerNo() {
        return FriedChickens.BBQ_GOLD_OLIVE.getChicken();
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
