package com.dundung.foodheungsinso.domain.recommend.chicken.result;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FriedChickens {
    BHC_HOT_FRIED(new Chicken(
            "핫후라이드",
            "바삭한 후라이드의 끝판왕",
            "BHC",
            "다른 후라이드 치킨은 먹을 필요 없어요. 매콤함이 더해진 최고의 후라이드 치킨입니다.",
            "bhc_hot_fried.jpg")),
    BBQ_GOLD_OLIVE(new Chicken(
            "황금 올리브",
            "후라이드의 왕",
            "BBQ",
            "더 물어볼 필요 없습니다. 후라이드의 왕 황금 올리브 드시면 다른 후라이드는 못 먹어요.",
            "bbq_gold_olive.jpg"));

    private final Chicken chicken;

}
