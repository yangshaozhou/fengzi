<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2023-01-28 14:52:11
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-03-30 17:43:59
 * @FilePath: \KaoYanDaShuJuKSH\src\App.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->

<template>
    <div class="box">
        <div class="container">
            <div class="topbar">
                <router-link class="listItem" to="/help/analysise" active-class="onblur">题解查询</router-link>
                <router-link class="listItem" to="/help/codewrite" active-class="onblur">代码分析</router-link>
                <router-link class="listItem" to="/talkpage" active-class="onblur">chatgpt</router-link>
            </div>
            <div class="content">
                <router-view></router-view>
            </div>
        </div>
    </div>
</template>
<script setup>

</script>

<style lang="less" scoped >
.box {
    width: 100vw;
    height: 100vh;
    // background-color: rgb(144, 191, 232);

    .container{
        width: 70%;
        height: 1000px;
        background-color: white;
        margin: 0 auto;
       .topbar{
           width: 100%;
           height: 60px;
           line-height: 60px;
           margin-top: 30px;
           justify-content: space-between;
           display: flex;
           flex-direction: row;
           .listItem{
              width: 33.3%;
              color: white;
              font-size: 24px;
              border-radius: 20px;
              margin-right: 5px;
              text-align: center;
              background-color: rgb(59, 176, 230);
           }
           .onblur{
              background-color: rgb(206, 162, 80);
           }
       }
       .content{
          width: 100%;
          height: 100vh;
          margin-top: 20px;
          border-radius: 30px;
          
          background-color: rgb(76, 140, 225);
       }
    }
}
</style>
