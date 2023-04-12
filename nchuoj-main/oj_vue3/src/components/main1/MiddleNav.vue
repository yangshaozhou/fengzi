<template>
  <div class="middle">
        <!-- <button class="enter">点击进入</button> -->
         <el-button type="primary"  class="enter" round><router-link to='/main' class="as">点击进入</router-link></el-button>
    </div>
</template>

<script>
export default {
     name:'MiddleNav'
}
</script>

<style scoped>
*{
     text-decoration: none;
     margin: 0;
     padding: 0;
}

.middle
{
    width: 100%;
    height: 580px;
    position: relative;
    margin: 0 auto;
    background-image:url('https://img2.baidu.com/it/u=3862222431,4215739297&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=316');
    background-size: 100% 100%;
}
.middle button
{
     width: 130px;
    height: 80px;
    font-size: 24px;
    position: absolute;
    left: 45%;
    top:60%; 
     opacity: 80%; 
}
</style>