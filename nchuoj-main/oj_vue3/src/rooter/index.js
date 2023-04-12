/*
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-10-17 21:48:00
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-28 11:13:22
 * @FilePath: \oj_vue3\src\rooter\index.js
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
import { createRouter, createWebHashHistory } from "vue-router";
import Login from '@/components/main1/Login.vue'
import Home from '@/views/Home.vue'
import Main from '@/views/Main.vue'
import Problem from '@/components/topbar/Problem.vue'
import Nob from '@/components/topbar/Nob.vue'
import Practice from '@/components/topbar/Practice.vue'
import About from '@/components/topbar/About.vue'
import SHome from '@/components/topbar/Home.vue'
import CodeCr from '@/views/codeCompeior.vue'
import trainList from '@/components/Problems/trainList.vue'
import Help from '@/views/assiant/helperPage'
import Analysize from '@/views/assiant/analysizePage'
import Write from '@/views/assiant/codeWrite'
import Code from '@/views/assiant/codeHelper'
const routes = [
    {
        path: '/',
        component: Home
    },
    {
        path: '/login',
        component: Login
    },
    {
        path:'/code/:id',
        component:CodeCr,
    },
    {
        path:'/train',
        component:trainList
    },
    {
        path: '/main',
        component: Main,
        children: [
            {
               path:'',
               component:SHome
            },
            {
                path: 'home',
                component: SHome
            },
            {
                path:'problem',
                component:Problem
            },
            {
                path:'practice',
                component:Practice,
            },
            {
                path:'about',
                component:About
            },
            {
                path:'nob',
                component:Nob
            },
        ]

    },
    {
        path:'/help',
        component:Help,
        children:[
            {
                path:'analysise',
                component:Analysize
            },
            {
                path:'codewrite',
                component:Write
            }
        ]
    },
    {
        path:'/talkpage',
        component:Code
    }
]

const router = createRouter({
    linkActiveClass:'active',
    history: createWebHashHistory(),
    routes
})
export default router