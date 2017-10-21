package com.qfedu.house.service;

import java.util.List;

import com.qfedu.house.domain.Province;

public interface ProvinceService {
	/**
	 * ͨ��ʡ�����Ʋ���
	 * @param name
	 * @return
	 */
   Province findByName(String name);
   /**
    * ͨ�����кŲ���
    * @param id
    * @return
    */
   Province findById(Integer id);
   /**
    * ����ʡ��
    * @param province
    * @return
    */
   Integer save(Province province);
   /**
    * ɾ��ʡ��
    * @param province
    * @return
    */
   Boolean delete(Province province);
   /**
    * ����ʡ��
    * @param province
    * @return
    */
   void update(Province province);  
   /**
    * �������е�ʡ��
    * @return
    */
   List<Province> findAll();
}
