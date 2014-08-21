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

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.rknowsys.eapp.hrm.model.JobTitles;
import com.rknowsys.eapp.hrm.service.JobTitlesLocalServiceUtil;

/**
 * The extended model base implementation for the JobTitles service. Represents a row in the &quot;job_titles&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JobTitlesImpl}.
 * </p>
 *
 * @author rknowsys
 * @see JobTitlesImpl
 * @see com.rknowsys.eapp.hrm.model.JobTitles
 * @generated
 */
public abstract class JobTitlesBaseImpl extends JobTitlesModelImpl
	implements JobTitles {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a job titles model instance should use the {@link JobTitles} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			JobTitlesLocalServiceUtil.addJobTitles(this);
		}
		else {
			JobTitlesLocalServiceUtil.updateJobTitles(this);
		}
	}
}