package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.chicken.result.SeasoningChickens;

public class BestSellerChickenQuestion extends Question {

    private static final String CONTENT = "귀찮으니까 가장 잘나가는 걸로, 판매량 1위 치킨 추천해줘.";

    @Override
    public Recommend answerYes() {
        return SeasoningChickens.BBURINGCLE.getChicken();
    }

    @Override
    public Recommend answerNo() {
        return null;
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
