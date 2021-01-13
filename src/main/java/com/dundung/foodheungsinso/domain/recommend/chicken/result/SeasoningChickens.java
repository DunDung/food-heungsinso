package com.dundung.foodheungsinso.domain.recommend.chicken.result;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SeasoningChickens {
    BBURINGCLE(new Chicken(
            "뿌링클",
            "독보적 판매량 1위",
            "BHC",
            "가장 잘나가는 치킨, 그 이유가 있다. 세상에 없던 마법의 맛",
            "bburingcle.jpg"
    ));
    private final Chicken chicken;
}
