package com.dundung.foodheungsinso.domain.recommend;

public abstract class Question implements Recommend {
    public abstract Recommend answerYes();

    public abstract Recommend answerNo();

    public abstract String getContent();
}
