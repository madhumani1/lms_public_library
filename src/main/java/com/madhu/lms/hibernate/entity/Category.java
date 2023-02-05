/**
 * 
 */
package com.madhu.lms.hibernate.entity;

import jakarta.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 15197
 *
 */
@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	public Category()	{
		
	}
	
	public Category(String name) {
		this.name = name.toUpperCase();
	}

	////// getters and setters //////
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name.toUpperCase();
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	////// override //////
	@Override
	public String toString() {
		String book = "book [id=" + id + ", category=" + name + "]"; 
		return book;
	}	
}
