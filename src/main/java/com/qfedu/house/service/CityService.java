package com.qfedu.house.service;

import java.util.List;

import com.qfedu.house.domain.City;
import com.qfedu.house.domain.Province;

public interface CityService{
	/**
	 * 保存城市
	 * @param city
	 * @return
	 */
  Integer save(City city);
  /**
   * 通过名字查找城市
   * @param name
   * @return
   */
  City findByName(String name);
  /**
   * 通过id来查找
   * @param id
   * @return
   */
  City findById(Integer id);
  /**
   * 同一个省市的城市
   * @param province
   * @return
   */
  List<City> findAll(Province province);
}
