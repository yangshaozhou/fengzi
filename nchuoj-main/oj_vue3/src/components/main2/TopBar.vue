<template>
  <div>
  <div class="navBar">
    <div>
      <img src="@/assets/img/logo.jpg" class="logo" alt="" />
    </div>
    <ul class="NavItem">
      <router-link active-class="active" class="des" to="/main/home"><li><img class="ic" src="@/assets/icofont/首页.png"/>首页</li></router-link>
      <router-link active-class="active" class="des" @click="isActive=false" to="/main/problem"><li><img class="ic" src="@/assets/icofont/题目-04.png"/>题目</li></router-link>
      <router-link active-class="active" class="des" @click="isActive=false" to="/main/practice"><li><img class="ic" src="@/assets/icofont/宠物训练1.png"/>训练</li></router-link>
      <router-link active-class="active" class="des" @click="isActive=false" to="/main/nob"><li><img class="ic" src="@/assets/icofont/排行榜_排名.png"/>排名</li></router-link>
      <router-link active-class="active" class="des" @click="isActive=false" to="/main/about"><li><img class="ic" src="@/assets/icofont/关于.png"/>关于</li></router-link>
      <router-link active-class="active" class="des" @click="isActive=false" to="/help"><li><img class="ic" src="@/assets/icofont/关于.png"/>帮助</li></router-link>
    </ul>
    <div class="login">
      <el-button type="primary" round><router-link to='/login' class="as">登入</router-link></el-button>
      <el-button type="default" color='pink' round><router-link to='/login' class="as">注册</router-link></el-button>
    </div>
  </div>
  <router-view></router-view>
</div>
</template>

<script>
import '@/assets/icofont/font_3766957_okh7c3rcws/iconfont.css'
import { ref } from '@vue/reactivity';
export default {
  name: "TopBar",

  setup() {
    let isActive=ref(true)
    return {
      isActive
    };
  },
};
</script>

<style scoped>
* {
  text-align: none;
  margin: 0;
  padding: 0;
  list-style: none;
  text-decoration: none;
}
.active
{
  background-color: rgb(29, 145, 234);
}

.des{
   color: black;
}
#blur
{
   background-color:rgb(29, 145, 234) ;
}
.logo {
  height: 60px;
  margin-left: 50px;
}
.navBar {
  display: flex;
  flex-direction: row;
  height: 60px;
  line-height: 60px;
  border: 1px solid black;
  box-shadow: gray 0 0 10px 0;
  position: static;
  z-index: 999;
}
.navBar .NavItem {
  width: 600px;
  display: flex;
  flex-direction: row;
  height: 60px;
  line-height: 60px;
}
.NavItem i
{
   color: black;
}
.NavItem li{
    width: 100px;
    line-height: 60px;
    padding-top: 5px;
}
.NavItem a {
   width: 100%;
   height: 100%;
}


 .NavItem li .ic
 {
     margin-left: 25px;
     width: 25px;
     height: 25px;
     display: inline-block;
 }
.navBar .login
{
    position: absolute;
    right: 10px;
}
.navBar .NavItem li {
  color: black;
}
</style>