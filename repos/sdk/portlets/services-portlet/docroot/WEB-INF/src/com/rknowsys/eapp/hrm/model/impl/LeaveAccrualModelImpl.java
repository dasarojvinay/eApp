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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.LeaveAccrual;
import com.rknowsys.eapp.hrm.model.LeaveAccrualModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LeaveAccrual service. Represents a row in the &quot;leave_accrual&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.LeaveAccrualModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeaveAccrualImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LeaveAccrualImpl
 * @see com.rknowsys.eapp.hrm.model.LeaveAccrual
 * @see com.rknowsys.eapp.hrm.model.LeaveAccrualModel
 * @generated
 */
public class LeaveAccrualModelImpl extends BaseModelImpl<LeaveAccrual>
	implements LeaveAccrualModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leave accrual model instance should use the {@link com.rknowsys.eapp.hrm.model.LeaveAccrual} interface instead.
	 */
	public static final String TABLE_NAME = "leave_accrual";
	public static final Object[][] TABLE_COLUMNS = {
			{ "leaveAccrualId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "leaveTypeId", Types.BIGINT },
			{ "accrualFrequency", Types.VARCHAR },
			{ "accrueEvery", Types.INTEGER },
			{ "dayOfCredit", Types.INTEGER },
			{ "accrualStartsOn", Types.VARCHAR },
			{ "monthOfCredit", Types.INTEGER },
			{ "accrualValidFrom", Types.VARCHAR },
			{ "firstAccrual", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table leave_accrual (leaveAccrualId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,leaveTypeId LONG,accrualFrequency VARCHAR(75) null,accrueEvery INTEGER,dayOfCredit INTEGER,accrualStartsOn VARCHAR(75) null,monthOfCredit INTEGER,accrualValidFrom VARCHAR(75) null,firstAccrual VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table leave_accrual";
	public static final String ORDER_BY_JPQL = " ORDER BY leaveAccrual.leaveAccrualId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY leave_accrual.leaveAccrualId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.LeaveAccrual"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.LeaveAccrual"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.LeaveAccrual"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long LEAVETYPEID_COLUMN_BITMASK = 2L;
	public static long LEAVEACCRUALID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.LeaveAccrual"));

	public LeaveAccrualModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _leaveAccrualId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLeaveAccrualId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _leaveAccrualId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LeaveAccrual.class;
	}

	@Override
	public String getModelClassName() {
		return LeaveAccrual.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("leaveAccrualId", getLeaveAccrualId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("leaveTypeId", getLeaveTypeId());
		attributes.put("accrualFrequency", getAccrualFrequency());
		attributes.put("accrueEvery", getAccrueEvery());
		attributes.put("dayOfCredit", getDayOfCredit());
		attributes.put("accrualStartsOn", getAccrualStartsOn());
		attributes.put("monthOfCredit", getMonthOfCredit());
		attributes.put("accrualValidFrom", getAccrualValidFrom());
		attributes.put("firstAccrual", getFirstAccrual());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long leaveAccrualId = (Long)attributes.get("leaveAccrualId");

		if (leaveAccrualId != null) {
			setLeaveAccrualId(leaveAccrualId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long leaveTypeId = (Long)attributes.get("leaveTypeId");

		if (leaveTypeId != null) {
			setLeaveTypeId(leaveTypeId);
		}

		String accrualFrequency = (String)attributes.get("accrualFrequency");

		if (accrualFrequency != null) {
			setAccrualFrequency(accrualFrequency);
		}

		Integer accrueEvery = (Integer)attributes.get("accrueEvery");

		if (accrueEvery != null) {
			setAccrueEvery(accrueEvery);
		}

		Integer dayOfCredit = (Integer)attributes.get("dayOfCredit");

		if (dayOfCredit != null) {
			setDayOfCredit(dayOfCredit);
		}

		String accrualStartsOn = (String)attributes.get("accrualStartsOn");

		if (accrualStartsOn != null) {
			setAccrualStartsOn(accrualStartsOn);
		}

		Integer monthOfCredit = (Integer)attributes.get("monthOfCredit");

		if (monthOfCredit != null) {
			setMonthOfCredit(monthOfCredit);
		}

		String accrualValidFrom = (String)attributes.get("accrualValidFrom");

		if (accrualValidFrom != null) {
			setAccrualValidFrom(accrualValidFrom);
		}

		String firstAccrual = (String)attributes.get("firstAccrual");

		if (firstAccrual != null) {
			setFirstAccrual(firstAccrual);
		}
	}

	@Override
	public long getLeaveAccrualId() {
		return _leaveAccrualId;
	}

	@Override
	public void setLeaveAccrualId(long leaveAccrualId) {
		_leaveAccrualId = leaveAccrualId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getLeaveTypeId() {
		return _leaveTypeId;
	}

	@Override
	public void setLeaveTypeId(long leaveTypeId) {
		_columnBitmask |= LEAVETYPEID_COLUMN_BITMASK;

		if (!_setOriginalLeaveTypeId) {
			_setOriginalLeaveTypeId = true;

			_originalLeaveTypeId = _leaveTypeId;
		}

		_leaveTypeId = leaveTypeId;
	}

	public long getOriginalLeaveTypeId() {
		return _originalLeaveTypeId;
	}

	@Override
	public String getAccrualFrequency() {
		if (_accrualFrequency == null) {
			return StringPool.BLANK;
		}
		else {
			return _accrualFrequency;
		}
	}

	@Override
	public void setAccrualFrequency(String accrualFrequency) {
		_accrualFrequency = accrualFrequency;
	}

	@Override
	public int getAccrueEvery() {
		return _accrueEvery;
	}

	@Override
	public void setAccrueEvery(int accrueEvery) {
		_accrueEvery = accrueEvery;
	}

	@Override
	public int getDayOfCredit() {
		return _dayOfCredit;
	}

	@Override
	public void setDayOfCredit(int dayOfCredit) {
		_dayOfCredit = dayOfCredit;
	}

	@Override
	public String getAccrualStartsOn() {
		if (_accrualStartsOn == null) {
			return StringPool.BLANK;
		}
		else {
			return _accrualStartsOn;
		}
	}

	@Override
	public void setAccrualStartsOn(String accrualStartsOn) {
		_accrualStartsOn = accrualStartsOn;
	}

	@Override
	public int getMonthOfCredit() {
		return _monthOfCredit;
	}

	@Override
	public void setMonthOfCredit(int monthOfCredit) {
		_monthOfCredit = monthOfCredit;
	}

	@Override
	public String getAccrualValidFrom() {
		if (_accrualValidFrom == null) {
			return StringPool.BLANK;
		}
		else {
			return _accrualValidFrom;
		}
	}

	@Override
	public void setAccrualValidFrom(String accrualValidFrom) {
		_accrualValidFrom = accrualValidFrom;
	}

	@Override
	public String getFirstAccrual() {
		if (_firstAccrual == null) {
			return StringPool.BLANK;
		}
		else {
			return _firstAccrual;
		}
	}

	@Override
	public void setFirstAccrual(String firstAccrual) {
		_firstAccrual = firstAccrual;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LeaveAccrual.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LeaveAccrual toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LeaveAccrual)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LeaveAccrualImpl leaveAccrualImpl = new LeaveAccrualImpl();

		leaveAccrualImpl.setLeaveAccrualId(getLeaveAccrualId());
		leaveAccrualImpl.setCompanyId(getCompanyId());
		leaveAccrualImpl.setGroupId(getGroupId());
		leaveAccrualImpl.setCreateDate(getCreateDate());
		leaveAccrualImpl.setModifiedDate(getModifiedDate());
		leaveAccrualImpl.setUserId(getUserId());
		leaveAccrualImpl.setLeaveTypeId(getLeaveTypeId());
		leaveAccrualImpl.setAccrualFrequency(getAccrualFrequency());
		leaveAccrualImpl.setAccrueEvery(getAccrueEvery());
		leaveAccrualImpl.setDayOfCredit(getDayOfCredit());
		leaveAccrualImpl.setAccrualStartsOn(getAccrualStartsOn());
		leaveAccrualImpl.setMonthOfCredit(getMonthOfCredit());
		leaveAccrualImpl.setAccrualValidFrom(getAccrualValidFrom());
		leaveAccrualImpl.setFirstAccrual(getFirstAccrual());

		leaveAccrualImpl.resetOriginalValues();

		return leaveAccrualImpl;
	}

	@Override
	public int compareTo(LeaveAccrual leaveAccrual) {
		long primaryKey = leaveAccrual.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeaveAccrual)) {
			return false;
		}

		LeaveAccrual leaveAccrual = (LeaveAccrual)obj;

		long primaryKey = leaveAccrual.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		LeaveAccrualModelImpl leaveAccrualModelImpl = this;

		leaveAccrualModelImpl._originalGroupId = leaveAccrualModelImpl._groupId;

		leaveAccrualModelImpl._setOriginalGroupId = false;

		leaveAccrualModelImpl._originalLeaveTypeId = leaveAccrualModelImpl._leaveTypeId;

		leaveAccrualModelImpl._setOriginalLeaveTypeId = false;

		leaveAccrualModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LeaveAccrual> toCacheModel() {
		LeaveAccrualCacheModel leaveAccrualCacheModel = new LeaveAccrualCacheModel();

		leaveAccrualCacheModel.leaveAccrualId = getLeaveAccrualId();

		leaveAccrualCacheModel.companyId = getCompanyId();

		leaveAccrualCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			leaveAccrualCacheModel.createDate = createDate.getTime();
		}
		else {
			leaveAccrualCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			leaveAccrualCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			leaveAccrualCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		leaveAccrualCacheModel.userId = getUserId();

		leaveAccrualCacheModel.leaveTypeId = getLeaveTypeId();

		leaveAccrualCacheModel.accrualFrequency = getAccrualFrequency();

		String accrualFrequency = leaveAccrualCacheModel.accrualFrequency;

		if ((accrualFrequency != null) && (accrualFrequency.length() == 0)) {
			leaveAccrualCacheModel.accrualFrequency = null;
		}

		leaveAccrualCacheModel.accrueEvery = getAccrueEvery();

		leaveAccrualCacheModel.dayOfCredit = getDayOfCredit();

		leaveAccrualCacheModel.accrualStartsOn = getAccrualStartsOn();

		String accrualStartsOn = leaveAccrualCacheModel.accrualStartsOn;

		if ((accrualStartsOn != null) && (accrualStartsOn.length() == 0)) {
			leaveAccrualCacheModel.accrualStartsOn = null;
		}

		leaveAccrualCacheModel.monthOfCredit = getMonthOfCredit();

		leaveAccrualCacheModel.accrualValidFrom = getAccrualValidFrom();

		String accrualValidFrom = leaveAccrualCacheModel.accrualValidFrom;

		if ((accrualValidFrom != null) && (accrualValidFrom.length() == 0)) {
			leaveAccrualCacheModel.accrualValidFrom = null;
		}

		leaveAccrualCacheModel.firstAccrual = getFirstAccrual();

		String firstAccrual = leaveAccrualCacheModel.firstAccrual;

		if ((firstAccrual != null) && (firstAccrual.length() == 0)) {
			leaveAccrualCacheModel.firstAccrual = null;
		}

		return leaveAccrualCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{leaveAccrualId=");
		sb.append(getLeaveAccrualId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", leaveTypeId=");
		sb.append(getLeaveTypeId());
		sb.append(", accrualFrequency=");
		sb.append(getAccrualFrequency());
		sb.append(", accrueEvery=");
		sb.append(getAccrueEvery());
		sb.append(", dayOfCredit=");
		sb.append(getDayOfCredit());
		sb.append(", accrualStartsOn=");
		sb.append(getAccrualStartsOn());
		sb.append(", monthOfCredit=");
		sb.append(getMonthOfCredit());
		sb.append(", accrualValidFrom=");
		sb.append(getAccrualValidFrom());
		sb.append(", firstAccrual=");
		sb.append(getFirstAccrual());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.LeaveAccrual");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>leaveAccrualId</column-name><column-value><![CDATA[");
		sb.append(getLeaveAccrualId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leaveTypeId</column-name><column-value><![CDATA[");
		sb.append(getLeaveTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accrualFrequency</column-name><column-value><![CDATA[");
		sb.append(getAccrualFrequency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accrueEvery</column-name><column-value><![CDATA[");
		sb.append(getAccrueEvery());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dayOfCredit</column-name><column-value><![CDATA[");
		sb.append(getDayOfCredit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accrualStartsOn</column-name><column-value><![CDATA[");
		sb.append(getAccrualStartsOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>monthOfCredit</column-name><column-value><![CDATA[");
		sb.append(getMonthOfCredit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accrualValidFrom</column-name><column-value><![CDATA[");
		sb.append(getAccrualValidFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstAccrual</column-name><column-value><![CDATA[");
		sb.append(getFirstAccrual());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LeaveAccrual.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LeaveAccrual.class
		};
	private long _leaveAccrualId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private long _leaveTypeId;
	private long _originalLeaveTypeId;
	private boolean _setOriginalLeaveTypeId;
	private String _accrualFrequency;
	private int _accrueEvery;
	private int _dayOfCredit;
	private String _accrualStartsOn;
	private int _monthOfCredit;
	private String _accrualValidFrom;
	private String _firstAccrual;
	private long _columnBitmask;
	private LeaveAccrual _escapedModel;
}