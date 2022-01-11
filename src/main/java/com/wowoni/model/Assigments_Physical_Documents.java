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
@Table(name = "assigments_physical_documents")
public class Assigments_Physical_Documents {

	@Id
	@NotNull
	private int assigments_physical_document_id;
	
	@ManyToOne
	@JoinColumn(name = "assignments_id")
	private Assigment assignments_id;
	
	private String vehicle_ownership_1_photo;
	
	private String vehicle_ownership_2_photo;
	
	private String vehicle_ownership_3_photo;
	
	private String vehicle_ownership_4_photo;
	
	private String vehicle_ownership_identity_card_photo;
	
	private String addtional_assest_registation_photo;
	
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
