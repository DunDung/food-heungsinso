package com.dundung.foodheungsinso.domain.recommend.pizza.question;

import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;

public class TempQuestion extends Question {
    @Override
    public Recommend answerYes() {
        return null;
    }

    @Override
    public Recommend answerNo() {
        return null;
    }

    @Override
    public String getContent() {
        return "개발 예정임니다ㅎㅎ";
    }
}
