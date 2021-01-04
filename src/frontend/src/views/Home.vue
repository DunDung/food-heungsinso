<template>
  <v-main id="main-wrap">
    <v-img src="@/assets/logo.jpg" width="100%" id="logo" />
    <Menu />
    <v-btn to="/recommend"></v-btn>
  </v-main>
</template>

<script>
import axios from "axios";
import Menu from "@/components/Menu";
export default {
  data: () => ({}),
  components: {
    Menu
  },
  created() {
    console.log("created");
    axios.get("/recommends");
  },
  destroyed() {
    axios.delete("/recommends");
  }
};
</script>
<style scoped>
#main-wrap {
}
#logo {
  margin: 0 auto;
}
</style>
