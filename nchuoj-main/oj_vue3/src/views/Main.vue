<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-11-12 16:58:30
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-28 21:06:09
 * @FilePath: \oj_vue3\src\views\Main.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
   <div class="main">
        <TopBar/>
   </div>
</template>

<script>

import TopBar from '@/components/main2/TopBar.vue'
export default {
    name:'Main',
    components:{
        TopBar,
    },
    setup() {
        
    }

}
</script>

<style scoped>
   .execrise
   {
      position: absolute;
      right: 20px;
      top: 110px;
   }
   .paihangbang
   {
       position: absolute;
       top: 430px;
       right: 20px;
   }
   .logo
   {
      width:100px
   }
</style>