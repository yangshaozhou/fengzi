<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2023-01-28 14:52:11
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-03-31 20:58:49
 * @FilePath: \KaoYanDaShuJuKSH\src\App.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->

<template>
    <div class="out">
        <div class="container">
            <div class="content">
                <el-icon id="back" @click="back">
                    <ArrowLeftBold />
                </el-icon>
                <div class="title">欢迎使用chatgpt</div>
                <div class="item item-center"><span>{{ times }}</span></div>
                <div class="item item-left">
                    <div class="avatar"><img
                            src="https://tse4-mm.cn.bing.net/th/id/OIP-C.Xh3MtwBrSGQ_-qPhGqvXqAAAAA?w=139&h=150&c=7&r=0&o=5&pid=1.7" />
                    </div>
                    <div class="bubble bubble-left">欢迎使用，遇到任何问题可以问我哦，我会尽力回答您的！</div>
                    <!-- <video controls autoplay name="media"><source src="https://speech.ai.xiaomi.com/speech/1.0/tts_token?token=eyJ2IjoiVjAiLCJuIjoiU0MifQ.AAAXUkp9P1QAFgBdFAwbZ3cVTkoaRRsPG2AFFhgAQgBIRyI2Rw4PfR9GGBh0BRIdR1gbDBo2extJTxsSEQJHYgMQGRtaFw8RN3pEShkAWgBZTTJVQQ4YTE9KEXFvAAkUSRNMGBh0XUdeQRtQQ31hcxBOGRJPQwlGMwUXHBFdQV5ANnFBTk0UTkEPFW4BQXMUDRELR2onEU5PQEUbDkM3UkMURl8TW0FnchdFGUFOQBRPJgMAAAAKR0xLMCZ9FB8ATABeR2NVQBlHWw8KEjEiD0kaERcPAkBlBA8YR1tEDkBqdhQcQhNUDhhLN0QAFhNYFQMTYHsQRUkOVEdCUnQKExoVVxELE2N7EAA.0tIe_vCyWPC41PKTPrOHlg" type="audio/mp3"></video> -->
                </div>
            </div>
            <div class="input-area">
                <textarea name="text" style="padding: 10px;" id="textarea" placeholder="请输入"></textarea>
                <div class="button-area">
                    <!-- <button id="send-btn" @click="send">发 送</button> -->
                    <el-button type="primary" id="send-btn" v-on:keyup.13="send" @keyup.enter.native="send" @click="send"
                        round>发送</el-button>
                </div>
            </div>
        </div>
    </div>
    <!-- <audio src="${answer}" autoplay></audio> -->
    <!-- <video controls autoplay name="media"><source src="${answer}" type="audio/mp3"></video> -->
</template>
<script setup>
import axios from 'axios'
import { ref, reactive, onMounted } from 'vue'
import { useRouter } from 'vue-router';
const times = ref('')
const router = useRouter()
let t = setTimeout(time, 1000);//開始运行
let back = () => {
    router.go(-1)
}

let playStatus = reactive(false)

let isPlay = () => {
    var myAuto = document.getElementById('myaudio');
    playStatus = !playStatus;
    if (playStatus == true) {
        myAuto.pause();
        myAuto.load();
    }
    else {
        myAuto.play();
    }
}

function time() {
    clearTimeout(t);//清除定时器
    var dt = new Date();
    var y = dt.getFullYear();
    var mt = dt.getMonth() + 1;
    var day = dt.getDate();
    var h = dt.getHours();//获取时
    var m = dt.getMinutes();//获取分
    var s = dt.getSeconds();//获取秒
    times.value = y + '年' + mt + '月' + day + '日' + h + '时' + m + '分' + s + '秒';
    t = setTimeout(time, 1000); //设定定时器，循环运行     
}
let send = function () {
    let text = document.querySelector('#textarea').value;
    console.log(text)
    if (!text) {
        alert('输入内容内容不能为空！');
        return;
    }

    axios({
        method: "post",
        url: `/talk`,
        headers:{
            "Authorization":'Bearer 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'
        },
        data: {
            "model": "text-davinci-003",
            "prompt": `${text}`,
            "max_tokens": 1000,
            "temperature": 0.7
        }
    })
        .then((res) => {
            const data = res.data
            console.log(data.choices[0].text)
            // console.log(data)
            // let answer = data.answer
            let answer = ""

            // if (data.meta.music.musicUrl == null) {
            //     answer = "很抱歉，我还没有明白您的意思，换个问题吧，亲。"
            // }
            // else
                answer = data.choices[0].text;
            rightDiv.className = 'item item-left';
            rightDiv.innerHTML = ` <div class="item item-left"><div class="avatar"><img src="https://tse4-mm.cn.bing.net/th/id/OIP-C.Xh3MtwBrSGQ_-qPhGqvXqAAAAA?w=139&h=150&c=7&r=0&o=5&pid=1.7" /> </div><div class="bubble bubble-left">${answer}</div></div>`;
            document.querySelector('.content').appendChild(rightDiv);
            document.querySelector('#textarea').value = '';
            document.querySelector('#textarea').focus();
        })
        .catch((err) => {
            console.log(err.message);
        });
    let item = document.createElement('div');
    let rightDiv = document.createElement('div');
    item.className = 'item item-right';
    item.innerHTML = `<div class="bubble bubble-left">${text}</div><div class="avatar"><img src="https://tse2-mm.cn.bing.net/th/id/OIP-C.216v8pRh0N1rHYHZR2TLYwHaHa?w=166&h=180&c=7&r=0&o=5&pid=1.7" /></div>`;
    document.querySelector('.content').appendChild(item);
    document.querySelector('#textarea').value = '';
    document.querySelector('#textarea').focus();

    //滚动条置底
    let height = document.querySelector('.content').scrollHeight;
    document.querySelector(".content").scrollTop = height;
}
</script>

<style lang="less" scoped >
* {
    padding: 0;
    margin: 0;
}

.out {
    width: 100%;
    height: 100vh;
    background-color: black;
    background-size: cover;
}

body {
    height: 100vh;
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
}
</style>
<style lang="less" scoped>
.container {
    height: 100vh;
    width: 60%;
    margin: 0 auto;
    border-radius: 4px;
    border: 0.5px solid #e0e0e0;
    background-color: #f5f5f5;
    // background-image: url("../../assets/images/9CAD82B4B564DDC812889B860D91EE38.jpg");
    // background-size:contain;
    display: flex;
    flex-flow: column;
    overflow: hidden;

    #back {
        position: absolute;
        width: 40px;
        height: 40px;
        font-size: 24px;
        border-radius: 50%;
        background-color: rgb(233, 188, 106);
    }

    #back:hover {
        background-color: rgb(173, 148, 101);
    }

    .title {
        width: 100%;
        height: 80px;

        line-height: 80px;
        font-size: 25px;
        margin: 0 auto;
        text-align: center;
    }

    #loadingBox {
        margin-top: 15px;
        display: flex;
        width: 100%;
        background-color: #bfa;
    }
}

.content {
    width: calc(100% - 40px);
    padding: 20px;
    overflow-y: scroll;
    flex: 1;
}

.content:hover::-webkit-scrollbar-thumb {
    background: rgba(0, 0, 0, 0.1);
}


.input-area {
    border-top: 0.5px solid #e0e0e0;
    height: 150px;
    display: flex;
    flex-flow: column;
    padding-top: 10px;
    padding-left: 5px;
    padding-right: 5px;
    background-color: #fff;
}

textarea {
    flex: 1;
    padding: 10px;
    font-size: 16px;
    border: none;
    cursor: pointer;
    overflow-y: auto;
    overflow-x: hidden;
    outline: none;
    resize: none;
    border: 1px solid rgb(211, 204, 204);
    border-radius: 20px;
}

.button-area {
    display: flex;
    height: 40px;
    margin-right: 10px;
    line-height: 40px;
    padding: 5px;
    justify-content: flex-end;
}

.button-area button {
    float: right;
}

/* 设置滚动条的样式 */
::-webkit-scrollbar {
    width: 10px;
}

/* 滚动槽 */
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset006pxrgba(0, 0, 0, 0.3);
    border-radius: 8px;
}

/* 滚动条滑块 */
::-webkit-scrollbar-thumb {
    border-radius: 10px;
    background: rgba(0, 0, 0, 0);
    -webkit-box-shadow: inset006pxrgba(0, 0, 0, 0.5);
}
</style>
<style>
.bubble {
    max-width: 400px;
    padding: 10px;
    border-radius: 5px;
    position: relative;
    color: #000;
    word-wrap: break-word;
    word-break: normal;
}

.item-left .bubble img {
    width: 300px;
    height: 52px;
    border-radius: 5px;
}

.item-left .bubble {
    margin-left: 15px;
    background-color: #fff;
}

.item-left .bubble:before {
    content: "";
    position: absolute;
    width: 0;
    height: 0;
    border-left: 10px solid transparent;
    border-top: 10px solid transparent;
    border-right: 10px solid #fff;
    border-bottom: 10px solid transparent;
    left: -20px;
}

.item-right .bubble {
    margin-right: 15px;
    background-color: #9eea6a;
}

.item-right .bubble:before {
    content: "";
    position: absolute;
    width: 0;
    height: 0;
    border-left: 10px solid #9eea6a;
    border-top: 10px solid transparent;
    border-right: 10px solid transparent;
    border-bottom: 10px solid transparent;
    right: -20px;
}

.item {
    margin-top: 15px;
    display: flex;
    width: 100%;
}

.item.item-right {
    justify-content: flex-end;
}

.item.item-center {
    justify-content: center;
}

.item.item-center span {
    font-size: 12px;
    padding: 2px 4px;
    color: #fff;
    background-color: #dadada;
    border-radius: 3px;
    -moz-user-select: none;
    /*火狐*/
    -webkit-user-select: none;
    /*webkit浏览器*/
    -ms-user-select: none;
    /*IE10*/
    -khtml-user-select: none;
    /*早期浏览器*/
    user-select: none;
}

.avatar img {
    width: 42px;
    height: 42px;
    border-radius: 50%;
}

.sound {
    padding: 0;
    margin: 0;
}
</style>