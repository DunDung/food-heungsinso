package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.chicken.result.SeasonedChickens;

public class DifferentRedSeasonedChickenQuestion extends Question {

    private static final String CONTENT = "빨간 양념치킨 이긴한데..조금 색다른걸 원해";


    @Override
    public Recommend answerYes() {
        return SeasonedChickens.CHEOGAJIP_SUPREME_SEASONED.getChicken();
    }

    @Override
    public Recommend answerNo() {
        return SeasonedChickens.PERICANA_SEASONED.getChicken();
    }

    @Override
    public String getContent() {
        return CONTENT;
    }
}
