/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EmploymentStatus service. Represents a row in the &quot;employment_status&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.EmploymentStatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.EmploymentStatusImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmploymentStatus
 * @see com.rknowsys.eapp.hrm.model.impl.EmploymentStatusImpl
 * @see com.rknowsys.eapp.hrm.model.impl.EmploymentStatusModelImpl
 * @generated
 */
public interface EmploymentStatusModel extends BaseModel<EmploymentStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employment status model instance should use the {@link EmploymentStatus} interface instead.
	 */

	/**
	 * Returns the primary key of this employment status.
	 *
	 * @return the primary key of this employment status
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employment status.
	 *
	 * @param primaryKey the primary key of this employment status
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this employment status.
	 *
	 * @return the ID of this employment status
	 */
	public long getId();

	/**
	 * Sets the ID of this employment status.
	 *
	 * @param id the ID of this employment status
	 */
	public void setId(long id);

	/**
	 * Returns the group ID of this employment status.
	 *
	 * @return the group ID of this employment status
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this employment status.
	 *
	 * @param groupId the group ID of this employment status
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this employment status.
	 *
	 * @return the company ID of this employment status
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this employment status.
	 *
	 * @param companyId the company ID of this employment status
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this employment status.
	 *
	 * @return the user ID of this employment status
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this employment status.
	 *
	 * @param userId the user ID of this employment status
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this employment status.
	 *
	 * @return the user uuid of this employment status
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this employment status.
	 *
	 * @param userUuid the user uuid of this employment status
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this employment status.
	 *
	 * @return the create date of this employment status
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this employment status.
	 *
	 * @param createDate the create date of this employment status
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this employment status.
	 *
	 * @return the modified date of this employment status
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this employment status.
	 *
	 * @param modifiedDate the modified date of this employment status
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the employmentstatus of this employment status.
	 *
	 * @return the employmentstatus of this employment status
	 */
	@AutoEscape
	public String getEmploymentstatus();

	/**
	 * Sets the employmentstatus of this employment status.
	 *
	 * @param employmentstatus the employmentstatus of this employment status
	 */
	public void setEmploymentstatus(String employmentstatus);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(EmploymentStatus employmentStatus);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmploymentStatus> toCacheModel();

	@Override
	public EmploymentStatus toEscapedModel();

	@Override
	public EmploymentStatus toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}