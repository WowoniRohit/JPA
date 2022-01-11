package com.wowoni.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.wowoni.Enum.AssigmentStatus;
import com.wowoni.Enum.AssignmentType;

@Entity
@Table(name = "assigments")
public class Assigment {

	@Id
	@NotNull
	@Column(name = "assigment_id")
	private int assigmentId;

	@OneToOne
	@JoinColumn(name = "application_id")
	private Application applicationId;

	@NotNull
	private int surveyor_Id;
	@NotNull
	@Column(name = "assignment_type")
	private AssignmentType assignmentType;
	@NotNull
	@Column(name = "assignment_status")
	private AssigmentStatus assigmentStatus;
	@NotNull
	private int province_Id;
	@NotNull
	private int city_Id;
	@NotNull
	private int subDistrict_Id;
	@NotNull
	private int village_Id;
	@NotNull
	private int zip_code;

	private double longitude;

	private double latitude;
	@NotNull
	private int branch_id;
	@NotNull
	private int customer_id;
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

	@OneToMany(mappedBy = "assigment_id")
	private List<Assigment_Personal_data> assigment_Personal_data;

	@OneToMany(mappedBy = "assigment_id")
	private List<Assignment_loan_information> assignment_loan_information;

	@OneToMany(mappedBy = "assignments_id")
	private List<Assigment_Collateral_Information> assigment_Collateral_Information;

	@OneToMany(mappedBy = "assignments_id")
	private List<Assigments_Physical_Documents> assigments_Physical_Documents;

	@OneToMany(mappedBy = "assignments_id")
	private List<Assignment_Document_sign> assignment_Document_sign;

}
