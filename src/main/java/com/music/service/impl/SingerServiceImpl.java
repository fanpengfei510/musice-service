package com.music.service.impl;

import com.music.dao.SingerMapper;
import com.music.domain.Singer;
import com.music.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {
  @Autowired
  private SingerMapper singerMapper;

  @Override
  public boolean addSinger(Singer singer) {
    return singerMapper.insertSelective(singer) > 0 ? true : false;
  }

  @Override
  public boolean updateByPrimaryKeySelective(Singer singer) {
    return singerMapper.updateByPrimaryKeySelective(singer) > 0 ? true : false;
  }

  @Override
  public List<Singer> allSinger() {
    return singerMapper.allSinger();
  }

  @Override
  public List<Singer> selectByPrimaryKey(Integer sex) {
    return singerMapper.selectByPrimaryKey(sex);
  }

}
