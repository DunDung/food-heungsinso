<template>
  <div class="footer-container">
    <footer class="footer">
      <div class="footer__brand-logo">
        <img
          class="respons"
          src="@/assets/images/views/footer_logo.png"
          alt="음식 흥신소"
        />
      </div>
      <address class="footer__address">
        <v-icon color="white"> mdi-github</v-icon>
        <span><b>GITHUB</b></span>
        <span>github.com/DunDung</span>
        <span>github.com/iamkjw77</span>
      </address>
      <small class="footer__copyright"
        >&copy; 2021 FOOD HEUNGSINSO COMPANY. ALL RIGHTS RESERVED.</small
      >
    </footer>
  </div>
</template>

<style scoped>
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

.footer__address span {
  display: block;
}

.footer__address,
.footer__copyright {
  font-style: normal;
  font-size: 0.8rem;
  line-height: 1.5;
  margin-bottom: 5px;
}

.footer__copyright {
  font-size: 0.5rem;
}

@media screen and (max-width: 768px) {
  .footer {
    width: 100%;
  }
}
</style>
