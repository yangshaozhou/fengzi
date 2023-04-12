<template>
  <div class="List">
    <div class="descriped">
      <div class="title">最近一周刷题榜单</div>
    </div>
    <hr />
    <ul class="userList">
      <li>
        <div class="paihang">排名</div>
        <div class="info">用户名</div>
        <div class="acount">题目通过数</div>
      </li>
      <li v-for="item in paihangList" :key="item.id">
        <div class="paihang">
            {{item.Num}}
        </div>
        <div class="userMessage">
          <img  :src="item.attarImg" class="avar" alt="" />
          <div class="player">{{item.userName}}</div>
        </div>
        <div class="acount">{{item.acNum}}</div>
      </li>
       
    </ul>
  </div>
</template>
  
  <script>
import { reactive, ref } from '@vue/reactivity';
export default {
     name:'SortList',
     setup()
     {
        let paihangList = reactive([
            {
               Num:1,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_c94dc.jpg',
               userName:'111',
               acNum:20
            },
            {
              Num:2,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_b1149.jpg',
               userName:'222',
               acNum:19
            },
            {
              Num:3,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_52d8f.jpg',
               userName:'333',
               acNum:18
            },
            {
              Num:4,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_ad176.jpg',
               userName:'444',
               acNum:17
            },
            {
              Num:5,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_ad25f.jpg',
               userName:'555',
               acNum:16
            },
            {
              Num:6,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_33e7b.jpg',
               userName:'666',
               acNum:15
            },
            {
              Num:7,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_6a654.jpg',
               userName:'777',
               acNum:14
            },
            {
              Num:8,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123659_4c804.jpg',
               userName:'888',
               acNum:13
            },
            {
              Num:9,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123659_d5cf9.jpg',
               userName:'999',
               acNum:12
            },
            {
              Num:10,
               attarImg:'https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123659_ffaf0.jpg',
               userName:'1010',
               acNum:11
            },
        ])
        return {
           paihangList
        }
     }
};
</script>
  
  <style scoped>
.List {
  width: 40%;
  height: 600px;
  margin-left: 40px;
  margin-top: 78px;
  box-shadow: grey 0 5px 5px 3px;
  padding: 20px;
}


.List .descriped .title {
  color: rgb(38, 164, 242);
  font-size: 30px;
  text-align: center;
  font-weight:bolder; /*设置字体粗细*/
		   -webkit-text-stroke:1px #0066ff;        /*文字描边*/
		   -webkit-text-fill-color:transparent;    /*设置文字的填充颜色*/

}
.userList li {
  height: 50px;
  line-height: 50px;
  display: flex;
  border-bottom: 1px solid black;
  color: black;
  justify-content: space-around;
}
.userList li .avar
{
   width: 30px;
   height: 30px;
   background-color: #bfa;
   margin-top: 8px;
   border-radius: 50%;
   display: block;
}
.userList li .paihang {
   color: black;
   font-size: 20px;
}
.userList li .info {
  color: black;
  font-size: 20px;
}
.userList li .acount {
   color: black;
   font-size: 20px;
}
.userList .player{
   color:rgb(44, 172, 237);
   font-size: 18px;
}

.userList .userMessage{
  display: flex;
}
</style>