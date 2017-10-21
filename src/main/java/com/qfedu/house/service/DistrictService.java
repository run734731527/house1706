package com.qfedu.house.service;

import java.util.List;

import com.qfedu.house.domain.City;
import com.qfedu.house.domain.District;

public interface DistrictService {
    /**
     * ͨ��id����
     * @param id
     * @return
     */
	District findById(Integer id);
	/**
	 * ͨ���������ֲ���
	 * @param name
	 * @return
	 */
	List<District> findByName(String name);
	/**
	 * ������ͬһ�����еĵ���
	 * @param city
	 * @return
	 */
	List<District> findAll(City city);
	/**
	 * ����
	 * @param district
	 * @return
	 */
	Integer save(District district);
	/**
	 * ����
	 * @param district
	 * @return
	 */
	 void update(District district);
	 
}
