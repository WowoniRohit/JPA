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
@Table(name = "assigment_collateral_informations")
public class Assigment_Collateral_Information {

	@Id
	@NotNull
	private int assigment_collateral_information_id;
	
	@ManyToOne
	@JoinColumn(name="assignments_id")
	private Assigment assignments_id;
	
	private int assest_brand_id;
	
	private int assest_type_id;
	
	private int assest_model_id;
	
	private int assest_age;
	
	private String license_plate;
	
	private String vehicle_registration_photo;
	
	private String vehicle_tax_notice_photo;
	
	private String vehicle_left_side_photo;
	
	private String vehicle_right_side_photo;
	
	private String vehicle_front_side_photo;
	
	private String vehicle_back_side_photo;
	
	private String vehicle_dashboard_side_photo;
	
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
