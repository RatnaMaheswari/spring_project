package com.customer.model.persistance;

import java.util.List;

public interface UserDao {
  public User findUser(String email,String password);
  //public boolean findUser also valid
 public void addUser(User user);
 public List<User> getAllUser();
}
