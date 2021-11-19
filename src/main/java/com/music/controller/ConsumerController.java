package com.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.music.domain.Consumer;
import com.music.service.impl.ConsumerServiceImp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@Controller
@RequestMapping(value = "/user")
public class ConsumerController {
  @Autowired
  private ConsumerServiceImp consumerService;

  @ResponseBody
  @RequestMapping(value = "/add",method = RequestMethod.POST)

  /**
   * 注册新用户
   */
  public Object addUser(@RequestBody Consumer consumer) throws ParseException {
    JSONObject jsonObject = new JSONObject();
    String username = consumer.getUsername().trim();
    if(username.equals("") || username == null){
      jsonObject.put("code",0);
      jsonObject.put("mes","用户名或者密码错误");
      return jsonObject;
    }
    consumer.setCreateTime(new Date());
    consumer.setUpdateTime(new Date());

    try {
      boolean res = consumerService.addUser(consumer);
      jsonObject.put("code", 1);
      jsonObject.put("msg", "注册成功");
      return jsonObject;
    }catch (Exception exception){
      jsonObject.put("code", 0);
      jsonObject.put("msg", "注册失败");
      return jsonObject;
    }
  }

  /**
   * 查看所有用户
   */
  @RequestMapping(value = "/allUser",method = RequestMethod.GET)
  public Object allUser(){
    return consumerService.allUser();
  }

  /**
   * 查看单个用户
   */
  @RequestMapping(value = "/userOfId",method = RequestMethod.GET)
  public Object userOfId(Integer id){
    return consumerService.userOfId(id);
  }

  /**
   * 删除用户
   */
  @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
  public Object deleteUser(Integer id){
    JSONObject jsonObject = new JSONObject();

    try {
      boolean result = consumerService.deleteUser(id);
      jsonObject.put("code", 1);
      jsonObject.put("msg", "删除成功");
      return jsonObject;
    }catch (Exception exception){
      jsonObject.put("code", 0);
      jsonObject.put("msg", "删除失败");
      return jsonObject;
    }
  }

  /**
   * 更新用户信息
   */
  @RequestMapping(value = "/updateUserMsg",method = RequestMethod.POST)
  public Object updateUserMsg(@RequestBody Consumer consumer){
    JSONObject jsonObject = new JSONObject();
    consumer.setUpdateTime(new Date());
    try {
      boolean result = consumerService.updateUserMsg(consumer);
      jsonObject.put("code", 1);
      jsonObject.put("msg", "更新成功");
      return jsonObject;
    }catch (Exception exception){
      jsonObject.put("code", 0);
      jsonObject.put("msg", "更新失败");
      return jsonObject;
    }
  }
}
