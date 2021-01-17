<template>
  <main class="main">
    <h2>먹고 싶은 음식의 종류를 선택해주세요!</h2>
    <ul class="main__menu-list reset-list">
      <li class="menu-list__item" v-for="(menu, index) in menus" :key="index">
        <router-link :to="'/recommend/' + menu.class">
          <figure>
            <img :src="menu.imagePath" class="respons" />
            <figcaption>{{ menu.name }}</figcaption>
          </figure>
        </router-link>
      </li>
    </ul>
  </main>
</template>

<script>
export default {
  data: () => ({
    menus: [
      {
        imagePath: require("@/assets/images/views/chicken.png"),
        name: "치킨",
        class: "chickens"
      },
      {
        imagePath: require("@/assets/images/views/pizza.png"),
        name: "피자",
        class: "pizzas"
      }
    ]
  }),
  components: {}
};
</script>

<style scoped>
/* 메인 */
.main {
  width: 550px;
  margin: 0 auto;
  padding-bottom: 200px;
}

.main h2 {
  color: #f4eee6;
  font-weight: 300;
  font-size: 1.3rem;
  text-align: center;
}

/* 메인 음식 리스트 */
.main__menu-list {
  display: flex;
  flex-flow: row wrap;
  justify-content: space-evenly;
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

.menu-list__item figcaption {
  margin-top: 15px;
  color: #eed09c;
  font-size: 2rem;
  text-align: center;
}

@media screen and (max-width: 768px) {
  .main {
    width: 100%;
  }
  .main h2 {
    font-size: 1rem;
  }
  .main__menu-list {
    padding: 0;
  }
  .menu-list__item {
    width: 150px;
    height: 200px;
  }
}
</style>
