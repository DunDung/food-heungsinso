<template>
  <v-app id="base">
    <v-main>
      <router-view></router-view>
      <Footer />
    </v-main>
  </v-app>
</template>

<script>
import Footer from "@/components/Footer";

export default {
  name: "App",

  components: { Footer }
};
</script>
<style>
/* 셀렉션 스타일 */
::-moz-selection {
  /* 파이어폭스를 위한 -moz */
  background: #9131e2;
  color: #ffffff;
}
::selection {
  background: #9131e2;
  color: #ffffff;
}

#base {
  background-image: linear-gradient(to bottom, #626fbf 1%, #972ae6 100%);
  font-family: "Spoqa Han Sans", "Sans-serif";
  font-size: 1.6rem;
  font-weight: 400;
  background-color: #fff;
  color: #181818;
}

/* 기본 박스사이징 설정 */
body,
body *,
body::before,
body::after,
body *::before,
body *::after {
  box-sizing: border-box;
}

/* 탭 하이라이트 색상 */
body * {
  -webkit-tap-highlight-color: rgba(255, 255, 200, 0.3);
  tap-highlight-color: rgba(255, 255, 200, 0.3);
  /* 터치를 위해 색상을 줌 */
}

/* a 요소 내 이미지에 발생하는 갭 제거 */
a img {
  vertical-align: middle;
  /* 블록안에 인라인 요소를 줬을 경우 갭을 위한 코드 */
}

/* fieldset 요소의 기본 스타일 리셋 */
fieldset {
  border: 0;
  margin: 0;
  padding: 0;
}

/* 포커스 시 아웃라인 커스텀 디자인 */
:focus {
  outline: none;
  border-radius: 2px;
  box-shadow: 0 0 0 4px rgba(40, 70, 204, 0.9);
}

/* 버튼 요소의 커서 및 테두리 제거 */
button {
  cursor: pointer;
  border: none;
}

/* 링크 요소의 밑줄 및 글자 색상 재 정의 */
a {
  color: inherit;
  text-decoration: none;
}

h1,
h2,
h3,
h4,
h5,
h6,
p {
  margin: 0;
}

ul,
ol {
  margin: 0;
  padding: 0;
  list-style-type: none;
}

input {
  padding: 0;
  border: 0;
}

figure {
  margin: 0;
}

/* 조립 코드 */

/* 숨김 제목 및 콘텐츠 */
.a11y-hidden,
legend {
  overflow: hidden;
  position: absolute !important;
  clip: rect(0, 0, 0, 0);
  clip-path: polygon(0 0, 0 0, 0 0);
  width: 1px;
  height: 1px;
  margin: -1px;
  /* width, height가 1px이 있다면, margin: -1을 줘서 아예 안보이게 설정 */
}

/* 목록 요소 기본 스타일 초기화 */
.reset-list {
  margin-top: 0;
  margin-bottom: 0;
  padding-left: 0;
  list-style: none;
}

/* 반응형 콘텐츠 */
.respons {
  max-width: 100%;
  height: auto;
}
</style>
