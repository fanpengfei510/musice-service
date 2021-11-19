package com.music.service;

import org.apache.ibatis.annotations.Param;

public interface AdminService {
  boolean veritypasswd(String name,String password);
}
