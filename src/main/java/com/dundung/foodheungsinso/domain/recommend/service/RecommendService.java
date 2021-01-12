package com.dundung.foodheungsinso.domain.recommend.service;

import com.dundung.foodheungsinso.domain.recommend.Answers;
import com.dundung.foodheungsinso.domain.recommend.Question;
import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.dundung.foodheungsinso.domain.recommend.RecommendUtils;
import com.dundung.foodheungsinso.domain.recommend.chicken.qustion.FriedChickenQuestion;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class RecommendService {

    private static final Recommend START_QUESTION = new FriedChickenQuestion();
    private static final String QUESTION_KEY = "question";

    public Recommend startChickenRecommend(HttpSession httpSession) {
        httpSession.setAttribute(QUESTION_KEY, START_QUESTION);
        return START_QUESTION;
    }

    public Recommend nextRecommend(Answers answer, HttpSession httpSession) {
        Question lastQuestion = (Question) httpSession.getAttribute(QUESTION_KEY);
        Recommend nowQuestion = RecommendUtils.getNextRecommend(lastQuestion, answer);
        httpSession.setAttribute(QUESTION_KEY, nowQuestion);
        return nowQuestion;
    }

}
