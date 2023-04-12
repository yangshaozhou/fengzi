<template>
  <div class="paihang">
    <div class="List">
      <div class="descriped">
        <img class="ic" src="" />
        <div class="title">最近一周刷题榜单</div>
      </div>
      <hr />
      <ul class="userList">
        <li>
          <div class="pai">排名</div>
          <div class="userMessage">用户名</div>
          <div class="acount">题目通过数</div>
        </li>
        <li v-for="item in paihangList" :key="item.id">
          <div class="pai">
            {{ item.Num }}
          </div>
          <div class="userMessage">
            <img  :src="item.attarImg" class="avar" alt="" />
            <div class="userName">{{ item.userName }}</div>
          </div>
          <div class="acount">{{ item.acNum }}</div>
        </li>
      </ul>
    </div>

    <div class="cList">
      <div class="descriped">
        <img class="ic" src="" />
        <div class="title">刷题总数排行榜</div>
      </div>
      <hr />
      <ul class="userList">
        <li>
          <div class="pai">排名</div>
          <div class="userMessage">用户名</div>
          <div class="acount">题目通过数</div>
        </li>
        <li v-for="item in paihangList" :key="item.id">
          <div class="pai">
            {{ item.Num }}
          </div>
          <div class="userMessage">
            <img width="40px" :src="item.attarImg" class="avar" alt="" />
            <div class="userName">{{ item.userName }}</div>
          </div>
          <div class="acount">{{ item.acNum }}</div>
        </li>
      </ul>
    </div>
  </div>
</template>
  
  <script>
import { reactive } from "@vue/reactivity";
export default {
  setup() {
    let paihangList = reactive([
      {
        Num: 1,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_c94dc.jpg",
        userName: "111",
        acNum: 20,
      },
      {
        Num: 2,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_b1149.jpg",
        userName: "222",
        acNum: 19,
      },
      {
        Num: 3,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_52d8f.jpg",
        userName: "333",
        acNum: 18,
      },
      {
        Num: 4,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_ad176.jpg",
        userName: "444",
        acNum: 17,
      },
      {
        Num: 5,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_ad25f.jpg",
        userName: "555",
        acNum: 16,
      },
      {
        Num: 6,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_33e7b.jpg",
        userName: "666",
        acNum: 15,
      },
      {
        Num: 7,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123758_6a654.jpg",
        userName: "777",
        acNum: 14,
      },
      {
        Num: 8,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123659_4c804.jpg",
        userName: "888",
        acNum: 13,
      },
      {
        Num: 9,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123659_d5cf9.jpg",
        userName: "999",
        acNum: 12,
      },
      {
        Num: 10,
        attarImg:
          "https://c-ssl.duitang.com/uploads/blog/202207/04/20220704123659_ffaf0.jpg",
        userName: "1010",
        acNum: 11,
      },
    ]);
    return {
      paihangList,
    };
  },
};
</script>
  
  <style lang="less" scoped>
.paihang {
  width: 80%;
  height: 1200px;
  background: rgb(222, 220, 220);
  margin: 0 auto;
  .List,.cList {
    width: 80%;
    height: 500px;
    margin: 0 auto;
    box-shadow: grey 0 5px 5px 3px;
    padding: 20px;
  }
  .List .descriped,.cList .descriped {
    margin-left: 15px;
    display: flex;
    justify-content: center;
  }
  .List .descriped .ic,.cList .descriped .ic {
    width: 40px;
  }
  .List .descriped .title,.cList .descriped .title {
    color: rgb(38, 164, 242);
    font-size: 30px;
  }
  .userList li {
    line-height: 40px;
    height: 40px;
    display: flex;
    justify-content: space-around;
    border-bottom: 1px solid black;
    color: black;
    overflow: hidden;
  }
  .userList li:nth-child(0)
  {
     background: goldenrod;
  }
  .userList li .avar {
    width: 30px;
    height: 30px;
    background-color: #bfa;
    margin-top: 8px;
    border-radius: 50%;
  }

  .userList li .pai {
    color: black;
    font-size: 20px;
  }
  .userList li .userMessage {
    display: flex;
    flex-direction: row;
    color: black;
    font-size: 20px;
  }
  .userList li .acount {
    color: black;
    font-size: 20px;
  }
  .userName {
    color: rgb(44, 172, 237);
    font-size: 18px;
    line-height: 50px;
  }
  .cList
  {
    top: 600px;
  }

  .cList{
    margin-top: 50px;
  }
}

</style>