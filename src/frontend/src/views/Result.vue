<template>
  <v-main>
    <SmallLogo />
    <main class="main">
      <section class="main__result">
        <h2 class="a11y-hidden">추천 음식 결과와 소개</h2>
        <figure>
          <figcaption>
            <span class="result__title">{{ result.title }}</span>
            <span class="result__bland">{{ result.brandName }} </span>
            <span class="result__menu">{{ result.name }}</span>
          </figcaption>
          <img class="respons" :src="result.imageName" alt="음식 사진" />
        </figure>
        <p class="result_information">
          <span class="result__des">{{ result.description }}</span>
          <span class="result__res">
            “{{ result.brandName }} {{ result.name }}”
          </span>
          추천합니다!
        </p>
      </section>
      <BottomBtn :isResult="true" />
    </main>
  </v-main>
</template>

<script>
import SmallLogo from "@/components/SmallLogo";
import BottomBtn from "@/components/BottomBtn";

export default {
  data: () => ({
    result: {
      name: "",
      title: "",
      brandName: "",
      imageName: "",
      description: ""
    }
  }),
  mounted() {
    this.result = this.$route.params.result;
    this.result.imageName = require("@/assets/images/results/" +
      this.result.imageName);
  },
  components: {
    SmallLogo,
    BottomBtn
  }
};
</script>

<style scoped>
@font-face {
  font-family: "DX상장체B";
  src: url(../assets/fonts/DXSJB-KSCpc-EUC-H.ttf) format("truetype");
  font-style: normal;
  font-weight: normal;
}

@font-face {
  font-family: "상상토끼 정묵바위";
  src: url(../assets/fonts/SSRock.ttf) format("truetype");
  font-style: normal;
  font-weight: normal;
}

/* 메인 */
.main {
  width: 550px;
  margin: 0 auto;
  padding-top: 30px;
  padding-bottom: 30px;
}

/* 메인-추천메뉴 */
.result__title {
  display: block;
  text-align: center;
  font-family: "DX상장체B", sans-serif;
  font-size: 4rem;
  color: #a7a7a7;
}

.main__result figcaption {
  text-align: center;
}

.result__bland::before,
.result__menu::after {
  content: "“";
  color: #000000;
  font-family: "상상토끼 정묵바위", sans-serif;
}

.result__menu::after {
  content: "”";
}

.result__bland {
  line-height: 1.1;
  font-size: 4rem;
  font-family: "상상토끼 정묵바위", sans-serif;
  color: #b70000;
}

.result__menu {
  line-height: 1.1;
  font-size: 3.5rem;
  font-family: "상상토끼 정묵바위", sans-serif;
  color: #e9b412;
}

.main__result img {
  display: block;
  background: #000;
  border-radius: 15px;
  margin: 40px auto;
}

.main__result p {
  font-family: "DX상장체B", sans-serif;
  text-align: center;
  font-size: 1.8rem;
  font-weight: 700;
}
.result__des {
  display: block;
  padding-bottom: 20px;
  letter-spacing: 0.5px;
}
.result__res {
  font-size: 2.3rem;
}

.result_information {
  margin-bottom: 0px;
}

@media screen and (max-width: 768px) {
  .main {
    width: 100%;
  }
  .result__title {
    font-size: 3rem;
  }
  .result__bland {
    font-size: 2.7rem;
  }
  .result__menu {
    font-size: 2rem;
  }
  .main__result img {
    width: 250px;
  }
  .main__result p {
    font-size: 1.1rem;
  }
  .result__des {
    margin: 0 25px;
  }
  .result__res {
    font-size: 1.5rem;
  }
}
</style>
