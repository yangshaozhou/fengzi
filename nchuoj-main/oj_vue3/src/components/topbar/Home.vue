<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-11-13 11:38:11
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-16 20:40:00
 * @FilePath: \oj_vue3\src\components\topbar\Home.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
    <div class="main">
         <LunBo/>
         <Practice class="execrise"/>
         <Notice/>
         <SortList class="paihangbang"/>
         <problemListVue/>
    </div>
 </template>
 
 <script>
 import problemListVue from '@/components/main2/problemList.vue'
 import SortList from '@/components/main2/SortList.vue'
 import Notice from '@/components/main2/Notice.vue'
 import Practice from '@/components/main2/Practice.vue'
 import LunBo from '@/components/main2/lunbotu.vue'
 export default {
     name:'HomePage',
     components:{
         LunBo,
         Practice,
         Notice,
         SortList,
         problemListVue
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