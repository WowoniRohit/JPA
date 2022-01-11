package com.wowoni.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.wowoni.Enum.ApplicationStatus;

@Entity
@Table(name = "applications")
public class Application {

	@Id
	@NotNull
	@Column(name = "application_id")
	private String applicationId;
	@NotNull
	@Column(name = "lead_id")
	private String leadId;
	@Enumerated
	@NotNull
	@Column(name = "application_status")
	private ApplicationStatus applicationStatus;
	@NotNull
	@Column(name = "created_date")
	private Date createdDate;
	@NotNull
	@Column(name = "updated_date")
	private Date updatedDate;
	@NotNull
	@Column(name = "created_user")
	private String createdUser;
	@NotNull
	@Column(name = "updated_user")
	private String updatedUser;
	@NotNull
	private boolean is_active;
}
