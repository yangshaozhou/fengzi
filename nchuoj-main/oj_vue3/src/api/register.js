import request from '@/utils/request'

export default {
    
    //用户注册
    register(registerVo){
        return request({
            url: `/user/register`,
            method: 'post',
            data:registerVo
          })
    },
    
}