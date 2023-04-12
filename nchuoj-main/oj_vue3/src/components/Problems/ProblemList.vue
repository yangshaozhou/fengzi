<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2023-01-16 20:41:22
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-27 22:39:11
 * @FilePath: \oj_vue3\src\components\Problems\ProblemList.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
  <div class="List">
    <hr />
    <ul class="userList">
      <li>
        <div class="paihang">题目ID</div>
        <div class="userMessage">标题</div>
        <div class="passPc">通过率</div>
        <div class="hard">难度</div>
      </li>
      <li v-for="item in problemList" :key="item.id">
        <div class="paihang">
          {{ item.shortName }}
        </div>
        <div class="userMessage" @click="jump(item.id)">
          {{ item.chineseName }}
        </div>
        <div class="passPc">待统计</div>
        <div class="hard">
          {{ item.grade }}
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
import { reactive } from "@vue/reactivity";
import { filter } from "lodash";
import { useStore } from "vuex";
import { useRouter } from "vue-router";
import problemListApi from "../../api/problem.js";
import { LoginApi } from "@/api/login";
import { onMounted } from "vue";
export default {
  name: "problemList",
  setup() {
    let problemList = reactive([
      {"chineseName":"数学题1","createById":0,"createByName":"LeiXin","delFlag":0,"grade":1,"id":1,"questionType":0,"shortName":"P10001","status":0,"updateById":0},{"chineseName":"数学题2","createById":0,"createByName":"LeiXin","delFlag":0,"grade":1,"id":2,"questionType":0,"shortName":"P10005","status":0,"updateById":0},{"chineseName":"数学题3","createById":0,"createByName":"LeiXin","delFlag":0,"grade":1,"id":4,"questionType":0,"shortName":"P10006","status":0,"updateById":0},{"chineseName":"数学题4","createById":0,"createByName":"LeiXin","delFlag":0,"grade":1,"id":5,"questionType":0,"shortName":"P10007","status":0,"updateById":0},{"chineseName":"数学题5","createById":0,"createByName":"LeiXin","delFlag":0,"grade":1,"id":6,"questionType":0,"shortName":"P10008","status":0,"updateById":0},{"chineseName":"数学题6","createById":0,"createByName":"LeiXin","delFlag":0,"grade":1,"id":7,"questionType":0,"shortName":"P10009","status":0,"updateById":0},{"chineseName":"数学题7","createById":0,"createByName":"LeiXin","delFlag":0,"grade":1,"id":8,"questionType":0,"shortName":"P10010","status":0,"updateById":0}]
    );
    onMounted(async () => {
      console.log("setup");

      problemListApi.getAllProblem(50, 0).then((response) => {
        console.log("问题的res");
        console.log(response);
        console.log("---");
        if (response.data.code == "200") {
          response.data.data.questionBanks.forEach((item) => {
            problemList.push(item);
          });

          console.log(111, problemList);
        }
      });

      // problemList = response.data.data; //更新响应的问题列表
    });
    let store = useStore();

   
    store.commit("updateState", problemList);
    let filterData = reactive([]);
    filterData = store.state.filteredList;
    const router = useRouter();
    let jump = function (id) {
      router.push(`/code/${id}`);
    };
    return {
      problemList,
      filterData,
      jump,
    };
  },
};
</script>

<style scoped>
.List {
  width: 98%;
  height: 600px;
  padding: 10px;
}

.userList li {
  line-height: 50px;
  height: 50px;
  display: flex;
  border-bottom: 1px solid black;
  flex-direction: row;
  color: black;
  overflow: hidden;
}
.userList li:nth-child(2n + 1) {
  background-color: rgb(195, 204, 212);
}
.userList li:nth-child(2n) {
  background-color: azure;
}
.userList li .paihang {
  color: black;
  font-size: 18px;
  flex: 1;
}
.userList li .userMessage {
  display: flex;
  flex-direction: row;
  flex: 3;
  color: black;
  font-size: 18px;
  padding-left: 50px;
}
.userList li .passPc {
  color: black;
  font-size: 17px;
  flex: 1;
}
.userList li .hard {
  color: black;
  font-size: 17px;
  flex: 1;
}
</style>