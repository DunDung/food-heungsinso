package com.dundung.foodheungsinso.domain.recommend.config;

import com.dundung.foodheungsinso.domain.recommend.Answers;
import org.springframework.core.convert.converter.Converter;

public class StringToAnswersConverter implements Converter<String, Answers> {

    @Override
    public Answers convert(String source) {
        return Answers.valueOf(source.toUpperCase());
    }
}
