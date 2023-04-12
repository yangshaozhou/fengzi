<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2023-01-26 22:04:02
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-27 15:06:59
 * @FilePath: \oj_vue3\src\views\codeCompeior.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
  <div class="codePage">
    <div class="problemDes">
      <div class="topBar">
        <div class="back">
          <img src="../assets/left.png" alt="">
        </div>
        <div class="probleName">{{prblemInfo.chineseName}}</div>
      </div>
      <div class="content">
        <div class="headLine">题目描述</div>
        <div class="problem">
          <div style="color:black" v-html="prblemInfo.mdCn" ></div>
        </div>
        <div class="headLine">
                <!-- 输入描述 -->
          </div>
        <div class="inputDes">
          <!-- 输入一行包含一个单词，单词只由小写英文字母组成。 -->
          <br />
          <!-- 对于所有的评测用例，输入的单词长度不超过 1000。 -->
        </div>
        <div class="headLine">
          <!-- 输出描述 -->
        </div>
        <div class="outputDes">
          <!-- 输出两行，第一行包含一个英文字母，表示单词中出现得最多的字母是哪
          个。如果有多个字母出现的次数相等，输出字典序最小的那个。 -->
          <br />
          <!-- 第二行包含一个整数，表示出现得最多的那个字母在单词中出现的次数。 -->
        </div>
        <div class="headLine">
          <!-- 输入输出描述 -->
        </div>
        <div class="example">
          <div class="title">
            <!-- 示例 -->
          </div>
          <div class="showContent"></div>
        </div>
        <div class="headLine">
          <!-- 运行限制 -->
        </div>
        <ul class="limitList">
          <li>最大运行时间：1s</li>
          <li>最大运行内存：256M</li>
        </ul>
      </div>
    </div>

    <div v-if="this.result=='Accepted'" class="answer">
      <img src="../assets/img/ac.png" alt="">
    </div>

    <div class="right">
      <div class="language">
      <div class="head">编译语言:</div>
      <div class="flex flex-wrap items-center">
    <el-dropdown >
      <el-button type="primary" class="list">
        {{ firstchoose }}<el-icon class="el-icon--right"><arrow-down /></el-icon>
      </el-button>
      <template #dropdown>
        <el-dropdown-menu>
          <el-dropdown-item style="width: 90px;" @click="choose=!choose">{{ lastchoose }}</el-dropdown-item>
        </el-dropdown-menu>
      </template>
    </el-dropdown>
  </div>
    <div v-if="this.final!=''" class="fault">
      <p class="context">{{ this.final }}</p>
    </div>
    </div>
<!-- 编辑器 -->

    <div class="ace">
      <div ref="ace" class="ace-editor"/></div>
      <div class="contorl">
        <el-button class="btn" type="success" round @click="getcode">提交测试</el-button>
      </div>
    </div>
</div>
</template>

<script >
import Cookies from 'js-cookie'
import axios from 'axios';
import codelist from '../api/problem.js'
import { marked }from 'marked';
import { useRoute } from 'vue-router'
// ace-editor
import ace from 'ace-builds'
// ace主题包
import 'ace-builds/src-min-noconflict/theme-kuroir'
import 'ace-builds/src-min-noconflict/theme-one_dark'
import 'ace-builds/src-min-noconflict/theme-github'
// ace 检索框
import 'ace-builds/src-min-noconflict/ext-language_tools'
import 'ace-builds/src-min-noconflict/ext-searchbox'
import jsCookie from 'js-cookie';
export default{
  name:'Code',
  data(){
    return{
      editor:null,
      choose:true,
      a:'Java',
      b:'C++',
      id:'',
      prblemInfo:{
      chineseName: "数学题",
      contestId: 0,
      createById: 0,
      createByName: "leixin",
      delFlag: 0,
      englishName: "math problems",
      grade: 1,
      id: 1,
      mdCn: "",
      questionType: 1,
      shortName: "P10001",
      status: 0,
      updateById: 0,
    },
    commitVo:{
      code: 1,
      topicId:1,
      languageId: 1,
      questionType: "1",
      contestId: "-1",
    },
    backinfo:{
      memory: 401408,
        files: {
      stdout: "18\n",
      stderr: ""
      },
     time: 1647497,
      runTime: 7049465,
      exitStatus: 0,
      status: "Accepted"
    },
    result:'',
    final:''
    }
  },
  computed:{
    firstchoose(){
     return this.choose?this.a:this.b;
    },
    lastchoose(){
      return this.choose?this.b:this.a;
    }
  },
  methods:{
    getcode(){
      const info=this.editor.getValue();
      console.log(JSON.stringify(info))
      const token=Cookies.get('guli_token')
      this.commitVo.topicId=this.id
      // this.commitVo.code=JSON.stringify(info)
      this.commitVo.code=info
      console.log(this.commitVo.code)
      this.languageId=this.choose?"1":"2"
      // codelist.getProblemById(token,this.commitVo)
      console.log(this.commitVo)
      axios({
        method:'get',
        url:'https://www.fastmock.site/mock/f81f6f86fbf9146d22574ae8fbc6a4c9/adu/judge'
      }).then((response)=>{
        console.log("----",response.data.status)
        this.result=response.data.status
        this.final=response.data.status
        if(this.final!='Accepted')
        {
        console.log("aaa2222",this.final)
        alert('抱歉你的答案不正确，错误原因为'+this.final)
       }
      })
      setTimeout(()=>{
        this.result=''
      },1000)
    }
  },
  watch:{
   result:{
    handler(newval,oldval)
    {
      console.log("@@@@",newval,oldval)
    }
   }
  },
  mounted(){
    const router=useRoute()
    this.id=router.params.id
    console.log(this.id)
    // codelist.getProblemById(this.id,token).then((response)=>{
    //   if(response.data.code=="200"){
      // const pool=response.data.codeinfo
      // console.log(pool)
      // this.prblemInfo.mdCn = marked(pool.mdCn)
    //   }
    // })

    axios({
      method:'get',
      url:'https://www.fastmock.site/mock/f81f6f86fbf9146d22574ae8fbc6a4c9/adu/pre',
      data:{
        id:'1'
      }
    }).then((response)=>{
      const pool=response.data.codeinfo
      console.log(pool)
      this.prblemInfo.mdCn = marked(pool.mdCn)
    })
    
    ace.config.set("basePath", "https://cdnjs.cloudflare.com/ajax/libs/ace/1.4.14/");
    this.editor = ace.edit(this.$refs.ace, {
      fontSize: 14, // 编辑器内字体大小
      theme: 'ace/theme/kuroir', // 默认设置的主题
      mode: 'ace/mode/java', // 默认设置的语言模式
      tabSize: 4,// 制表符设置为 4 个空格大小
      readOnly: false //只读
    });
  }
}
</script>

<style lang="less" scoped>
.codePage {
  width: 100%;
  height: 100%;
  background-color: rgb(146, 142, 142);
  display: flex;
  position: relative;
  .problemDes {
    width: 50%;
    background: rgb(247, 248, 246);
    overflow: auto;
    .topBar {
      height: 50px;
      line-height: 50px;
      background-color: white;
      display: flex;
      .probleName {
        color: black;
        font-size: 26px;
      }
    }
    .content{
        height: 750px;
        overflow: auto;
    }
    .headLine
    {
        font-size: 25px;
        margin-left: 20px;
        margin-top: 20px;
        margin-bottom: 20px;
        color: black;
    }
    .problem,.inputDes,.outputDes,.limitList li{
        color: rgb(66, 64, 64);
        font-size: 20px;
        margin-left: 20px;
        margin-right: 10px;
    }
    .limitList
    {
        margin-left: 20px;
    }
    .example
    {
        margin-left: 20px;
        .showContent
        {
            width: 600px;
            height: 50px;
            background-color: black;
        }
        .title
        {
            font-size: 20px;
            color: black;
        }
    }
    .back {
      img{
        width: 30px;
        height: 30px;
        margin-top: 10px;
        margin-right: 30px;
      }
    }
    .submitBox
    {
        position: relative;
        bottom: 0;
        height: 50px;
        line-height: 50px;
        button{
            padding: 0 50px;
            height: 40px;
            background-color: orange;
            border: none;
            border-radius: 30px;
            position: absolute;
            right: 50px;
        }
    }
  }
  .ace{
    height: 650px;
    .ace-editor{
      height: 643px;
    }
  }
}

.example-showcase .el-dropdown + .el-dropdown {
  margin-left: 15px;
}
.example-showcase .el-dropdown-link {
  cursor: pointer;
  color: var(--el-color-primary);
  display: flex;
  align-items: center;
}

.language
{
  width: 300px;
  height: 100px;
  background-color: #28343c;
  display: flex;
  height: 54px;
  width: 800px;
  padding: 10px;
  box-shadow: 0 0 0 -5px #28343c;
  .head{
    height: 54px;
    width: 80px;
    text-align: center;
    line-height: 54px;
    font-size: 1rem;
    scroll-behavior: smooth;
    color: #f9f9f9;
    margin-right: 15px;
  }
  .list{
    width: 120px;
    height: 35px;
    margin-top:10px ;
    background-color: #516169;
    border: 1px solid #516169;
  }
}

.right{
  position: relative;
}

.contorl{
    position: absolute;
    width: 100%;
    height: 100px;
    bottom:0;
    z-index: 999;
    background-color: #212529;
    border-top: 1px solid #516169 ;
  }

.btn{
  margin-left: 650px;
  margin-top: 30px;
  width: 150px;
  height: 50px;
}

.answer{
  position: absolute;
  top:10%;
  left: 32%;
  z-index: 99;
}

.fault{
  width: 25%;
  height: 9%;
  position: absolute;
  bottom: 2%;
  left:5%;
  z-index: 9999;
  background-color: #e6e7e1;
  border-radius: 20%;
  .context{
    font-size: 30px;
    text-align: center;
    line-height: 9%;
    color: red;
  }
}
</style>