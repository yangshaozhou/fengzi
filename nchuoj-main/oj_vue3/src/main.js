/*
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-10-17 15:10:38
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-27 21:47:38
 * @FilePath: \oj_vue3\src\main.js
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
import { createApp } from 'vue'
import App from './App.vue'
import router from  './rooter/index.js'
import ElementPlus from 'element-plus';
import store from '../src/store/index'
import 'element-plus/theme-chalk/index.css';
import locale from 'element-plus/lib/locale/lang/zh-cn'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
// md


const app = createApp(App)

//引入全部图标库
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
  }
app.use(scroll).use(store)




app.use(router).use(ElementPlus, { locale }).mount("#app");







