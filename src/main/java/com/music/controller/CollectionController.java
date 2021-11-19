package com.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.music.domain.Collect;
import com.music.service.impl.CollectionImp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@Controller
@RequestMapping(value = "/collection")
public class CollectionController {
  @Autowired
  private CollectionImp collectionservice;

  /**
   * 添加收藏的歌曲
   */
  @ResponseBody
  @RequestMapping(value = "/add",method = RequestMethod.POST)
  public Object addCollection(@RequestBody Collect collect){
    JSONObject jsonObject = new JSONObject();
    collect.setCreateTime(new Date());
    try {
      boolean result = collectionservice.addCollection(collect);
      jsonObject.put("code", 1);
      jsonObject.put("msg", "收藏成功");
      return jsonObject;
    } catch (Exception exception){
      System.out.println(exception);
      jsonObject.put("code", 0);
      jsonObject.put("msg", "收藏失败");
      return jsonObject;
    }
  }

  /**
   * 查看所有收藏
   */
  @RequestMapping(value = "/allList",method = RequestMethod.GET)
  public Object allCollect(){
    return collectionservice.allCollect();
  }

  /**
   * 根据userId查询收藏列表
   */
  @GetMapping(value = "/collectionOfUser")
  public Object collectionOfUser(Integer userId){
    return collectionservice.collectionOfUser(userId);
  }

  /**
   * 删除收藏
   */
  @ResponseBody
  @RequestMapping(value = "/deleteCollect",method = RequestMethod.POST)
  public Object deleteCollect(@RequestBody Map<String,Object> res){
    JSONObject jsonObject = new JSONObject();
    Integer userId = (Integer)res.get("userId");
    Integer songId = (Integer)res.get("songId");
    boolean result = collectionservice.deleteCollect(userId,songId);
    if(result){
      jsonObject.put("code", 1);
      jsonObject.put("msg", "删除成功");
      return jsonObject;
    }else{
      jsonObject.put("code", 0);
      jsonObject.put("msg", "删除失败");
      return jsonObject;
    }
  }

  /**
   * 更新收藏
   */
  @ResponseBody
  @RequestMapping(value = "/update",method = RequestMethod.POST)
  public Object updateCollection(@RequestBody Collect collect){
    JSONObject jsonObject = new JSONObject();
    boolean result = collectionservice.updateCollection(collect);
    if(result) {
      jsonObject.put("code", 1);
      jsonObject.put("msg", "更新成功");
      return jsonObject;
    }else{
      jsonObject.put("code", 0);
      jsonObject.put("msg", "更新失败");
      return jsonObject;
    }
  }
}
