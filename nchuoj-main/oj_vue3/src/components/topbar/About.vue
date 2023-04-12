<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-11-13 11:53:14
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-26 21:19:09
 * @FilePath: \oj_vue3\src\components\topbar\About.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
  <div>
      <div class="about">
           <div class="introduction">
            <div class="title">支持语言说明</div>
               <hr>
               <div class="labels">
                <div class="c">c语言</div>
               <div class="cplus">c++</div>
               <div class="python">python3</div>
               <div class="java">java</div>
               <div class="js">javaScript</div>
               <div class="PHP">PHP</div>
               <div class="Go">Golang</div>
                <div class="ct">c#</div>
               </div>
           </div>
           <div class="resIntroduce">
               <div class="title">结果说明</div>
               <hr>
              <div class="itList">
                <div class="ListItem">
                  <div class="bt">pending</div>
                  <div class="text">您的解答正在排队等待评测中，请等待结果...</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Submitted Failed</div>
                  <div class="text">您的此次提交失败，请点击按钮重新提交...</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Compiling</div>
                  <div class="text">正在对您的源代码进行编译中，请等待结果...</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Judging</div>
                  <div class="text">正在使用测试数据运行您的程序中，请等待结果...</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Compile Error</div>
                  <div class="text">无法编译您的源代码，点击链接查看编译器的输出。</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Presentation Error</div>
                  <div>您提交的代码已经很接近正确答案，请检查代码格式输出是否有多余空格，换行等空白符。</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Partial Accepted</div>
                  <div class="text">加油！您提交的代码通过了部分测试点，请考虑其他可能性。</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Accepted</div>
                  <div class="text">恭喜! 您的解题方法是正确的。</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Wrong Answer</div>
                  <div class="text">您的程序输出结果与判题程序的答案不符。</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Time Limit Exceeded</div>
                  <div class="text">您的程序运行时间已超出题目限制。</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Memory Limit Exceeded</div>
                  <div class="text">您的程序实际使用的内存已超出题目限制。</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Runtime Error</div>
                  <div class="text">您的程序异常终止，可能的原因是：段错误，被零除或用非0的代码退出程序。</div>
                </div>
                <div class="ListItem">
                  <div class="bt">System Error</div>
                  <div class="text">糟糕，判题机系统出了问题。请报告给管理员。</div>
                </div>
                <div class="ListItem">
                  <div class="bt">Cancelled</div>
                  <div class="text">您的此次提交被取消！</div>
                </div>
                  
              </div>
           </div>
      </div>
  </div>
</template>

<script>
export default {

}
</script>

<style lang="less" scoped>
  .about
  {
     background-color: rgb(222, 220, 220);
     position: relative;
     .introduction
     {
        width: 45%;
        height: 280px;
        background: rgb(243, 241, 241);
        box-shadow: gray 0 0 10px 0;
        position: absolute;
        left: 50px;
        top: 30px;
        .title
        {
          font-size: 26px;
          color: orange;
          margin: 20px 0;
        }
        .labels
        {
          display: flex;
          flex-direction: row;
          flex-wrap: wrap;
          margin-left: 20px;
          div{
             padding: 0 20px;
             color:white;
             border-radius: 20px;
             height: 30px;
             font-size: 16px;
             line-height: 30px;
             text-align: center;
             margin-right: 50px;
             margin-top: 30px;
          }
          .c
          {
             background-color: red;
          }
          .java
          {
            background-color: orange;

          }
          .python{
            background-color: #bfa;
          }
          .cplus
          {
             background-color: yellowgreen;
          }
          .js
          {
            background-color: goldenrod;
          }
          .PHP
          {
            background-color: firebrick;
          }
          .Go
          {
            background-color: rgb(51, 144, 225);
          }
          .ct{
            background-color: plum;
          }
        }
     }
     .resIntroduce
     {
        width: 45%;
        height: 700px;
        background: rgb(249, 247, 247);
        box-shadow: gray 0 0 10px 0;
        position: absolute;
        right: 50px;
        top: 30px;
        .title
        {
           font-size: 22px;
           color: rgb(51, 123, 224);
           margin-top: 20px;
           margin-left: 10px;
           margin-bottom: 20px;
        }
        .itList
        {
          display: flex;
          flex-direction: column;
          .ListItem
          {
            display: flex;
            flex-direction: row;
            margin-top: 10px;
            margin-left: 10px;
            div{
              color: black;
              font-size: 13px;
            }
            .bt
            {
               height: 30px;
               text-align: center;
               line-height: 30px;
               padding: 0 4px;              
               border-radius: 20px;
               color: white;
               background-color: rgb(66, 134, 235);
            }
            .text
            {
               height: 30px;
               line-height: 30px;
               margin-left: 4px;
            }
          }
        }
     }
  }
  

</style>