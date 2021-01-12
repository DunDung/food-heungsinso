package com.dundung.foodheungsinso.domain.recommend.config;

import com.dundung.foodheungsinso.domain.recommend.Answers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StringToAnswersConverterTest {

    private StringToAnswersConverter converter;

    @BeforeEach
    void setUp() {
        converter = new StringToAnswersConverter();
    }

    @DisplayName("대소문자 상관없이 Answers.YES 객체로 변환 잘 하는지 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"yes", "Yes", "yEs", "yeS", "YEs"})
    void convertYes(String source) {
        Answers actual = converter.convert(source);

        assertThat(actual).isEqualTo(Answers.YES);
    }

    @DisplayName("대소문자 상관없이 Answers.NO 객체로 변환 잘 하는지 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"no", "nO", "No", "NO"})
    void convertNo(String source) {
        Answers actual = converter.convert(source);

        assertThat(actual).isEqualTo(Answers.NO);
    }
}