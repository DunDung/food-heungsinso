<template>
  <div class="main__btn-list">
    <router-link :to="'/'">
      <button class="btn-list__replay-btn" type="button"><v-icon color="white">mdi-home</v-icon> 홈으로</button>
    </router-link>
  </div>
</template>

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