<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-11-13 11:51:52
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-16 21:35:28
 * @FilePath: \oj_vue3\src\components\topbar\Problem.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
    <div class="problems">
        <SearchBox/>
        <ProblemList/>
    </div>
  </template>
  
  <script>
import ProblemList from '../Problems/ProblemList'
import SearchBox from '../Problems/SearchBox.vue'
  export default {
     name:'ProblemPage',
     components:{
        ProblemList,
        SearchBox
     },
     setup()
     {
         
     }
  
  }
  </script>
  
  <style lang="less" scoped>
  
  .problems
  {
     margin-top: 10px;
     width: 80%;
     height: 900px;
     margin: 0 auto;
     background: rgb(222, 220, 220);
  }
  
  </style>