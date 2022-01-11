package com.wowoni.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "assigment_personal_datas")
public class Assigment_Personal_data {

	@Id
	@NotNull
	private int assignment_Personal_data_id;
	
	@ManyToOne
	@JoinColumn(name = "assignment_id")
	private Assigment assigment_id;
	
	
	private String custmerName;
	
	private String custmerAddress;
	
	private String custmerPhoneNumber;
	
	private String CustmerSelfiePhoto;
	
	private String custmerIdentityCard;
	
	private String custmerFamilyCard;
	@NotNull
	private boolean is_married;
	
	private String custmerspouseIdentityCard;
	
	private String custmerHousePhoto;
	
	private String custmerHouse2PhotoString;
	@NotNull
	private Date created_date;
	@NotNull
	private Date updated_date;
	
	@NotNull
	@Column(name = "created_user")
	private String createdUser;
	@NotNull
	@Column(name = "updated_user")
	private String updatedUser;
	@NotNull
	private boolean is_active;
	
}
