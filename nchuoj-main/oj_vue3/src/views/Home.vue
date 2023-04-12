<!--
 * @Author: happystartsman 2392862431@qq.com
 * @Date: 2022-11-12 16:07:22
 * @LastEditors: happystartsman 2392862431@qq.com
 * @LastEditTime: 2023-01-16 20:32:59
 * @FilePath: \oj_vue3\src\views\Home.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
    <div>
    
    <div>
      <TopBar/>
      <MiddleNav/>
      <LunBotu/>
      <Foot/>
   </div>
    </div>
   
</template>

<script>
import LunBotu from '@/components/main1/ShowPic.vue'
import TopBar from '@/components/main1/topBar.vue'
import MiddleNav from '@/components/main1/MiddleNav.vue'
import Foot from '@/components/main1/Foot.vue'

export default {
  name: 'App',
  components: {
   LunBotu,
   TopBar,
   MiddleNav,
   Foot
  },
  setup() {
    
     return {
  
     }
  }
}
</script>

<style>
</style>
