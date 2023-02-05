/**
 * 
 */
package com.madhu.lms.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.madhu.lms.hibernate.entity.Book;
import com.madhu.lms.hibernate.entity.Category;

/**
 * @author 15197
 *
 */
public class CreateLMSTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try	{
			// create a book object
			String isin="1";
			System.out.println("Creating a new book...");
			Book book = new Book("1","Bhagwad Gita",1,100.0);
			
			// start a transaction
			session.beginTransaction();
			
			// save book in db
			System.out.println("Saving book "+isin);
			session.save(book);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Transcation committed");
			
		}	finally {
			// close session
			session.close();
		}
		
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.buildSessionFactory();
		// create session
		session = factory.getCurrentSession();
		try {
			// create a category
			System.out.println("Creating a new category...");
			Category category = new Category("Spiritual");
			
			// start a transaction
			session.beginTransaction();
			
			System.out.println("Saving category...");
			session.save(category);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Transcation committed");
		} finally {
			// close session
			session.close();
		}

	}

}
