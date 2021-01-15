<template>
  <v-main>
    <SmallLogo />
    <main class="main">
      <section class="main__progress-bar">
        <h2 class="a11y-hidden">진행 단계</h2>
        <div class="progress-bar__line"></div>
        <img
          class="progress-bar__step"
          src="@/assets/images/views/tray.png"
          alt="지금의 단계"
        />
      </section>
      <section class="main__question-answer">
        <h2 class="a11y-hidden">추천음식을 위한 질문과 답변</h2>
        <p class="question-answer__question">{{ question.content }}</p>
        <ul class="question-answer__answer">
          <li>
            <a @click="answer('/yes')">
              <img
                class="respons"
                src="@/assets/images/views/yes.png"
                alt="yes"
              />
            </a>
          </li>
          <li>
            <a @click="answer('/no')">
              <img
                class="respons"
                src="@/assets/images/views/no.png"
                alt="no"
              />
            </a>
          </li>
        </ul>
      </section>
      <BottomBtn :isResult="false" />
    </main>
  </v-main>
</template>

<script>
import SmallLogo from "@/components/SmallLogo";
import BottomBtn from "@/components/BottomBtn";
import axios from "axios";

export default {
  data: () => ({
    requestUri: "/recommends/",
    question: {
      content: ""
    }
  }),
  mounted() {
    this.requestUri += this.$route.params.menuName;
    axios.get(this.requestUri).then(res => (this.question = res.data));
  },
  destroyed() {
    axios.delete(this.requestUri);
  },
  components: {
    SmallLogo,
    BottomBtn
  },
  methods: {
    answer(yesOrNo) {
      axios.get(this.requestUri + yesOrNo).then(response => {
        const recommended = response.data;
        if (this.isResult(recommended)) {
          this.$router.push({
            name: "Result",
            params: { result: recommended },
            props: true
          });
        }
        this.question = recommended;
      });
    },
    isResult(recommended) {
      if (recommended.name && recommended.brandName && recommended.title) {
        return true;
      }
      return false;
    }
  }
};
</script>

<style scoped>
/* 웹 폰트 */
@font-face {
  font-family: "DX상장체B";
  src: url(../assets/fonts/DXSJB-KSCpc-EUC-H.ttf) format("truetype");
  font-style: normal;
  font-weight: normal;
}

/* 메인 */
.main {
  width: 550px;
  margin: 0 auto;
  padding-top: 30px;
  padding-bottom: 50px;
}

/* 메인-프로그래스 바 */
.main__progress-bar {
  position: relative;
  width: 450px;
  margin: 0 auto;
}

.progress-bar__line {
  border: 2px solid #a7a7a7;
}

.progress-bar__step {
  position: absolute;
  left: 0;
  top: -35px;
}

/* 메인- Q&A */
.main__question-answer {
  margin-top: 30px;
  padding-top: 40px;
}

.question-answer__question {
  text-align: center;
  font-size: 3.2rem;
  font-family: "DX상장체B", sans-serif;
}

.question-answer__answer {
  display: flex;
  flex-flow: row wrap;
  justify-content: space-evenly;
  padding: 0;
  margin-top: 40px;
}

.question-answer__answer li {
  width: 200px;
  height: 200px;
  background: #0a0426;
  border-radius: 20px;
  text-align: center;
  line-height: 7;
}

.question-answer__answer li:hover {
  border: 2px solid red;
}

.question-answer__answer a {
  display: block;
  width: 100%;
  height: 200px;
}

@media screen and (max-width: 768px) {
  .main {
    width: 100%;
  }

  .main__progress-bar {
    width: 220px;
  }

  .question-answer__question {
    font-size: 2.7rem;
  }

  .question-answer__answer li {
    width: 150px;
    height: 150px;
    line-height: 5.5;
  }

  .question-answer__answer li:hover {
    border: 1px solid black;
  }
}
</style>
