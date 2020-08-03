/*
package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

public interface UserService {
    //根据用户名查询
    public void add(User user);
    public void update(User user);
    public List<User> findAll();
    public User fidOne(Long id);
    public void delete(Long id);

}
*/
package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

public interface UserService {

    public void  add(User user);

    public void update(User user);

    public List<User> findAll();

    public User findOne(Long id);

    public void delete(Long id);
}
