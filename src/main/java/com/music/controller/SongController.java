package com.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.music.domain.Song;
import com.music.service.impl.SongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@Controller
@RequestMapping(value = "/song")
public class SongController {
  @Autowired
  private SongServiceImpl songService;

  /**
   * 添加歌词
   * @param song
   * @return
   */
  @RequestMapping(value = "/addSong",method = RequestMethod.POST)
  public Object addSong(@RequestBody Song song){
    JSONObject jsonObject = new JSONObject();
    try {
      song.setCreateTime(new Date());
      song.setUpdateTime(new Date());
      songService.insertSelective(song);
      jsonObject.put("code",1);
      jsonObject.put("msg","添加歌词成功");
      return jsonObject;
    }catch (Exception exception){
      jsonObject.put("code",0);
      jsonObject.put("msg","添加歌词失败");
      return jsonObject;
    }
  }

  /**
   * 全部歌词
   * @return
   */
  @GetMapping(value = "/allSong")
  public Object allSong(){
    return songService.allSong();
  }

  /**
   * 根据歌手id查询歌词
   */
  @GetMapping(value = "/selectSingerId")
  public Object selectSingerId(Integer singerId){
    return songService.selectSingerId(singerId);
  }

  /**
   * 删除歌词
   * @param res
   * @return
   */
  @RequestMapping(value = "/deleteSong",method = RequestMethod.POST)
  public Object deleteSong(@RequestBody Map<String,Object> res){
    JSONObject jsonObject = new JSONObject();
    Integer id = (Integer)res.get("id");
    boolean result = songService.deleteSong(id);
    if(result){
      jsonObject.put("code",1);
      jsonObject.put("msg","删除成功");
      return jsonObject;
    }else{
      jsonObject.put("code",0);
      jsonObject.put("msg","删除失败");
      return jsonObject;
    }
  }
}
