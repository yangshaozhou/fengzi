import request from '@/utils/request'

export default {

//用户登录
login(loginVo){
    return request({
        url: `/user/userlogin`,
        method: 'post',
        data:loginVo
      })
},
//根据token字符串获取用户信息
getUcenterByToken(token){
    return request({
        url: `/user/getuserinfoByToken?token=${token}`,
        method: 'get'
      })
}
}