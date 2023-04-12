<template>
  <div class="List">
    <div class="descriped">
      <div class="title">最新题目</div>
    </div>
    <hr />
    <ul class="userList">
      <li>
        <div class="paihang">题目ID</div>
        <div class="userMessage">标题</div>
        <div class="acount">最近更新</div>
      </li>
      <li v-for="item in problemList" :key="item.id">
        <div class="paihang">
          {{ item.ID }}
        </div>
        <div class="userMessage">
          {{ item.title }}
        </div>
        <div class="acount">
          {{ item.updataTime }}
        </div>
      </li>
    </ul>
  </div>
</template>
    
<script >
import { reactive } from "@vue/reactivity";
import { problemListApi } from "@/api/problem";
import { onMounted } from "vue";

export default {
  name: "problemList",
  setup() {
    console.log("hello");

    // onMounted(async () => {
    //   console.log("setup");
    //   const response = await problemListApi.getAllProblem(50, 0);
    //   console.log("题目的的res");
    //   console.log(response);
    //   console.log("---");

    //   problemList = response.data.data; //更新响应的问题列表
    // });
    // if (response.data.code == "0x0001") {
    //   console.log(response);
    //   console.log("登录成功");

    //   //把token存在cookie中、也可以放在localStorage中
    //   cookie.set("guli_token", response.data.data.jwt, {
    //     domain: "localhost",
    //   });
    //   //那cookie里面的token换取用户信息

    //   this.loginInfo = response.data.data.userinfo;
    //   //将用户信息记录cookie
    //   cookie.set("guli_ucenter", this.loginInfo, {
    //     domain: "localhost",
    //   });
    //   //todo 跳转页面
    // }

    let problemList = reactive([
      {
        ID: "A101",
        title: "背包问题",
        updataTime: "两个星期前",
      },
      {
        ID: "A102",
        title: "DFS问题",
        updataTime: "两个星期前",
      },
      {
        ID: "A103",
        title: "最短路径问题",
        updataTime: "两个星期前",
      },
      {
        ID: "A104",
        title: "最小生成树问题",
        updataTime: "两个星期前",
      },
      {
        ID: "A105",
        title: "线段树问题",
        updataTime: "两个星期前",
      },
      {
        ID: "A106",
        title: "差分问题",
        updataTime: "两个星期前",
      },
      {
        ID: "A107",
        title: "前缀和问题",
        updataTime: "两个星期前",
      },
      {
        ID: "A108",
        title: "二分问题",
        updataTime: "两个星期前",
      },
      {
        ID: "A109",
        title: "贪心问题",
        updataTime: "两个星期前",
      },
      {
        ID: "A110",
        title: "DP问题",
        updataTime: "两个星期前",
      },
    ]);

    return {
      problemList,
    };
  },
};
</script>
    
<style scoped>
.List {
  width: 52%;
  height: 600px;
  margin-left: 20px;
  margin-top: 40px;
  box-shadow: grey 0 5px 5px 3px;
}
.List .descriped {
  margin-left: 15px;
}
.List .descriped .ic {
  width: 40px;
}
.List .descriped .title {
  color: rgb(242, 38, 137);
  font-size: 30px;
  margin-left: 40%;
  transform: skew(-25deg); /*设置倾斜角度*/
}
.userList li {
  line-height: 50px;
  height: 50px;
  display: flex;
  border-bottom: 1px solid black;
  flex-direction: row;
  color: black;
  overflow: hidden;
  justify-content: space-between;
  padding: 0 30px;
}
.userList li:nth-child(2n + 1) {
  background-color: rgb(236, 234, 234);
}
.userList li .paihang {
  color: black;
  font-size: 18px;
}
.userList li .userMessage {
  display: flex;
  flex-direction: row;
  color: black;
  font-size: 18px;
}
.userList li .acount {
  color: black;
  font-size: 17px;
}
</style>