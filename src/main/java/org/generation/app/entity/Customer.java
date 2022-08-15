package org.generation.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name = "customer_data")
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id                   //IDENTITY hace que el campo sea autoincrementable
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCustomer;
	//@Size(min = 4, max = 100)
	@Column(name = "first_name") //Para nombrar mi columna
	private String firstName;
	private String lastName;
	@ManyToOne (fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Role role;
	
//	@OneToMany //de un cliente tendre muchas ordenes
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	private List<Order> orders;
}
