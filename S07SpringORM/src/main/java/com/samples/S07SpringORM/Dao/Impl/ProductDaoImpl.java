package com.samples.S07SpringORM.Dao.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.samples.S07SpringORM.Dao.ProductDAO;
import com.samples.S07SpringORM.entity.Product;

@Component("productdao")
public class ProductDaoImpl implements ProductDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	public Product find(int id) {
		return hibernateTemplate.get(Product.class, id);
	}

	public List<Product> findAll() {
		return hibernateTemplate.loadAll(Product.class);
	}

}