package com.wmr.springcloud.menuDemo.repository;

import com.wmr.springcloud.menuDemo.entity.Menu;

import java.util.List;

public interface MenuRepositpry {
    public List<Menu> findAll(int index, int limit);
    public int count();
    public Menu findById();
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}
