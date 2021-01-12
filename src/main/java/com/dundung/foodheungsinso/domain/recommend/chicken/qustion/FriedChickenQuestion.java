package com.dundung.foodheungsinso.domain.recommend.chicken.qustion;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;

public class FriedChickenQuestion extends Question {

    private static final String CONTENT = "후라이드 치킨만 먹어요.";
    private static final Recommend YES_REPLY_QUESTION = new ALittleSpicyQuestion();

    @Override
    public Recommend answerYes() {
        return YES_REPLY_QUESTION;
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
