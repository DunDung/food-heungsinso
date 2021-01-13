package com.dundung.foodheungsinso.domain.recommend.chicken.result;

import com.dundung.foodheungsinso.domain.recommend.Recommend;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Chicken implements Recommend {

    private final String name;
    private final String title;
    private final String brandName;
    private final String description;
    private final String imageName;
}
