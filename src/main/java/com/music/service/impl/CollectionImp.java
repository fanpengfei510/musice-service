package com.music.service.impl;

import com.music.dao.CollectMapper;
import com.music.domain.Collect;
import com.music.service.CollectService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionImp implements CollectService {

  @Autowired
  private CollectMapper collectMapper;
  @Override
  public boolean addCollection(Collect collect) {
    return collectMapper.insertSelective(collect) > 0 ? true : false;
  }

  @Override
  public boolean deleteCollect(Integer userId,Integer songId) {
    return collectMapper.deleteCollect(userId,songId) > 0 ? true : false;
  }

  @Override
  public boolean updateCollection(Collect collect) {
    return collectMapper.updateCollection(collect) > 0 ? true : false;
  }

  @Override
  public List<Collect> collectionOfUser(Integer userId) {
    return collectMapper.collectionOfUser(userId);
  }

  @Override
  public List<Collect> allCollect() {
    return collectMapper.allCollect();
  }
}
