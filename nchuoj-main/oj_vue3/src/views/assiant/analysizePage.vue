<template>
    <div class="box">

        <div class="des">
            <div class="title">在这里您可以将您想知道的问题输入，我们将尽力为您寻找题解</div>
        </div>
        <div class="change">

            <div class="itemBox">
                <div class="title">请输入您的问题</div>
                <textarea v-model="text" class="inputBox" name="" id="textarea" cols="60" rows="40"></textarea>
            </div>
            <div class="itemBox">
                <el-button type="primary" class="title" id="bt" @click="handleSearch">搜索</el-button>
            </div>
            <div class="itemBox">
                <div class="title">这是我为您找到的题解</div>
                <textarea name="" class="inputBox" id="" cols="60" rows="40">{{ answer }}</textarea>
            </div>
        </div>
    </div>
</template>

<script setup>
import { ref, reactive } from 'vue'
import axios from 'axios';
let text = reactive('')
let answer = ref('')

let handleSearch = () => {
    text = document.querySelector('#textarea').value;
    let textcontent = "请使用java语言实现下面的问题   "+text;
    axios({
        method: "post",
        url: `/talk`,
        headers: {
            "Authorization": 'Bearer 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'
        },
        data: {
            "model": "text-davinci-003",
            "prompt": `${textcontent}`,
            "max_tokens": 1000,
            "temperature": 0.7
        }
    })
        .then((res) => {
            const data = res.data
            console.log(data.choices[0].text)
            answer.value = data.choices[0].text;

        })
        .catch((err) => {
            console.log(err.message);
        });
}



</script>

<style lang="less" scoped>
.box {
    .des {
        width: 100%;
        padding-top: 20px;

        // height: 80px;
        .title {
            width: 50%;
            height: 60%;
            color: white;
            margin-left: 20%;
            font-size: 25px;
            margin-bottom: 30px;
        }

    }

    .change {
        background-color: rgb(194, 194, 196);
        display: flex;
        flex-direction: row;
        justify-content: space-around;
        width: 70%;


        .itemBox {
            .title {
                width: 250px;
                height: 50px;
                line-height: 50px;
                font-size: 24px;
                text-align: center;
                border-radius: 20px;

                margin: 10px 0;
                margin-left: 20%;
                background-color: rgb(44, 169, 222);
                color: rgb(240, 235, 237);
            }

            .inputBox {
                display: block;
                width: 100%;
                height: 80%;
            }

            textarea {
                padding: 10px;
                font-size: 18px;
                color: rgb(16, 14, 14);
                background-color: rgb(224, 225, 226);
            }

        }

        .itemBox:nth-child(1) {
            margin-left: 50px;
        }
        .itemBox:nth-child(2){
            margin-right: 50px;
        }

        .itemBox:nth-child(3){
            margin-right: 50px;
        }
    }
}</style>