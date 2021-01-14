package com.dundung.foodheungsinso.domain.recommend.chicken.result;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SoySauceChickens {
    HOSIGI_SPICY_SOY_SAUCE(new Chicken(
            "매운 간장 치킨",
            "간장 치킨계의 권위자",
            "호식이두마리치킨",
            "호식이의 대표 메뉴, 반박 불가능한 간장 치킨 중 최고봉",
            "hosigi_spicy_soy_sauce.jpg"
    )),
    KYOCHON_HONEY_COMBO(new Chicken(
            "허니 콤보",
            "최고의 단짠",
            "교촌 치킨",
            "꾸준히 사랑받는데는 이유가 있다! 단짠의 완벽함을 느껴보자..",
            "kyochon_honey_combo.jpg"
    )),
    KYOCHON_ORIGINAL(new Chicken(
            "오리지날",
            "간장 치킨의 원조",
            "교촌 치킨",
            "실패 없는 간장 치킨 맛있는거 알잖아요..",
            "kyochon_original.jpg"
    ));

    private final Chicken chicken;

}
