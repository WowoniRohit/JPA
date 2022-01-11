package com.wowoni.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Assignment_loan_informations")
public class Assignment_loan_information {

	
	@NotNull
	@Id
	private int assignment_loan_information_id;
	
	@ManyToOne
	@JoinColumn(name = "assigment_id")
	private Assigment assigment_id;
	
	private double funding_amount;
	
	private int tenure;

	private double installment_amount;
	
	@NotNull
	private Date created_Date;
	@NotNull
	private Date update_Date;
	@NotNull
	@Column(name = "created_user")
	private String createdUser;
	@NotNull
	@Column(name = "updated_user")
	private String updatedUser;
	@NotNull
	private boolean is_active;
	
}
