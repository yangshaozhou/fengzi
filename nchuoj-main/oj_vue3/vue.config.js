const { defineConfig } = require('@vue/cli-service')

module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave:false,
  devServer: {
    proxy: {
      '/suijiyulu': {
        target: 'https://v.api.aa1.cn/api/api-wenan-mingrenmingyan/index.php?aa1=json',
				pathRewrite:{'^/suijiyulu':''},
        // ws: true, //用于支持websocket
        // changeOrigin: true //用于控制请求头中的host值
      },
      '/robot':{
        target: 'https://api.wqwlkj.cn/wqwlapi/chatgpt.php?msg=%E5%8D%97%E6%98%8C%E8%88%AA%E7%A9%BA%E5%A4%A7%E5%AD%A6%E8%80%83%E7%A0%94%E4%BF%A1%E6%81%AF&type=json',
				pathRewrite:{'^/robot':''},
      },
      '/talk':{
        target:'https://chat-leixin.xyz/v1/completions',
       pathRewrite:{'^/talk':''},
      }
    }
  },
})
