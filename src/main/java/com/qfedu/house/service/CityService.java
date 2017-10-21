package com.qfedu.house.service;

import java.util.List;

import com.qfedu.house.domain.City;
import com.qfedu.house.domain.Province;

public interface CityService{
	/**
	 * �������
	 * @param city
	 * @return
	 */
  Integer save(City city);
  /**
   * ͨ�����ֲ��ҳ���
   * @param name
   * @return
   */
  City findByName(String name);
  /**
   * ͨ��id������
   * @param id
   * @return
   */
  City findById(Integer id);
  /**
   * ͬһ��ʡ�еĳ���
   * @param province
   * @return
   */
  List<City> findAll(Province province);
}
