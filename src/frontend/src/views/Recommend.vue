<template>
  <v-main>
    <SmallLogo />
    <main class="main">
      <section class="main__progress-bar">
        <h2 class="a11y-hidden">진행 단계</h2>
        <div class="progress-bar__line"></div>
        <img
          class="progress-bar__step"
          src="@/assets/images/tray.png"
          alt="지금의 단계"
        />
      </section>
      <section class="main__question-answer">
        <h2 class="a11y-hidden">추천음식을 위한 질문과 답변</h2>
        <p class="question-answer__question">{{ question.content }}</p>
        <ul class="question-answer__answer">
          <li>
            <a @click="answerYes">
              <img class="respons" src="@/assets/images/yes.png" alt="yes" />
            </a>
          </li>
          <li>
            <a>
              <img class="respons" src="@/assets/images/no.png" alt="no" />
            </a>
          </li>
        </ul>
      </section>
    </main>
  </v-main>
</template>

<script>
import SmallLogo from "@/components/SmallLogo";
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
  components: {
    SmallLogo
  },
  methods: {
    answerYes() {
      axios.get(this.requestUri + "/yes").then(res => {
        if (this.isResult(res)) {
          this.$router.push({
            name: "Result",
            params: { result: res.data },
            props: true
          });
        }
        this.question = res.data;
      });
    },
    isResult(response) {
      if (response.data.name) {
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
  padding-bottom: 100px;
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
  font-size: 4rem;
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

/* 메인-뒤로가기 버튼 */
.main__back-btn {
  display: block;
  margin: 0 auto;
  width: 200px;
  height: 50px;
  margin-top: 70px;
  background: #b73de6;
  border-radius: 10px;
  font-size: 1.1rem;
  color: #f4eee6;
}

.main__back-btn:hover {
  border: 2px solid violet;
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
}
</style>
