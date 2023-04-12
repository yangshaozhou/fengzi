<template>
   <div class="block">
    <el-carousel height="150px" type="card">
      <el-carousel-item v-for="item in imagList" :key="item">
        <img :src="item.idView" class="image">
        <h3 class="small">{{ item }}</h3>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
export default {
    name:'ShowPic',
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
}
</script>

<style scoped>
  .block
  {
    width: 100%;
    margin: 10px auto;
  }
  .image
  {
    width: 100%;
    height: 100%;
  }
  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 150px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
     background-color: #99a9bf;
  }
  
  .el-carousel__item:nth-child(2n+1) {
     background-color: #d3dce6;
  }
</style>