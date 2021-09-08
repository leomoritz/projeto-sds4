package com.devsuperior.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sellers")
public class Seller {
	
	@Id /*Essa anotação indica para o banco que é o ID*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Esta anotação indica para o banco que o id é auto-incremental*/
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "seller") /*Essa anotação mapeia o atributo seller da classe Sale de um para muitos*/
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {
		
	}

	public Seller(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sale> getSales() {
		return sales;
	}

}
