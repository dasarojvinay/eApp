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

import com.rknowsys.eapp.hrm.model.Documents;
import com.rknowsys.eapp.hrm.model.DocumentsModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Documents service. Represents a row in the &quot;documents&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.DocumentsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocumentsImpl}.
 * </p>
 *
 * @author rknowsys
 * @see DocumentsImpl
 * @see com.rknowsys.eapp.hrm.model.Documents
 * @see com.rknowsys.eapp.hrm.model.DocumentsModel
 * @generated
 */
public class DocumentsModelImpl extends BaseModelImpl<Documents>
	implements DocumentsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a documents model instance should use the {@link com.rknowsys.eapp.hrm.model.Documents} interface instead.
	 */
	public static final String TABLE_NAME = "documents";
	public static final Object[][] TABLE_COLUMNS = {
			{ "documentId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "topic", Types.VARCHAR },
			{ "category", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "publishDate", Types.TIMESTAMP },
			{ "status", Types.BOOLEAN },
			{ "admin", Types.BOOLEAN },
			{ "supervisor", Types.BOOLEAN },
			{ "allEmployees", Types.BOOLEAN },
			{ "publishedTo", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table documents (documentId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,topic VARCHAR(75) null,category VARCHAR(75) null,description VARCHAR(75) null,publishDate DATE null,status BOOLEAN,admin BOOLEAN,supervisor BOOLEAN,allEmployees BOOLEAN,publishedTo VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table documents";
	public static final String ORDER_BY_JPQL = " ORDER BY documents.documentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY documents.documentId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.Documents"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.Documents"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.Documents"));

	public DocumentsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _documentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDocumentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _documentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Documents.class;
	}

	@Override
	public String getModelClassName() {
		return Documents.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("documentId", getDocumentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("topic", getTopic());
		attributes.put("category", getCategory());
		attributes.put("description", getDescription());
		attributes.put("publishDate", getPublishDate());
		attributes.put("status", getStatus());
		attributes.put("admin", getAdmin());
		attributes.put("supervisor", getSupervisor());
		attributes.put("allEmployees", getAllEmployees());
		attributes.put("publishedTo", getPublishedTo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long documentId = (Long)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
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

		String topic = (String)attributes.get("topic");

		if (topic != null) {
			setTopic(topic);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date publishDate = (Date)attributes.get("publishDate");

		if (publishDate != null) {
			setPublishDate(publishDate);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Boolean admin = (Boolean)attributes.get("admin");

		if (admin != null) {
			setAdmin(admin);
		}

		Boolean supervisor = (Boolean)attributes.get("supervisor");

		if (supervisor != null) {
			setSupervisor(supervisor);
		}

		Boolean allEmployees = (Boolean)attributes.get("allEmployees");

		if (allEmployees != null) {
			setAllEmployees(allEmployees);
		}

		String publishedTo = (String)attributes.get("publishedTo");

		if (publishedTo != null) {
			setPublishedTo(publishedTo);
		}
	}

	@Override
	public long getDocumentId() {
		return _documentId;
	}

	@Override
	public void setDocumentId(long documentId) {
		_documentId = documentId;
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
		_groupId = groupId;
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
	public String getTopic() {
		if (_topic == null) {
			return StringPool.BLANK;
		}
		else {
			return _topic;
		}
	}

	@Override
	public void setTopic(String topic) {
		_topic = topic;
	}

	@Override
	public String getCategory() {
		if (_category == null) {
			return StringPool.BLANK;
		}
		else {
			return _category;
		}
	}

	@Override
	public void setCategory(String category) {
		_category = category;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public Date getPublishDate() {
		return _publishDate;
	}

	@Override
	public void setPublishDate(Date publishDate) {
		_publishDate = publishDate;
	}

	@Override
	public boolean getStatus() {
		return _status;
	}

	@Override
	public boolean isStatus() {
		return _status;
	}

	@Override
	public void setStatus(boolean status) {
		_status = status;
	}

	@Override
	public boolean getAdmin() {
		return _admin;
	}

	@Override
	public boolean isAdmin() {
		return _admin;
	}

	@Override
	public void setAdmin(boolean admin) {
		_admin = admin;
	}

	@Override
	public boolean getSupervisor() {
		return _supervisor;
	}

	@Override
	public boolean isSupervisor() {
		return _supervisor;
	}

	@Override
	public void setSupervisor(boolean supervisor) {
		_supervisor = supervisor;
	}

	@Override
	public boolean getAllEmployees() {
		return _allEmployees;
	}

	@Override
	public boolean isAllEmployees() {
		return _allEmployees;
	}

	@Override
	public void setAllEmployees(boolean allEmployees) {
		_allEmployees = allEmployees;
	}

	@Override
	public String getPublishedTo() {
		if (_publishedTo == null) {
			return StringPool.BLANK;
		}
		else {
			return _publishedTo;
		}
	}

	@Override
	public void setPublishedTo(String publishedTo) {
		_publishedTo = publishedTo;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Documents.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Documents toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Documents)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DocumentsImpl documentsImpl = new DocumentsImpl();

		documentsImpl.setDocumentId(getDocumentId());
		documentsImpl.setCompanyId(getCompanyId());
		documentsImpl.setGroupId(getGroupId());
		documentsImpl.setCreateDate(getCreateDate());
		documentsImpl.setModifiedDate(getModifiedDate());
		documentsImpl.setUserId(getUserId());
		documentsImpl.setTopic(getTopic());
		documentsImpl.setCategory(getCategory());
		documentsImpl.setDescription(getDescription());
		documentsImpl.setPublishDate(getPublishDate());
		documentsImpl.setStatus(getStatus());
		documentsImpl.setAdmin(getAdmin());
		documentsImpl.setSupervisor(getSupervisor());
		documentsImpl.setAllEmployees(getAllEmployees());
		documentsImpl.setPublishedTo(getPublishedTo());

		documentsImpl.resetOriginalValues();

		return documentsImpl;
	}

	@Override
	public int compareTo(Documents documents) {
		long primaryKey = documents.getPrimaryKey();

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

		if (!(obj instanceof Documents)) {
			return false;
		}

		Documents documents = (Documents)obj;

		long primaryKey = documents.getPrimaryKey();

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
	}

	@Override
	public CacheModel<Documents> toCacheModel() {
		DocumentsCacheModel documentsCacheModel = new DocumentsCacheModel();

		documentsCacheModel.documentId = getDocumentId();

		documentsCacheModel.companyId = getCompanyId();

		documentsCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			documentsCacheModel.createDate = createDate.getTime();
		}
		else {
			documentsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			documentsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			documentsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		documentsCacheModel.userId = getUserId();

		documentsCacheModel.topic = getTopic();

		String topic = documentsCacheModel.topic;

		if ((topic != null) && (topic.length() == 0)) {
			documentsCacheModel.topic = null;
		}

		documentsCacheModel.category = getCategory();

		String category = documentsCacheModel.category;

		if ((category != null) && (category.length() == 0)) {
			documentsCacheModel.category = null;
		}

		documentsCacheModel.description = getDescription();

		String description = documentsCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			documentsCacheModel.description = null;
		}

		Date publishDate = getPublishDate();

		if (publishDate != null) {
			documentsCacheModel.publishDate = publishDate.getTime();
		}
		else {
			documentsCacheModel.publishDate = Long.MIN_VALUE;
		}

		documentsCacheModel.status = getStatus();

		documentsCacheModel.admin = getAdmin();

		documentsCacheModel.supervisor = getSupervisor();

		documentsCacheModel.allEmployees = getAllEmployees();

		documentsCacheModel.publishedTo = getPublishedTo();

		String publishedTo = documentsCacheModel.publishedTo;

		if ((publishedTo != null) && (publishedTo.length() == 0)) {
			documentsCacheModel.publishedTo = null;
		}

		return documentsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{documentId=");
		sb.append(getDocumentId());
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
		sb.append(", topic=");
		sb.append(getTopic());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", publishDate=");
		sb.append(getPublishDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", admin=");
		sb.append(getAdmin());
		sb.append(", supervisor=");
		sb.append(getSupervisor());
		sb.append(", allEmployees=");
		sb.append(getAllEmployees());
		sb.append(", publishedTo=");
		sb.append(getPublishedTo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.Documents");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>documentId</column-name><column-value><![CDATA[");
		sb.append(getDocumentId());
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
			"<column><column-name>topic</column-name><column-value><![CDATA[");
		sb.append(getTopic());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishDate</column-name><column-value><![CDATA[");
		sb.append(getPublishDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>admin</column-name><column-value><![CDATA[");
		sb.append(getAdmin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>supervisor</column-name><column-value><![CDATA[");
		sb.append(getSupervisor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>allEmployees</column-name><column-value><![CDATA[");
		sb.append(getAllEmployees());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishedTo</column-name><column-value><![CDATA[");
		sb.append(getPublishedTo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Documents.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Documents.class
		};
	private long _documentId;
	private long _companyId;
	private long _groupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private String _topic;
	private String _category;
	private String _description;
	private Date _publishDate;
	private boolean _status;
	private boolean _admin;
	private boolean _supervisor;
	private boolean _allEmployees;
	private String _publishedTo;
	private Documents _escapedModel;
}