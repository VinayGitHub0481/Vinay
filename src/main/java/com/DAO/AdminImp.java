package com.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.admin.Admin;
@Repository          
public class AdminImp {
    @Autowired
   private HibernateTemplate hibernateTemplate;

  @Transactional(readOnly = false)  //here by making transactional(readOnly =false) by this we can perform insert Operations i.e insert,update,delete Operations.
	public int save(Admin ad) {
		int id=(int)this.hibernateTemplate.save(ad);
		return id;
	}
}
