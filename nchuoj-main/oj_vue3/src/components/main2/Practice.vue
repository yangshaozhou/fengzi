<template>
  <div class="practice">
    <h2 class="title">训练表单</h2>
    <hr />
    <div v-for="item in desContent" :key="item.id">
      <div class="descriped">
         <div class="headline">{{item.headline}}</div>
         <div class="state">{{ item.state }}</div>
     </div>
     <div class="desBox">
      <el-button type="primary" class="bt" round>{{ item.way }}</el-button>
      <el-button type="primary" class="bt" round>{{ item.startTime }}</el-button>
      <el-button type="primary" class="bt" round>{{ item.duringTime }}</el-button>
      <el-button type="default" class="bt" color='pink' round>{{ item.competition }}</el-button>
     </div>
     <hr>
    </div>
   
     <div>
        
     </div>
     <div>
        
     </div>
  </div>
</template>

<script>
import { reactive } from '@vue/reactivity';
export default {
  setup()
  {
     let desContent=reactive([
      {
          headline:'DP专题',
          state:"进行中",
          way:"OI",
          startTime:'11.11',
          duringTime:'7天',
          competition:"个人赛"
      },
      {
         headline:'贪心专题',
         state:'进行中',
         way:"OI",
          startTime:'12.11',
          duringTime:'7天',
          competition:"个人赛"
      }
     ])
     return {
         desContent
     }
  }
};
</script>

<style scoped>
.practice {
  width: 40%;
  height: 350px;
  color: black;
  box-shadow: grey 0 5px 8px 3px;
}
.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.text {
  font-size: 14px;
}
.title{
    display: block;
    widows: 100px;
    margin:10px 0 10px 10px;
    color: rgb(234, 224, 192);  
    text-align: center;
    letter-spacing: -2px; /*设置字符间距*/
		  text-shadow: 0px 0px 2px; /*设置文字阴影*/
		  transform-style: preserve-3d;  /*设置元素保留3D位置*/
		  animation: a1 3s infinite alternate ;    /*设置动画*/
		  animation-fill-mode: forwards;
}

@keyframes a1 {         /*创建动画*/
			  0% {
			    transform:rotateX(20deg) rotateY(40deg);
			  }
			  50%{
			   transform:rotateX(0deg) rotateY(45deg);
			  }
			  100% {
			    transform:rotateX(45deg) rotateY(0deg);
			  }
        }

.item {
  margin-bottom: 18px;
}

.box-card {
  height: 200px;
  color: black;
}
.text{
  color:black
}
.title{
  color: black;
}
.descriped
{
   height: 40px;
   line-height: 40px;
   display:flex;
   flex-direction: row;
   border-bottom:1px solid black;
   justify-content: space-between;
}
.desBox
{
  padding: 10px;
  display: flex;
  justify-content: space-around;
   height: 70px;
}

.headline
{
   font-size: 24px;
   color: green;
   display: block;
   margin-left: 20px;
}
.state{
   width:60px;
   height: 25px;
   line-height: 25px;
   background-color: rgb(28, 236, 45);
   margin: auto 0;
   margin-right:30px;
   text-align: center;
}
</style>