package com.example.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.entity.Student;
import com.example.entity.TestBean;
import com.example.entity.User;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
@RequestMapping("/yyds")//为此类中所有请求映射添加一个路径前缀
public class MainController {
//    @Autowired
//    TestBean bean;

//    @RequestMapping("/test")
//    public ModelAndView index(){
//        return new ModelAndView("index.html");
//    }

//    method:表示请求的方法类型
//    params：表示指定必须携带请求参数
//    @RequestMapping(value = "/test",method ={RequestMethod.POST,RequestMethod.GET},params ="username")
//    public ModelAndView index(){
//        ModelAndView modelAndView=new ModelAndView("index.html");
//        modelAndView.getModel().put("name","zs");//向页面响应数据
//        return modelAndView;
//    }

//    注解获取请求参数
//    require:设定属性是否必须
//    defaultValue:设置默认值
//    @RequestMapping("/test")
//    public String index(@RequestParam(value = "username",defaultValue = "zs") String username){
//        System.out.println("收到一个请求参数"+username);
//        return "index";
//    }
// 请求参数传递给一个实体
//    @RequestMapping("/test")
//    public String index(User user)
//    {
//        System.out.println("收到一个请求参数"+user);
//        return "index";
//    }

//    @CookieValue:快速获取请求携带的Cookie信息
//    @RequestMapping(value="/test")
//    public ModelAndView index(HttpServletResponse response, @CookieValue(value="test",required = false) String test){
//        System.out.println("获取cookie值为"+test);
//        response.addCookie(new Cookie("test","zs"));
//        return new ModelAndView("index");
//    }

//    请求转发和重定向
//    @RequestMapping(value = "/index")
//    public ModelAndView index(){
//        重定向
//        return new ModelAndView("redirect:home");
//        System.out.println(bean);
//        请求转发
//        return new ModelAndView("forward:home");
//    }

//    @RequestMapping("/home")
//    public String home(){
//        return "home";
//    }

//    RestFul
//    @RequestMapping("/index/{str}")
//    public String index(@PathVariable("str") String str)
//    {
//        System.out.println(str);
//        return "index";
//    }

//    四种请求
//    @RequestMapping(value = "/index/{id}", method = RequestMethod.GET)
//    public String get(@PathVariable("id") String text){
//        System.out.println("获取用户："+text);
//        return "index";
//    }
//
//    @RequestMapping(value = "/index", method = RequestMethod.POST)
//    public String post(String username){
//        System.out.println("添加用户："+username);
//        return "index";
//    }
//
//    @RequestMapping(value = "/index/{id}", method = RequestMethod.DELETE)
//    public String delete(@PathVariable("id") String text){
//        System.out.println("删除用户："+text);
//        return "index";
//    }
//
//    @RequestMapping(value = "/index", method = RequestMethod.PUT)
//    public String put(String username){
//        System.out.println("修改用户："+username);
//        return "index";
//    }

//    配置拦截器
//    @RequestMapping(value = "/index")
//    public String get(){
//        return "index";
//    }

//    使用Json格式
//    @RequestMapping(value = "/index")
//    public String get(){
//        JSONArray array=new JSONArray();
//        JSONArray array1=new JSONArray();
//        JSONObject object=new JSONObject();
//        array.add(object);
//        array1.add(array);
//        object.put("array",array1);
//        object.put("count",3);
//        System.out.println(object.toJSONString());
//        return "index";
//    }

    @RequestMapping(value = "/index",produces = "application/json")
    @ResponseBody
    public String data(){
        JSONObject object=new JSONObject();
        object.put("name","zs");
        object.put("age",33);
        return object.toJSONString();
    }

    @RequestMapping(value = "/data",produces = "application/json")
    @ResponseBody
    public User home(){
        User user=new User();
        user.setUsername("zs");
        user.setAge(12);
        user.setPassword("1221");
        return user;
    }

    @RequestMapping(value = "/submit")
    @ResponseBody
    public String sumbit(Student student)
    {
        System.out.println("前端接收数据"+student);
        return "{\"success\": true}";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam CommonsMultipartFile file) throws IOException{
        File fileObj=new File("test.html");
                file.transferTo(fileObj);
        System.out.println("用户上传的文件以保存到"+fileObj.getAbsolutePath());
        return "文件上传成功";
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    @ResponseBody
    public void download(HttpServletResponse response){
        response.setContentType("multipart/form-data");
        try(OutputStream stream = response.getOutputStream();
            InputStream inputStream = new FileInputStream("test.html")){
            IOUtils.copy(inputStream, stream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
