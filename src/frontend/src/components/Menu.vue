<template>
  <main class="main">
    <h2>먹고 싶은 음식의 종류를 선택해주세요!</h2>
    <ul class="main__menu-list reset-list">
      <li class="menu-list__item">
        <a href="">
          <figure>
            <div class="item__img-wrapper">
              <img src="@/assets/images/chicken.png" class="chicken" alt />
            </div>
            <figcaption>치킨</figcaption>
          </figure>
        </a>
      </li>
      <li class="menu-list__item">
        <a href="">
          <figure>
            <div class="item__img-wrapper">
              <img src="@/assets/images/pizza.png" class="pizza" alt />
            </div>
            <figcaption>피자</figcaption>
          </figure>
        </a>
      </li>
    </ul>
  </main>
</template>
<script>
export default {
  data: () => ({}),
  components: {}
};
</script>
<style scoped>
/* 메인 */
.main {
  width: 550px;
  margin: 0 auto;
  padding-bottom: 30px;
}

.main h2 {
  color: #f4eee6;
  font-weight: 300;
  font-size: 1.7rem;
  text-align: center;
}

/* 메인 음식 리스트 */
.main__menu-list {
  display: flex;
  flex-flow: row wrap;
  justify-content: space-around;
  margin-top: 30px;
}
.menu-list__item {
  width: 250px;
  height: 300px;
  background: #0a0426;
  border-radius: 20px;
  box-shadow: 0 10px 5px rgba(10, 4, 38, 0.3);
  margin-bottom: 15px;
}

.menu-list__item:hover {
  border: 2px solid red;
}

.menu-list__item a {
  display: block;
  width: 100%;
  height: 300px;
}

.menu-list__item figure {
  padding: 25px;
}

.menu-list__item .item__img-wrapper {
  position: relative;
  width: 170px;
  height: 170px;
  margin: 0 auto;
  text-align: center;
  background: #eed09c;
  border-radius: 100%;
}

.menu-list__item img {
  position: absolute;
  width: 130px;
  margin: 0 auto;
}

.chicken {
  top: 40px;
  left: 20px;
}

.pizza {
  top: 10px;
  left: 20px;
}

.menu-list__item figcaption {
  margin-top: 30px;
  color: #eed09c;
  font-size: 3rem;
  text-align: center;
}
</style>
