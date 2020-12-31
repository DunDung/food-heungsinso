<template>
  <v-carousel cycle hide-delimiter-background>
    <v-carousel-item v-for="(slide, i) in slides" :key="i">
      <v-sheet
        id="sheet-wrap"
        :style="{
          'background-image': 'url(' + slide.imageUrl + ')'
        }"
      >
        <v-row class="fill-width" align="center" justify="center">
          <v-card id="wrap">
            <v-card-title>{{slide.title}}</v-card-title>
            <v-card-text>"취향에 맞는 브랜드 {{slide.name}} 추천해드립니다."</v-card-text>
            <v-card-actions>
              <v-btn> 추천 받기 </v-btn>
            </v-card-actions>
          </v-card>
        </v-row>
      </v-sheet>
    </v-carousel-item>
  </v-carousel>
</template>
<script>
export default {
  data: () => ({
    slides: [
      {
        name: "치킨",
        imageUrl: require("@/assets/chicken.jpg"),
        title: "치킨은 가슴이 시킨다.",
      },
      {
        name: "피자",
        imageUrl: require("@/assets/pizza.jpg"),
        title: "피자를 먹을까 말까의 고민은 배달을 늦출 뿐이다.",
      }
    ]
  }),
  components: {}
};
</script>
<style scoped>
#wrap {
  opacity: 0.6;
  position: relative;
  background-color: black;
  color: white;
  align-self: flex-end;
  width: 100%;
}

#sheet-wrap {
  display: flex;
  color: white;
  height: 100%;
}
</style>
