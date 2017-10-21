package com.qfedu.house.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.house.domain.Province;
import com.qfedu.house.persistence.ProvinceDao;
import com.qfedu.house.service.ProvinceService;
@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceDao provinceDao;
	@Override
	public Province findByName(String name) {
		
		return provinceDao.findByName(name).get(0);
	}

	@Override
	public Integer save(Province province) {
		Province temp=provinceDao.findByName(province.getName()).get(0);
		if (temp!=null) {
			return provinceDao.save(province);
		}
		return null;
	}

	@Override
	public Boolean delete(Province province) {
		Province temp=provinceDao.findByName(province.getName()).get(0);
		return provinceDao.deleteById(temp.getId());
	}

	@Override
	public void update(Province province) {
		provinceDao.update(province);
	}

	@Override
	public Province findById(Integer id) {
		return provinceDao.findById(id);
	}

	@Override
	public List<Province> findAll() {
		return provinceDao.findAll();
	}

}
