/**
 * 
 */
package com.madhu.lms.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.madhu.lms.hibernate.entity.Book;

/**
 * @author 15197
 *
 */
public class DeleteLMSTables2 {

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
			// get a book object
			String isin="1";
			//System.out.println("Delete book id: "+ isin);
			//Book book = new Book("1","Bhagwad Gita",1,100.0);
			
			// get a new session and start a transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve book based on the id: primary key
			System.out.println("\nGetting student with id: " + isin);
			Book book = session.get(Book.class, isin);
			
			// delete the student
			System.out.println("Deleting student: " + isin);
			session.delete(book);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Transcation committed");
			
			System.out.println("deleted record: " + book);
		}	finally {
			// close session
			session.close();
		}

	}

}
