<template>
  <v-main class="pa-0">
    <div class="app-container">
      <header class="header">
        <h1 class="header__brand-logo">
          <img
            class="respons"
            src="@/assets/images/header_logo.png"
            alt="음식 흥신소"
          />
        </h1>
        <v-alert type="warning" v-if="isInternetExplorer">
          "Internet Explorer는 디자인이 깨질 수 있어요 ㅠㅠ<br />
          크롬이나 네이버 웨일을 사용하면 더 예쁘게 이용 가능합니다!"
        </v-alert>
        <article class="header__slogan">
          <h2 class="a11y-hidden">사이트 소개</h2>
          <p>
            전국 프렌차이즈 메뉴 중 <br />
            지금 끌리는 메뉴를 찾아드립니다.
          </p>
        </article>
      </header>
      <Menu />
    </div>
  </v-main>
</template>

<script>
import Menu from "@/components/Menu";
export default {
  data: () => ({
    isInternetExplorer: false
  }),
  components: {
    Menu
  },
  mounted() {
    const agent = navigator.userAgent.toLowerCase();
    if (
      (navigator.appName == "Netscape" && agent.indexOf("trident") != -1) ||
      agent.indexOf("msie") != -1
    ) {
      this.isInternetExplorer = true;
    }
  }
};
</script>

<style scoped>
/* 레이아웃 */
.app-container {
  width: 100%;
  background-image: linear-gradient(to bottom, #626fbf 1%, #972ae6 100%);
}

/* 헤더 */
.header {
  width: 550px;
  margin: 0 auto;
  padding-top: 30px;
}

/* 헤더-로고 */
.header__brand-logo {
  width: 85%;
  margin: 0 auto;
}

.header__brand-logo a {
  display: block;
  width: 100%;
}

.header__brand-logo img {
  vertical-align: baseline;
}

/* 헤더-슬로건 */
.header__slogan {
  padding: 30px 10px;
}
.header__slogan p {
  display: block;
  color: #f4eee6;
  font-weight: 500;
  font-size: 1.6rem;
  text-align: center;
  line-height: 1.5;
}

@media screen and (max-width: 768px) {
  .header {
    width: 100%;
  }
  .header__slogan p {
    font-size: 1.2rem;
  }
}
</style>
