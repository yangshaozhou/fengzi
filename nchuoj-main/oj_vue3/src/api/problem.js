import request from '@/utils/request'

export default {
    
    //查询所有题目信息
    getAllProblem(number,pages){
        return request({
            url: `/question/pagingToGetQuestion?number=${number}&pages=${pages}`,
            method: 'get'
          })
    },
    //根据问题id查看问题
    getProblemById(id,token){
        return request({
            url: `/question/getQuestionById?contestId=-1&id=${id}&questionType=1&token=${token}`,
            method: 'get'
          })
    },
    // 提交问题
    commitProblem(token,CommitVo){
        
            return request({
                url: `/onlineJudge/judge?token=${token}`,
                method: 'post',
                data:CommitVo
              })
      
    }
    
}