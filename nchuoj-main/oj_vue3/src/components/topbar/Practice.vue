<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-11-13 11:52:03
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-28 11:27:58
 * @FilePath: \oj_vue3\src\components\topbar\Practice.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
    <div class="contest">
        <div class="title">
            NCHU在线训练
        </div>
        <div class="line"></div>
        <div class="ctList">
            <div class="listItem" v-for="item in trainList" :key="item.id">
                <div class="ctImg" >
                    <img src="https://ts3.cn.mm.bing.net/th?id=OIP-C.aHtoAZdQOTycNvORAKfZTAHaFj&w=288&h=216&c=8&rs=1&qlt=90&o=6&dpr=2&pid=3.1&rm=2" alt="">
                    <div class="des">
                    <div class="name" @click="go(item.id,listData)">
                        {{ item.trainName }}
                    </div>
                    <div class="detail">
                        {{ item.detail }}
                    </div>
                </div>
                </div>
               
                <div class="competitor">
                    <div class="desc">参与人数</div>
                    <div class="num">{{ item.ptcNum }}</div>
                </div>
                <div class="duringTime">
                    开始时间
                    <br>
                    {{item.startTime}}
                </div>
                <div class="state" v-if="item.state===1">
                    进行中
                </div>
                <div id="end" v-else>
                    已结束
                </div>
            </div>
        </div>
    </div>
  </template>
  
  <script>
import {ref,reactive} from 'vue'
  import { useRouter } from 'vue-router'
  export default {
    setup()
    {
        const router = useRouter()
        let listData = reactive([
            {
                id:'1001',
                name:'简单背包问题',
                
            },
            {
                id:'1002',
                name:'简单背包问题',
                
            },
            {
                id:'1003',
                name:'简单背包问题',
                
            },
            {
                id:'1004',
                name:'简单背包问题',
                
            }
        ])
        let go = (id,data)=>{
            router.push({
               path:'/train',
               query:{id,data}
            })
        }
        const trainList = reactive([
            {
                id:'1001',
                trainName:'第九场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:190,
                startTime:'2023-2-12 19:00',
                state:1
            },
            {
                id:'1002',
                trainName:'第八场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:140,
                startTime:'2023-2-1 19:00',
                state:0
            },
            {
                id:'1003',
                trainName:'第九场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:190,
                startTime:'2023-2-12 19:00',
                state:0
            },
            {
                id:'1004',
                trainName:'第九场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:190,
                startTime:'2023-2-12 19:00',
                state:'进行中'
            },
            {
                id:'1005',
                trainName:'第九场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:190,
                startTime:'2023-2-12 19:00',
                state:'进行中'
            },
            {
                id:'1006',
                trainName:'第九场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:190,
                startTime:'2023-2-12 19:00',
                state:'进行中'
            },
            {
                id:'1007',
                trainName:'第九场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:190,
                startTime:'2023-2-12 19:00',
                state:'进行中'
            },
            {
                id:'1008',
                trainName:'第九场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:190,
                startTime:'2023-2-12 19:00',
                state:'进行中'
            },
            {
                id:'1009',
                trainName:'第九场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:190,
                startTime:'2023-2-12 19:00',
                state:'进行中'
            },
            {
                id:'1010',
                trainName:'第九场周赛',
                detail:'NCHUCT杯-第9场周赛',
                ptcNum:190,
                startTime:'2023-2-12 19:00',
                state:'进行中'
            },
        ])
        return {
              go,
              trainList,
              listData
        }
    }
  
  }
  </script>
  
  <style lang="less" scoped>
  .contest
  {
    margin-top: 10px;
     width: 80%;
     height: 900px;
     margin: 0 auto;
     background: rgb(222, 220, 220);
    
     .title
     {
        width: 500px;
        font-size: 40px;
        color: black;
        margin-left: 25%;
        padding-top: 30px;
        text-align: center;
        animation:swing 2s ease-in;/*设置动画*/
        @keyframes swing{/*创建动画*/
		   20%{
		      transform:rotate(15deg);
		   }40%{
		      transform:rotate(-15deg);
		   }60%{
		        transform:rotate(5deg);
		   }80%{
		      transform:rotate(-5deg);
		   }100%{
		      transform:rotate(0deg);
		   }
        }
     }
     .line
     {
        width: 90%;
        height: 1px;
        background: black;
        margin: 0 auto;
        margin-top: 20px;
        margin-bottom: 30px;
     }
     .ctList
     {
        display: flex;
        flex-direction: column;
        .listItem:nth-child(2n+1)
        {
            background-color: rgb(215, 217, 214);
        }
        .listItem
        {
            position: relative;
             width: 100%;
             height: 100px;
             background: rgb(200, 203, 200);
             display: flex;
             flex-direction: row;
             justify-content: space-between;
             .ctImg
             {
                display: flex;
                flex-direction: row;
                img{
                width: 80px;
                height: 80px;
                border-radius: 50%;
                margin-top: 10px;
                margin-left: 40px;
                }
                .des
             {
                margin-top:20px;
                margin-left: 10px;
               .name:hover{
                    color: rgb(43, 156, 226);
                }
                .name
                {
                    font-size: 30px;
                    text-decoration: none;
                    color: black;
                }
                .detail
                {
                    color: black;
                }
             }
             }
             
             .competitor
             {
                
                  display:flex;
                  flex-direction: column;
                  margin-top: 30px;
                  .desc
                  {
                    font-size: 20px;
                    color: black;
                  }
                  .num
                  {
                     
                     color: black;
                  }
             }
             .duringTime
             {
                margin-top: 25px;
                margin-right: 40px;
                font-size: 20px;
                color: black;
             }
             .state
             {
                position: absolute;
                right: 10px;
                top: 5px;
                width: 60px;
                height: 30px;
                line-height: 30px;
                border-radius: 20px;
                text-align: center;
                background: rgb(125, 230, 125);
             }
             #end{
                position: absolute;
                right: 10px;
                top: 5px;
                width: 60px;
                height: 30px;
                line-height: 30px;
                border-radius: 20px;
                text-align: center;
                background: rgb(234, 62, 50);
             }
        }
     }
  }
  </style>