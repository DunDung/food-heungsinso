package com.dundung.foodheungsinso.domain.recommend.chicken.result;

import com.dundung.foodheungsinso.domain.recommend.Recommend;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@RequiredArgsConstructor
public enum Chickens implements Recommend {
    BHC_HOT_FRIED(
            "핫후라이드",
            "바삭한 후라이드의 끝판왕",
            "BHC",
            "매콤함이 더해진 최고의 후라이드 치킨, 다른 후라이드 치킨은 먹을 필요 없어요.",
            "bhc_hot_fried.jpg"),
    BBQ_GOLD_OLIVE(
            "황금 올리브",
            "후라이드의 왕",
            "BBQ",
            "후라이드 치킨의 왕, 다른 후라이드 치킨은 못 비벼요.",
            "bbq_gold_olive.png");

    private final String name;
    private final String title;
    private final String brandName;
    private final String description;
    private final String imageName;

}
