<template>
  <div class="trList">
      <div class="topBar">
           <div class="back">

           </div>
           <div class="title">

           </div>
      </div>
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router';
const route = useRoute()
console.log(route.query.data)
</script>

<style lang="less" scoped>
.trList
{
    width: 90%;
    height: 800px;
    margin: 0 auto;
    background-color: #bfa;
}
</style>