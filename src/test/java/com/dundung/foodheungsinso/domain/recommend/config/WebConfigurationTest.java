package com.dundung.foodheungsinso.domain.recommend.config;

import com.dundung.foodheungsinso.domain.recommend.Answers;
import com.dundung.foodheungsinso.domain.recommend.chicken.api.RecommendRestController;
import com.dundung.foodheungsinso.domain.recommend.chicken.service.RecommendService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import javax.servlet.http.HttpSession;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RecommendRestController.class)
@AutoConfigureMockMvc
class WebConfigurationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RecommendService recommendService;

    @Mock
    private HttpSession httpSession;

    @DisplayName("PathVariable 소문자로 넘겼을 때 enum으로 받아지는지")
    @Test
    void addConverter() throws Exception {
        given(recommendService.nextRecommend(Answers.YES, httpSession)).willReturn(null);

        mockMvc.perform(get("/recommends/chickens/yes"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}