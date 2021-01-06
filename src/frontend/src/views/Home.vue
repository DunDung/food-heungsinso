<template>
  <v-main>
    <div class="app-container">
      <header class="header">
        <h1 class="header__brand-logo">
          <img
            src="@/assets/images/header_logo.png"
            alt="음식 흥신소"
            class="respons"
          />
        </h1>
        <article class="header__slogan">
          <h2 class="a11y-hidden">사이트 소개</h2>
          <p>전국 프렌차이즈 메뉴 중 <br/> 지금 끌리는 메뉴를 찾아드립니다.</p>
        </article>
      </header>
      <Menu />
    </div>
    <!-- footer -->
    <div class="footer-container">
      <footer class="footer">
        <div class="footer__brand-logo">
          <img src="@/assets/images/footer_logo.png" alt="음식 흥신소" />
        </div>
        <address class="footer__address">
          <span><b>GITHUB : </b>github.com/DunDung</span>
          <span class="address__divider" aria-hidden="true">ㅣ</span>
          <span>github.com/iamkjw77</span>
        </address>
        <small class="footer__copyright"
          >&copy; 2021 FOOD HEUNGSINSO COMPANY. ALL RIGHTS RESERVED.</small
        >
      </footer>
    </div>
  </v-main>
</template>

<script>
import Menu from "@/components/Menu";
export default {
  data: () => ({}),
  components: {
    Menu
  }
};
</script>
<style scoped>
/* 레이아웃 */
.app-container {
  width: 100%;
  background: linear-gradient(to bottom, #626fbf 1%, #972ae6 100%);
}

/* 헤더 */
.header {
  width: 550px;
  margin: 0 auto;
  padding-top: 30px;
}

/* 헤더-로고 */
.header__brand-logo a {
  display: block;
  width: 100%;
}

.header__brand-logo img {
  vertical-align: baseline;
  /* width: 450px; */
}

/* 헤더-슬로건 */
.header__slogan {
  padding: 30px 10px;
}
.header__slogan p {
  display: block;
  color: #f4eee6;
  font-weight: 500;
  font-size: 2.2rem;
  text-align: center;
  line-height: 1.5;
}

/* 푸터 */
.footer-container {
  width: 100%;
  background: #1f1f1f;
}

.footer {
  width: 550px;
  margin: 0 auto;
  padding: 30px;
  text-align: center;
  color: #a7a7a7;
}

.footer__brand-logo {
  margin-bottom: 20px;
}

.footer__address,
.footer__copyright {
  font-style: normal;
  font-size: 1.4rem;
  line-height: 1.5;
  margin-bottom: 5px;
}
</style>
