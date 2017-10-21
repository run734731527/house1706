package com.qfedu.house.service;

import java.util.List;

import com.qfedu.house.domain.City;
import com.qfedu.house.domain.District;

public interface DistrictService {
    /**
     * 通过id查找
     * @param id
     * @return
     */
	District findById(Integer id);
	/**
	 * 通过区域名字查找
	 * @param name
	 * @return
	 */
	List<District> findByName(String name);
	/**
	 * 查找是同一个城市的地区
	 * @param city
	 * @return
	 */
	List<District> findAll(City city);
	/**
	 * 保存
	 * @param district
	 * @return
	 */
	Integer save(District district);
	/**
	 * 更新
	 * @param district
	 * @return
	 */
	 void update(District district);
	 
}
