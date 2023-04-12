<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2023-01-16 20:40:46
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-27 22:37:49
 * @FilePath: \oj_vue3\src\components\Problems\Search.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
  <div class="searchBox">
    <div class="title">NCHU在线OJ题库</div>
      <div class="search" >
        <input type="text" placeholder="请输入题目关键词" v-model="keyWord" class="inputBox">
        <el-button type="primary" @click="Search">搜索</el-button>
      </div>
  </div>
</template>

<script setup>
import {useStore} from 'vuex'
import {ref} from 'vue'
const store = useStore()
const keyWord = ref("")
const {problemsList} = store.state
let Search = ()=>{
   let kw = keyWord.value

   if(kw)
   {
     let filterData = problemsList.filter((item)=>{
      console.log(item.title)
         return item.title.indexOf(kw)!==-1
     })
     store.commit('updateFilterState',filterData)
   }
}
</script>

<style lang="less" scoped>
.searchBox
{
  width: 80%;
  height: 100px;
  margin: 0 auto;
  .title
  {
     width: 500px;
     font-size: 40px;
     padding-left: 120px;
     color: black;
      margin: 0 auto;
      font-family:"微软雅黑";/*设置字体*/
		   animation: shine 2.4s infinite;/*设置动画*/
		}
    @keyframes shine{/*创建动画*/
		    0%,100%{ color:#fff;text-shadow:0 0 10px #0000FF,0 0 10px #0000FF; }
		    50%{ text-shadow:0 0 10px #85a198,0 0 40px #ff006f; }
  }
  .search
  {
     margin-top: 20px;
    margin-left: 20%;
     .inputBox{
       height: 30px;
       width: 380px;
       color: BLACK;
      
     }
  }


}

</style>