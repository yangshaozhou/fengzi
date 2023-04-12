<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-11-12 19:17:23
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-28 21:39:19
 * @FilePath: \oj_vue3\src\components\main2\lunbotu.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
  <div class="show">
    <h2 class="item">欢迎使用南昌航空大学在线OJ</h2>
    <el-carousel indicator-position="outside" class="lunbotu">
      <el-carousel-item v-for="item in imagList" :key="item.id">
        <img :src="item.idView" class="image">
        <h3 text="2xl" justify="center">{{ item }}</h3>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
export default {
  name:'lunbotu',
  setup() {
        return {
            imagList:[
                {id:0,idView:'https://img2.baidu.com/it/u=3862222431,4215739297&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=316'},
                {id:1,idView:'https://tse3-mm.cn.bing.net/th/id/OIP-C.KrnDTlvigkNANiz3rIp1SgHaDN?w=337&h=151&c=7&r=0&o=5&dpr=1.9&pid=1.7'},
                {id:2,idView:'https://ts1.cn.mm.bing.net/th?id=OIP-C.zAQFDaSgVFTYCNQa9xzq4AHaES&w=272&h=165&c=8&rs=1&qlt=90&o=6&dpr=1.9&pid=3.1&rm=2'},
                {id:3,idView:'https://tse3-mm.cn.bing.net/th/id/OIP-C.wnUQSezovauCyyQ-f8f0rgHaEz?w=269&h=180&c=7&r=0&o=5&dpr=1.9&pid=1.7'},
            ]
        }
    },
};
</script>


<style scoped>
  .show
  {
     margin-top: 40px;
     margin-left: 20px;
     box-shadow: grey 0px 6px 6px;
     width: 50%;
     padding: 0 20px;
  }
  h2{
    display: block;
    margin: 0 auto;
    margin-bottom: 5px;
    margin-left: 250px;
    color: rgb(39, 152, 213);
    margin-left: 150px;
  }
.el-carousel__item h3 {
  display: flex;
  color: #475669;
  opacity: 0.75;
  line-height: 300px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n + 1) {
  background-color: #d3dce6;
}
.image{
   width: 100%;
   height: 100%;
}

.item{
  background:-webkit-linear-gradient(top, #37216e, #7ca733,#d3dce6);/*设置线性渐变*/
  background-clip: text;/*背景被裁剪到文字*/
	-webkit-text-fill-color: transparent;/*设置文字的填充颜色*/
}
</style>