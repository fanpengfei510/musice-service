package com.music.service;

import com.music.domain.Collect;

import java.util.List;

public interface CollectService {
  boolean addCollection(Collect collect);

  boolean deleteCollect(Integer userId,Integer songId);

  boolean updateCollection(Collect collect);

  List<Collect> collectionOfUser(Integer userId);

  List<Collect> allCollect();
}
