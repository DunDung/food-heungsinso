<template>
  <v-app>
    <!-- Sizes your content based upon application components -->
    <v-app-bar></v-app-bar>
    <v-main id="app-main">
      <!-- Provides the application the proper gutter -->
      <v-container>
        <!-- If using vue-router -->
        <router-view></router-view>
      </v-container>
    </v-main>

    <v-footer app>
      <!-- -->
    </v-footer>
  </v-app>
</template>

<script>
export default {
  name: "App",

  components: {},

  data: () => ({
    //
  })
};
</script>
<style>
body {
  font-family: "Roboto", sans-serif;
}
#app-main {
  max-width: 70%;
  margin: 0 auto;
}
@media {
  #app-main {
    max-width: 100%;
  }
}
</style>
