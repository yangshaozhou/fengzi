<template>
  <div class="topBar">
       <img src="../../assets/img/logo.jpg" class="logo" alt="">
       <h3 class="title">南昌航空大学在线OJ平台</h3>
       <div class="login">
        <img src="../../assets/img/游客.png" class="youke" alt="">
        <router-link to="/login" class="as">注册</router-link>
        <div class="line"></div>
        <router-link to='/login' class="as">登录</router-link>
       </div>
    </div>
</template>

<script>
export default {
    name:'TopBar',
    setup() {
        return {
           
        }
    }

}
</script>

<style scoped>
*
{
    margin: 0;
    padding: 0;
    text-decoration: none;
}
body
{
     background-color: #000;
}
.topBar
{
    width: 100%;
    height: 50px;
    background-color: black;
    line-height: 50px;
}
.topBar .logo
{
    width: 80px;
    height: 100%;
    margin: 0 auto;
    float: left;
    border-radius: 50%;
    margin-left: 90px;
    margin-right: 30px;
}
.topBar .youke
{
     background-color: white;
}
.topBar .title
{
    color: white;
    float: left;
}
.topBar .login
{
    height: 50px;
    text-align: center;
    margin-right: 90px;
    float: right;
    display: flex;
}
.topBar .login img
{
    width: 40px;
    height: 40px;
    border-radius: 50%;
    margin-top: 5px;
    margin-right: 10px;
    background-color: gray;
}
.topBar .login .as
{
    text-align: center;
    color: white;
    display: inline-block;
}
.topBar .login .as:hover
{
    color: red;
}
.topBar .login .line
{
    width: 1px;
    height: 20px;
    margin: auto 5px;
    background-color: white;
}

</style>