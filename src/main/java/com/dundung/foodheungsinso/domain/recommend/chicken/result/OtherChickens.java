package com.dundung.foodheungsinso.domain.recommend.chicken.result;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OtherChickens {
    GOOBNE_GOBASAK(new Chicken(
            "고추바사삭",
            "겉바속촉의 정석",
            "굽네 치킨",
            "요즘 잘나가는 존맛 치킨, 안먹어보셨으면 틀딱입니다,,(다른 치킨 대비 칼로리도 낮아요.)",
            "goobne_gobasak.jpg")),
    PURADAK_BONELESS_CHILI_MAYO(new Chicken(
            "순살 고추 마요",
            "최애 치킨",
            "푸라닭",
            "안먹어보셨으면 순살로 꼭 먹어보세요. 최애 치킨이 될 것을 장담합니다,,",
            "puradak_boneless_chili_mayo.jpg"));

    private final Chicken chicken;
}
