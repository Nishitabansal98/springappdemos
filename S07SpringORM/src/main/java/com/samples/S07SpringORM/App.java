package com.samples.S07SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S07SpringORM.Dao.ProductDAO;
import com.samples.S07SpringORM.entity.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S07SpringORM/SpringConfig.xml");

		ProductDAO productDAO = (ProductDAO) springContainer.getBean("productdao");
		//create(productDAO);
		//update(productDAO);
		delete(productDAO);
		
	}
	private static void delete(ProductDAO productDAO) {
		Product product = new Product();
		product.setId(2);
		product.setName("Furniture");
		product.setDescription("rose wood");
		product.setPrice(8000);
		
		productDAO.delete(product);
	}

	private static void update(ProductDAO productDAO) {
		Product product = new Product();
		product.setId(2);
		product.setName("Furniture");
		product.setDescription("rose wood");
		product.setPrice(8000);
		
		productDAO.update(product);
	}
	private static void create(ProductDAO productDAO) {
		Product product = new Product();
		product.setId(2);
		product.setName("Furniture");
		product.setDescription("rose wood");
		product.setPrice(50000);
		
		productDAO.create(product);
	}
}