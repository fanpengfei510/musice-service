package com.music.service;

import com.music.domain.Consumer;

import java.util.List;

public interface ConsumerService {
  boolean addUser(Consumer consumer);

  boolean deleteUser(Integer id);

  boolean updateUserMsg(Consumer consumer);
  List<Consumer> allUser();

  List<Consumer> userOfId(Integer id);
}
