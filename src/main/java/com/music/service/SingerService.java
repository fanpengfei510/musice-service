package com.music.service;

import com.music.domain.Singer;

import java.util.List;

public interface SingerService {
  boolean addSinger(Singer singer);

  boolean updateByPrimaryKeySelective(Singer singer);

  List<Singer> allSinger();

  List<Singer> selectByPrimaryKey(Integer sex);
}
