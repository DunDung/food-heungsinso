<template>
  <div class="main__btn-list">
    <router-link :to="'/'">
      <button class="btn-list__replay-btn" type="button">
        <v-icon color="white">mdi-home</v-icon> 홈으로
      </button>
    </router-link>
    <a
      href="https://forms.gle/u19RCjsEtiN64Sa66"
      target="_blank"
      v-show="isResult"
    >
      <button class="btn-list__replay-btn" type="button">
        <v-icon color="white">mdi-mailbox-open-up</v-icon> 건의 사항
      </button>
    </a>
  </div>
</template>

<script>
export default {
  props: ["isResult"]
};
</script>

<style scoped>
/* 메인-뒤로가기 버튼 */
.main__btn-list {
  display: flex;
  flex-flow: row wrap;
  justify-content: space-evenly;
}

.btn-list__replay-btn {
  display: inline-block;
  width: 200px;
  height: 50px;
  margin-top: 40px;
  border-radius: 10px;
  font-size: 1.1rem;
  color: #f4eee6;
}

.btn-list__replay-btn {
  font-family: "DX상장체B", sans-serif;
  font-size: 1.2rem;
  background: #0a0426;
}

.btn-list__replay-btn:hover {
  border: 2px solid #f4eee6;
}
@media screen and (max-width: 768px) {
  .btn-list__replay-btn {
    width: 140px;
  }
}
</style>
