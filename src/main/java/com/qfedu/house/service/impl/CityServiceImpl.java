package com.qfedu.house.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.house.domain.City;
import com.qfedu.house.domain.Province;
import com.qfedu.house.persistence.CityDao;
import com.qfedu.house.service.CityService;
@Service
@Transactional
public class CityServiceImpl implements CityService{
    @Autowired
    private CityDao cityDao;
	@Override
	public Integer save(City city) {
		City temp=cityDao.findByName(city.getName()).get(0);
		if (temp!=null) {
			return cityDao.save(city);
		}
		return null;
	}

	@Override
	public City findByName(String name) {
		return cityDao.findByName(name).get(0);
	}

	@Override
	public City findById(Integer id) {
		return cityDao.findById(id);
	}

	@Override
	public List<City> findAll(Province province) {
		List<City> temp=cityDao.findAll();
		List<City> cities=new ArrayList<City>();
		for(City city:temp) {
			if (city.getProvince().getName().equals(province.getName())) {
				cities.add(city);
			}
		}
		return cities.size()!=0?cities:null;
	}

}
