package com.dundung.foodheungsinso.domain.recommend.chicken.result;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@RequiredArgsConstructor
public enum SeasonedChickens {
    CHEOGAJIP_SUPREME_SEASONED(new Chicken(
            "슈프림 양념",
            "이색적으로 맛있는 양념치킨",
            "처갓집",
            "진부한 양념 치킨은 저리가라. 신선하고 맛있는 역대급 양념 치킨",
            "cheogajip_supreme_seasoned.jpg")),
    PERICANA_SEASONED(new Chicken(
            "양념",
            "양념 치킨의 왕",
            "페리카나",
            "양념 치킨은 페리카나 양념 치킨, 39년 전통이 베어있는 최고의 양념 맛",
            "pericana-seasoned"));

    private final Chicken chicken;
}
