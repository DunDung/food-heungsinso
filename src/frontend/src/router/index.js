import Vue from "vue";
import VueRouter from "vue-router";
import Home from "@/views/Home";
import Recommend from "@/views/Recommend";
import Result from "@/views/Result";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home
  },
  {
    path: "/recommend/:menuName",
    name: "Recommend",
    component: Recommend
  },
  {
    path: "/result/",
    name: "Result",
    component: Result
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});

export default router;
