package com.qfedu.house.persistence.impl;

import org.springframework.stereotype.Repository;

import com.qfedu.house.domain.City;
import com.qfedu.house.persistence.CityDao;
@Repository
public class CityDaoImpl 
extends BaseDaoAdapter<City,Integer> 
implements CityDao {
}
