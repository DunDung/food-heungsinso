package com.dundung.foodheungsinso.domain.recommend;

public abstract class Question implements Recommend {
    protected abstract Recommend answerYes();

    protected abstract Recommend answerNo();

    protected abstract String getContent();
}
