package com.dundung.foodheungsinso.domain.recommend.chicken.result;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SeasonedChickens {
    CHEOGAJIP_SUPREME_SEASONED(new Chicken(
            "슈프림 양념",
            "색다른 존맛 양념 치킨",
            "처갓집",
            "진부한 양념 치킨은 저리가라. 신선하고 맛있는 역대급 양념 치킨",
            "cheogajip_supreme_seasoned.jpg")),
    PERICANA_SEASONED(new Chicken(
            "양념 치킨",
            "양념 치킨의 왕",
            "페리카나",
            "양념 치킨은 페리카나 양념 치킨, 반박 시 치알못",
            "pericana_seasoned.png")),
    GCOVA_BONELESS_SEASONED(new Chicken(
            "순살 양념 치킨",
            "치밥계의 대통령",
            "지코바",
            "치밥을 지코바 순살 양념 아닌 다른 치킨과 먹는다? 그건 아니잖아요..",
            "gcova_boneless_seasoned.jpg"));

    private final Chicken chicken;
}
