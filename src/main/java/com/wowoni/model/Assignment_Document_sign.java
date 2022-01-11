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
@Table(name = "assignment_document_signs")
public class Assignment_Document_sign {

	@Id
	private int assignment_document_sign_id;
	
	@ManyToOne
	@JoinColumn(name = "assignments_id")
	private Assigment assignments_id;
	
	@NotNull
	private boolean bank_receipt_by_customer;
	
	@NotNull
	private boolean bank_receipt_by_owner;
	
	@NotNull
	private boolean customer_application_request;
	
	@NotNull
	private boolean loan_contract_agreement_transfer_title;
	
	@NotNull
	private boolean loan_contract_agreement_funding;
	
	@NotNull
	private boolean fiduciary;
	
	private String customer_sign_document_photo;
	
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
