package com.qfedu.house.service;

import java.util.List;

import com.qfedu.house.domain.Province;

public interface ProvinceService {
	/**
	 * 通过省份名称查找
	 * @param name
	 * @return
	 */
   Province findByName(String name);
   /**
    * 通过序列号查找
    * @param id
    * @return
    */
   Province findById(Integer id);
   /**
    * 保存省份
    * @param province
    * @return
    */
   Integer save(Province province);
   /**
    * 删除省份
    * @param province
    * @return
    */
   Boolean delete(Province province);
   /**
    * 更新省份
    * @param province
    * @return
    */
   void update(Province province);  
   /**
    * 查找所有的省份
    * @return
    */
   List<Province> findAll();
}
