<template>
  <header class="header">
    <h1 class="header__brand-logo">
      <router-link to="/">
        <img
          class="respons"
          src="@/assets/images/views/small_logo.png"
          alt="음식 흥신소"
        />
      </router-link>
    </h1>
  </header>
</template>

<script></script>

<style scoped>
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
  text-align: center;
}

.header__brand-logo a {
  display: block;
  width: 100%;
}

.header__brand-logo img {
  vertical-align: baseline;
}

@media screen and (max-width: 768px) {
  .header {
    width: 100%;
  }
}
</style>
