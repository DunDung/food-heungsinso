<template>
  <div> <h2>My name is {{menuName}}</h2> </div>
</template>
<script>
export default {
  data() {
    return { menuName: "" };
  },
  mounted() {
    this.menuName = this.$route.params.menuName;
  }
};
</script>
