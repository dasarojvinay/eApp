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

import com.rknowsys.eapp.hrm.model.Locations;
import com.rknowsys.eapp.hrm.model.LocationsModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Locations service. Represents a row in the &quot;locations&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.LocationsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LocationsImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LocationsImpl
 * @see com.rknowsys.eapp.hrm.model.Locations
 * @see com.rknowsys.eapp.hrm.model.LocationsModel
 * @generated
 */
public class LocationsModelImpl extends BaseModelImpl<Locations>
	implements LocationsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a locations model instance should use the {@link com.rknowsys.eapp.hrm.model.Locations} interface instead.
	 */
	public static final String TABLE_NAME = "locations";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "country", Types.VARCHAR },
			{ "state_", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "postalcode", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "fax", Types.VARCHAR },
			{ "notes", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table locations (id_ LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,name VARCHAR(75) null,country VARCHAR(75) null,state_ VARCHAR(75) null,city VARCHAR(75) null,address VARCHAR(75) null,postalcode VARCHAR(75) null,phone VARCHAR(75) null,fax VARCHAR(75) null,notes VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table locations";
	public static final String ORDER_BY_JPQL = " ORDER BY locations.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY locations.id_ ASC";
	public static final String DATA_SOURCE = "anotherDataSource";
	public static final String SESSION_FACTORY = "anotherSessionFactory";
	public static final String TX_MANAGER = "anotherTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.Locations"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.Locations"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.Locations"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.Locations"));

	public LocationsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Locations.class;
	}

	@Override
	public String getModelClassName() {
		return Locations.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("name", getName());
		attributes.put("country", getCountry());
		attributes.put("state", getState());
		attributes.put("city", getCity());
		attributes.put("address", getAddress());
		attributes.put("postalcode", getPostalcode());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("notes", getNotes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String postalcode = (String)attributes.get("postalcode");

		if (postalcode != null) {
			setPostalcode(postalcode);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
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
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getCountry() {
		if (_country == null) {
			return StringPool.BLANK;
		}
		else {
			return _country;
		}
	}

	@Override
	public void setCountry(String country) {
		_country = country;
	}

	@Override
	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@Override
	public String getPostalcode() {
		if (_postalcode == null) {
			return StringPool.BLANK;
		}
		else {
			return _postalcode;
		}
	}

	@Override
	public void setPostalcode(String postalcode) {
		_postalcode = postalcode;
	}

	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@Override
	public String getFax() {
		if (_fax == null) {
			return StringPool.BLANK;
		}
		else {
			return _fax;
		}
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;
	}

	@Override
	public String getNotes() {
		if (_notes == null) {
			return StringPool.BLANK;
		}
		else {
			return _notes;
		}
	}

	@Override
	public void setNotes(String notes) {
		_notes = notes;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Locations.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Locations toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Locations)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LocationsImpl locationsImpl = new LocationsImpl();

		locationsImpl.setId(getId());
		locationsImpl.setCompanyId(getCompanyId());
		locationsImpl.setGroupId(getGroupId());
		locationsImpl.setCreateDate(getCreateDate());
		locationsImpl.setModifiedDate(getModifiedDate());
		locationsImpl.setUserId(getUserId());
		locationsImpl.setName(getName());
		locationsImpl.setCountry(getCountry());
		locationsImpl.setState(getState());
		locationsImpl.setCity(getCity());
		locationsImpl.setAddress(getAddress());
		locationsImpl.setPostalcode(getPostalcode());
		locationsImpl.setPhone(getPhone());
		locationsImpl.setFax(getFax());
		locationsImpl.setNotes(getNotes());

		locationsImpl.resetOriginalValues();

		return locationsImpl;
	}

	@Override
	public int compareTo(Locations locations) {
		long primaryKey = locations.getPrimaryKey();

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

		if (!(obj instanceof Locations)) {
			return false;
		}

		Locations locations = (Locations)obj;

		long primaryKey = locations.getPrimaryKey();

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
		LocationsModelImpl locationsModelImpl = this;

		locationsModelImpl._originalGroupId = locationsModelImpl._groupId;

		locationsModelImpl._setOriginalGroupId = false;

		locationsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Locations> toCacheModel() {
		LocationsCacheModel locationsCacheModel = new LocationsCacheModel();

		locationsCacheModel.id = getId();

		locationsCacheModel.companyId = getCompanyId();

		locationsCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			locationsCacheModel.createDate = createDate.getTime();
		}
		else {
			locationsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			locationsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			locationsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		locationsCacheModel.userId = getUserId();

		locationsCacheModel.name = getName();

		String name = locationsCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			locationsCacheModel.name = null;
		}

		locationsCacheModel.country = getCountry();

		String country = locationsCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			locationsCacheModel.country = null;
		}

		locationsCacheModel.state = getState();

		String state = locationsCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			locationsCacheModel.state = null;
		}

		locationsCacheModel.city = getCity();

		String city = locationsCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			locationsCacheModel.city = null;
		}

		locationsCacheModel.address = getAddress();

		String address = locationsCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			locationsCacheModel.address = null;
		}

		locationsCacheModel.postalcode = getPostalcode();

		String postalcode = locationsCacheModel.postalcode;

		if ((postalcode != null) && (postalcode.length() == 0)) {
			locationsCacheModel.postalcode = null;
		}

		locationsCacheModel.phone = getPhone();

		String phone = locationsCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			locationsCacheModel.phone = null;
		}

		locationsCacheModel.fax = getFax();

		String fax = locationsCacheModel.fax;

		if ((fax != null) && (fax.length() == 0)) {
			locationsCacheModel.fax = null;
		}

		locationsCacheModel.notes = getNotes();

		String notes = locationsCacheModel.notes;

		if ((notes != null) && (notes.length() == 0)) {
			locationsCacheModel.notes = null;
		}

		return locationsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
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
		sb.append(", name=");
		sb.append(getName());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", postalcode=");
		sb.append(getPostalcode());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", notes=");
		sb.append(getNotes());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.Locations");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postalcode</column-name><column-value><![CDATA[");
		sb.append(getPostalcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notes</column-name><column-value><![CDATA[");
		sb.append(getNotes());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Locations.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Locations.class
		};
	private long _id;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private String _name;
	private String _country;
	private String _state;
	private String _city;
	private String _address;
	private String _postalcode;
	private String _phone;
	private String _fax;
	private String _notes;
	private long _columnBitmask;
	private Locations _escapedModel;
}