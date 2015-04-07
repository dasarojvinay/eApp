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

import com.rknowsys.eapp.hrm.model.NewsAttachments;
import com.rknowsys.eapp.hrm.model.NewsAttachmentsModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the NewsAttachments service. Represents a row in the &quot;news_attachments&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.NewsAttachmentsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NewsAttachmentsImpl}.
 * </p>
 *
 * @author rknowsys
 * @see NewsAttachmentsImpl
 * @see com.rknowsys.eapp.hrm.model.NewsAttachments
 * @see com.rknowsys.eapp.hrm.model.NewsAttachmentsModel
 * @generated
 */
public class NewsAttachmentsModelImpl extends BaseModelImpl<NewsAttachments>
	implements NewsAttachmentsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a news attachments model instance should use the {@link com.rknowsys.eapp.hrm.model.NewsAttachments} interface instead.
	 */
	public static final String TABLE_NAME = "news_attachments";
	public static final Object[][] TABLE_COLUMNS = {
			{ "newsAttachmentId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "attachmentTypeId", Types.BIGINT },
			{ "newsId", Types.BIGINT },
			{ "description", Types.VARCHAR },
			{ "uuid_", Types.VARCHAR },
			{ "fileName", Types.VARCHAR },
			{ "fileSize", Types.BIGINT },
			{ "fileType", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table news_attachments (newsAttachmentId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,attachmentTypeId LONG,newsId LONG,description VARCHAR(75) null,uuid_ VARCHAR(75) null,fileName VARCHAR(75) null,fileSize LONG,fileType VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table news_attachments";
	public static final String ORDER_BY_JPQL = " ORDER BY newsAttachments.newsAttachmentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY news_attachments.newsAttachmentId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.NewsAttachments"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.NewsAttachments"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.NewsAttachments"));

	public NewsAttachmentsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _newsAttachmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNewsAttachmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _newsAttachmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return NewsAttachments.class;
	}

	@Override
	public String getModelClassName() {
		return NewsAttachments.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("newsAttachmentId", getNewsAttachmentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("attachmentTypeId", getAttachmentTypeId());
		attributes.put("newsId", getNewsId());
		attributes.put("description", getDescription());
		attributes.put("uuid", getUuid());
		attributes.put("fileName", getFileName());
		attributes.put("fileSize", getFileSize());
		attributes.put("fileType", getFileType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long newsAttachmentId = (Long)attributes.get("newsAttachmentId");

		if (newsAttachmentId != null) {
			setNewsAttachmentId(newsAttachmentId);
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

		Long attachmentTypeId = (Long)attributes.get("attachmentTypeId");

		if (attachmentTypeId != null) {
			setAttachmentTypeId(attachmentTypeId);
		}

		Long newsId = (Long)attributes.get("newsId");

		if (newsId != null) {
			setNewsId(newsId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String fileName = (String)attributes.get("fileName");

		if (fileName != null) {
			setFileName(fileName);
		}

		Long fileSize = (Long)attributes.get("fileSize");

		if (fileSize != null) {
			setFileSize(fileSize);
		}

		String fileType = (String)attributes.get("fileType");

		if (fileType != null) {
			setFileType(fileType);
		}
	}

	@Override
	public long getNewsAttachmentId() {
		return _newsAttachmentId;
	}

	@Override
	public void setNewsAttachmentId(long newsAttachmentId) {
		_newsAttachmentId = newsAttachmentId;
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
	public long getAttachmentTypeId() {
		return _attachmentTypeId;
	}

	@Override
	public void setAttachmentTypeId(long attachmentTypeId) {
		_attachmentTypeId = attachmentTypeId;
	}

	@Override
	public long getNewsId() {
		return _newsId;
	}

	@Override
	public void setNewsId(long newsId) {
		_newsId = newsId;
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
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	@Override
	public String getFileName() {
		if (_fileName == null) {
			return StringPool.BLANK;
		}
		else {
			return _fileName;
		}
	}

	@Override
	public void setFileName(String fileName) {
		_fileName = fileName;
	}

	@Override
	public long getFileSize() {
		return _fileSize;
	}

	@Override
	public void setFileSize(long fileSize) {
		_fileSize = fileSize;
	}

	@Override
	public String getFileType() {
		if (_fileType == null) {
			return StringPool.BLANK;
		}
		else {
			return _fileType;
		}
	}

	@Override
	public void setFileType(String fileType) {
		_fileType = fileType;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			NewsAttachments.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public NewsAttachments toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (NewsAttachments)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		NewsAttachmentsImpl newsAttachmentsImpl = new NewsAttachmentsImpl();

		newsAttachmentsImpl.setNewsAttachmentId(getNewsAttachmentId());
		newsAttachmentsImpl.setCompanyId(getCompanyId());
		newsAttachmentsImpl.setGroupId(getGroupId());
		newsAttachmentsImpl.setCreateDate(getCreateDate());
		newsAttachmentsImpl.setModifiedDate(getModifiedDate());
		newsAttachmentsImpl.setUserId(getUserId());
		newsAttachmentsImpl.setAttachmentTypeId(getAttachmentTypeId());
		newsAttachmentsImpl.setNewsId(getNewsId());
		newsAttachmentsImpl.setDescription(getDescription());
		newsAttachmentsImpl.setUuid(getUuid());
		newsAttachmentsImpl.setFileName(getFileName());
		newsAttachmentsImpl.setFileSize(getFileSize());
		newsAttachmentsImpl.setFileType(getFileType());

		newsAttachmentsImpl.resetOriginalValues();

		return newsAttachmentsImpl;
	}

	@Override
	public int compareTo(NewsAttachments newsAttachments) {
		long primaryKey = newsAttachments.getPrimaryKey();

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

		if (!(obj instanceof NewsAttachments)) {
			return false;
		}

		NewsAttachments newsAttachments = (NewsAttachments)obj;

		long primaryKey = newsAttachments.getPrimaryKey();

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
	public CacheModel<NewsAttachments> toCacheModel() {
		NewsAttachmentsCacheModel newsAttachmentsCacheModel = new NewsAttachmentsCacheModel();

		newsAttachmentsCacheModel.newsAttachmentId = getNewsAttachmentId();

		newsAttachmentsCacheModel.companyId = getCompanyId();

		newsAttachmentsCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			newsAttachmentsCacheModel.createDate = createDate.getTime();
		}
		else {
			newsAttachmentsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			newsAttachmentsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			newsAttachmentsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		newsAttachmentsCacheModel.userId = getUserId();

		newsAttachmentsCacheModel.attachmentTypeId = getAttachmentTypeId();

		newsAttachmentsCacheModel.newsId = getNewsId();

		newsAttachmentsCacheModel.description = getDescription();

		String description = newsAttachmentsCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			newsAttachmentsCacheModel.description = null;
		}

		newsAttachmentsCacheModel.uuid = getUuid();

		String uuid = newsAttachmentsCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			newsAttachmentsCacheModel.uuid = null;
		}

		newsAttachmentsCacheModel.fileName = getFileName();

		String fileName = newsAttachmentsCacheModel.fileName;

		if ((fileName != null) && (fileName.length() == 0)) {
			newsAttachmentsCacheModel.fileName = null;
		}

		newsAttachmentsCacheModel.fileSize = getFileSize();

		newsAttachmentsCacheModel.fileType = getFileType();

		String fileType = newsAttachmentsCacheModel.fileType;

		if ((fileType != null) && (fileType.length() == 0)) {
			newsAttachmentsCacheModel.fileType = null;
		}

		return newsAttachmentsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{newsAttachmentId=");
		sb.append(getNewsAttachmentId());
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
		sb.append(", attachmentTypeId=");
		sb.append(getAttachmentTypeId());
		sb.append(", newsId=");
		sb.append(getNewsId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", uuid=");
		sb.append(getUuid());
		sb.append(", fileName=");
		sb.append(getFileName());
		sb.append(", fileSize=");
		sb.append(getFileSize());
		sb.append(", fileType=");
		sb.append(getFileType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.NewsAttachments");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>newsAttachmentId</column-name><column-value><![CDATA[");
		sb.append(getNewsAttachmentId());
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
			"<column><column-name>attachmentTypeId</column-name><column-value><![CDATA[");
		sb.append(getAttachmentTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newsId</column-name><column-value><![CDATA[");
		sb.append(getNewsId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileName</column-name><column-value><![CDATA[");
		sb.append(getFileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileSize</column-name><column-value><![CDATA[");
		sb.append(getFileSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileType</column-name><column-value><![CDATA[");
		sb.append(getFileType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = NewsAttachments.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			NewsAttachments.class
		};
	private long _newsAttachmentId;
	private long _companyId;
	private long _groupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private long _attachmentTypeId;
	private long _newsId;
	private String _description;
	private String _uuid;
	private String _fileName;
	private long _fileSize;
	private String _fileType;
	private NewsAttachments _escapedModel;
}