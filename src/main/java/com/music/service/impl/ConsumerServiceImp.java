package com.music.service.impl;

import com.music.dao.ConsumerMapper;
import com.music.domain.Consumer;
import com.music.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerServiceImp implements ConsumerService {

  @Autowired
  private ConsumerMapper consumerMapper;

  @Override
  public boolean addUser(Consumer consumer) {
    return consumerMapper.insertSelective(consumer) > 0 ? true : false;
  }

  @Override
  public boolean deleteUser(Integer id) {
    return consumerMapper.deleteUser(id) > 0 ? true : false;
  }

  @Override
  public boolean updateUserMsg(Consumer consumer) {
    return consumerMapper.updateUserMsg(consumer) > 0 ? true : false;
  }

  @Override
  public List<Consumer> allUser() {
    return consumerMapper.allUser();
  }

  @Override
  public List<Consumer> userOfId(Integer id) {
    return consumerMapper.userOfId(id);
  }
}
