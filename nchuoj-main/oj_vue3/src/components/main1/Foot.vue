<template>
   <div class="foot">
        <ul>
            <li>前端开发人员</li>
            <li>杨少洲</li>
            <li>李奉阳</li>
            <li>吴梦洁</li>
            <li>姚杰</li>
        </ul>
        <ul>
            <li>后端端开发人员</li>
            <li>罗上文</li>
            <li>邹逸凡</li>
            <li>胡先斌</li>
        </ul>
        <ul>
            <li>友情赞助</li>
            <li>南昌航空大学</li>
        </ul>
    </div>
</template>

<script>
export default {
    name:'FootPart'
}
</script>

<style scoped>
*{
    text-decoration: none;
}
.foot
{
    width: 100%;
    height: 200px;
    margin:  0 auto;
    background-color: rgb(36, 144, 202);
    display: flex;
    flex-direction: row;
    justify-content: space-around;
}
.foot ul
{
    list-style-type: none;
    margin-top: 40px;
}
.foot ul li
{
    list-style-type: none;
    color:white;
    margin-bottom: 7px;
}
.foot ul li:nth-child(1)
{
    font-size: 20px;
    color: white;
}

</style>