<template>
  <v-main id="main-wrap">
    <v-img src="@/assets/logo.jpg" width="100%" id="logo"/>
    <Menu />
  </v-main>
</template>

<script>
import Menu from "@/components/Menu";
export default {
  data: () => ({}),
  components: {
    Menu
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
