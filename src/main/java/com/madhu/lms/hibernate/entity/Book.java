/**
 * 
 */
package com.madhu.lms.hibernate.entity;

import jakarta.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 15197
 *
 */
@Entity
@Table(name="book")
public class Book {

	@Id
	@Column(name="isin")
	private String isin;
	
	@Column(name="name")
	private String name;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="price")
	private Double price;
	
	public Book()	{
		
	}
	
	public Book(String isin, String name, int quantity, double price) {
		this.isin=isin;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}

	////// getters and setters //////
	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	////// override //////
	@Override
	public String toString() {
		String book = "book [id=" + isin + ", name=" + name + ", quantity=" + quantity + ", price="+price; 
		return book;
	}	
}
