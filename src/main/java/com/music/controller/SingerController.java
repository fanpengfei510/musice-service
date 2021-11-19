package com.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.music.domain.Singer;
import com.music.domain.match.SingerMatch;
import com.music.service.impl.SingerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@Controller
@RequestMapping(value = "/singer")
public class SingerController {
  @Autowired
  private SingerServiceImpl singerService;

  /**
   * 添加歌手
   * @param singer
   * @return
   */
  @RequestMapping(value = "/addSinger",method = RequestMethod.POST)
  public Object addSinger(@RequestBody Singer singer){
    JSONObject jsonObject = new JSONObject();
    boolean result = singerService.addSinger(singer);
    if(result){
      jsonObject.put("code", 1);
      jsonObject.put("msg", "添加成功");
      return jsonObject;
    }else{
      jsonObject.put("code", 1);
      jsonObject.put("msg", "添加失败");
      return jsonObject;
    }
  }

  /**
   * 所有歌手列表
   * @return
   */
  @GetMapping(value = "/allSinger")
  public Object allSinger(){
    return singerService.allSinger();
  }

  /**
   * 根据性别查询
   */
  @GetMapping(value = "/querySex")
  public Object selectByPrimaryKey(Integer sex){
    JSONObject jsonObject = new JSONObject();
    if(sex == null){
      jsonObject.put("code", 0);
      jsonObject.put("msg", "未接受sex参数");
      return jsonObject;
    }
//    增加一个过滤字段的实体SingerMatch，过滤不需要的字段返回给前端
    ArrayList<SingerMatch> list = new ArrayList<>();
    List<Singer> result = singerService.selectByPrimaryKey(sex);

    for(Singer item : result){
      SingerMatch singerMatch = new SingerMatch();
      singerMatch.setId(item.getId());
      singerMatch.setName(item.getName());
      list.add(singerMatch);
    }
    jsonObject.put("code", 1);
    jsonObject.put("msg", "查询成功");
    jsonObject.put("data", list);
    return jsonObject;
  }

  /**
   * 更新信息
   */
  @RequestMapping(value = "/updateSinger",method = RequestMethod.POST)
  public Object updateSinger(@RequestBody Singer singer){
    JSONObject jsonObject = new JSONObject();
    try {
      singerService.updateByPrimaryKeySelective(singer);
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
