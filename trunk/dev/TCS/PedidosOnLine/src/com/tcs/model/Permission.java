package com.tcs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permission")
public class Permission {
	

	@Id
	@GeneratedValue
	@Column(name = "permission_id", nullable = false)
	private Long permissionId;

	@Column(name = "permission_type", nullable = false)
	private Long permissionType;

	@Column(name = "permission_name", nullable = false)
	private String permissionName;
	

	public Permission() {
		
	}
	
	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}


	public Long getPermissionType() {
		return permissionType;
	}

	public void setPermissionType(Long permissionType) {
		this.permissionType = permissionType;
	}

	public Long getPermissionId() {
		return permissionId;
	}
	
	
	
}
