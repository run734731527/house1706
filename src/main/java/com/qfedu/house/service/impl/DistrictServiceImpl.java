package com.qfedu.house.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.house.domain.City;
import com.qfedu.house.domain.District;
import com.qfedu.house.persistence.DistrictDao;
import com.qfedu.house.service.DistrictService;
@Service
@Transactional
public class DistrictServiceImpl implements DistrictService{
    @Autowired
    private DistrictDao districtDao;
	@Override
	public District findById(Integer id) {
		return districtDao.findById(id);
	}

	@Override
	public List<District> findByName(String name) {
		return districtDao.findByName(name);
	}

	@Override
	public List<District> findAll(City city) {
		List<District> temp=districtDao.findAll();
		List<District> districts=new ArrayList<>();
		for(District district : temp) {
			if (district.getCity().getName().equals(city.getName())) {
				districts.add(district);
			}
		}
		return districts.size()!=0?districts:null;
	}

	@Override
	public Integer save(District district) {
		return districtDao.save(district);
	}

	@Override
	public void update(District district) {
		 districtDao.update(district);
		
	}

}
