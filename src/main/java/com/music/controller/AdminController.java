package com.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.music.domain.Admin;
import com.music.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@Controller
public class AdminController {
  @Autowired
  private AdminServiceImpl adminService;

  @ResponseBody
  @RequestMapping(value = "/admin/login/status",method = RequestMethod.POST)
  public Object loginStatus(@RequestBody Admin admin, HttpSession session){
    JSONObject jsonObject = new JSONObject();

    String name = admin.getName();
    String password = admin.getPassword();
    boolean res = adminService.veritypasswd(name,password);
    if (res){
      jsonObject.put("code" , 1);
      jsonObject.put("msg","登陆成功");
      session.setAttribute("name",name);
      return jsonObject;
    }else{
      jsonObject.put("code",0);
      jsonObject.put("msg","用户名或密码错误");
      return jsonObject;
    }
  }
}
