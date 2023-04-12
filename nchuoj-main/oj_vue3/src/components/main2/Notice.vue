<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-11-12 20:00:38
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-27 15:29:44
 * @FilePath: \oj_vue3\src\components\main2\Notice.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
  <div class="notice">
      <span class="title">
                公告
      </span>
      <div class="content">
         {{word}}
      </div>
      <el-button type="primary" class="update" @click="updateMess" round>刷新</el-button>
  </div>
</template>

<script>
import axios from 'axios'
import { reactive, ref } from '@vue/reactivity'
export default {
   name:'Notice',
   mounted()
   {
      // axios.get('/suijiyulu').then(
      //    res=>{
      //       console.log('请求成功')
      //       this.word = res.data[0].mingrenmingyan
      //    },
      //    error=>{
      //       console.log('请求失败',error)
      //    }
      // )
   },
   setup()
   {
      let word = ref('欢迎来到南昌航空大学在线OJ')
      // let updateMess = function()
      // {
      //    axios.get('/suijiyulu').then(
      //    res=>{
      //       console.log('请求成功')
      //       word.value = res.data[0].mingrenmingyan
      //    },
      //    error=>{
      //       console.log('请求失败',error)
      //    }
         
      // )
      // }
      return {
           word,
         //   updateMess
      }
   }
     
}
</script>

<style scoped>
   .notice
   {
      width: 52%;
      height: 300px;
      margin-left: 25px;
      margin-top: 40px;
      box-shadow: grey 0 5px 5px 3px;
      display: flex;
      flex-direction: column;
      align-items: center;
   }
   .notice .title
   {
      text-align: center;
      font-size: 30px;
      color: rgb(209, 154, 44);
      font-weight: 700;
      text-shadow: 0 8px 15px rgb(109, 162, 126);  /*设置文字阴影*/
   }
   .notice .content
   {
       width: 80%;
       height: 180px;
       margin:  10px auto;
       text-align: center;
       line-height: 180px;
       border: 1px solid black;
       font-size:20px;
       color: rgb(208, 19, 110);
   }
   .update
   {
       width: 100px;
   }
</style>