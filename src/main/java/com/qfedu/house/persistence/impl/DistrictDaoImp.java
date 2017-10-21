package com.qfedu.house.persistence.impl;

import org.springframework.stereotype.Repository;

import com.qfedu.house.domain.District;
import com.qfedu.house.persistence.DistrictDao;
@Repository
public class DistrictDaoImp 
extends BaseDaoAdapter<District,Integer> 
implements DistrictDao {
}
