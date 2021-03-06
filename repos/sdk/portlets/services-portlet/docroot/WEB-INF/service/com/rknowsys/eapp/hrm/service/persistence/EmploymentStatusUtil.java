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

package com.rknowsys.eapp.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rknowsys.eapp.hrm.model.EmploymentStatus;

import java.util.List;

/**
 * The persistence utility for the employment status service. This utility wraps {@link EmploymentStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author rknowsys
 * @see EmploymentStatusPersistence
 * @see EmploymentStatusPersistenceImpl
 * @generated
 */
public class EmploymentStatusUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(EmploymentStatus employmentStatus) {
		getPersistence().clearCache(employmentStatus);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EmploymentStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmploymentStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmploymentStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EmploymentStatus update(EmploymentStatus employmentStatus)
		throws SystemException {
		return getPersistence().update(employmentStatus);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EmploymentStatus update(EmploymentStatus employmentStatus,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employmentStatus, serviceContext);
	}

	/**
	* Caches the employment status in the entity cache if it is enabled.
	*
	* @param employmentStatus the employment status
	*/
	public static void cacheResult(
		com.rknowsys.eapp.hrm.model.EmploymentStatus employmentStatus) {
		getPersistence().cacheResult(employmentStatus);
	}

	/**
	* Caches the employment statuses in the entity cache if it is enabled.
	*
	* @param employmentStatuses the employment statuses
	*/
	public static void cacheResult(
		java.util.List<com.rknowsys.eapp.hrm.model.EmploymentStatus> employmentStatuses) {
		getPersistence().cacheResult(employmentStatuses);
	}

	/**
	* Creates a new employment status with the primary key. Does not add the employment status to the database.
	*
	* @param employmentStatusId the primary key for the new employment status
	* @return the new employment status
	*/
	public static com.rknowsys.eapp.hrm.model.EmploymentStatus create(
		long employmentStatusId) {
		return getPersistence().create(employmentStatusId);
	}

	/**
	* Removes the employment status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employmentStatusId the primary key of the employment status
	* @return the employment status that was removed
	* @throws com.rknowsys.eapp.hrm.NoSuchEmploymentStatusException if a employment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.EmploymentStatus remove(
		long employmentStatusId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rknowsys.eapp.hrm.NoSuchEmploymentStatusException {
		return getPersistence().remove(employmentStatusId);
	}

	public static com.rknowsys.eapp.hrm.model.EmploymentStatus updateImpl(
		com.rknowsys.eapp.hrm.model.EmploymentStatus employmentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employmentStatus);
	}

	/**
	* Returns the employment status with the primary key or throws a {@link com.rknowsys.eapp.hrm.NoSuchEmploymentStatusException} if it could not be found.
	*
	* @param employmentStatusId the primary key of the employment status
	* @return the employment status
	* @throws com.rknowsys.eapp.hrm.NoSuchEmploymentStatusException if a employment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.EmploymentStatus findByPrimaryKey(
		long employmentStatusId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rknowsys.eapp.hrm.NoSuchEmploymentStatusException {
		return getPersistence().findByPrimaryKey(employmentStatusId);
	}

	/**
	* Returns the employment status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employmentStatusId the primary key of the employment status
	* @return the employment status, or <code>null</code> if a employment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.EmploymentStatus fetchByPrimaryKey(
		long employmentStatusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employmentStatusId);
	}

	/**
	* Returns all the employment statuses.
	*
	* @return the employment statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.EmploymentStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the employment statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmploymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employment statuses
	* @param end the upper bound of the range of employment statuses (not inclusive)
	* @return the range of employment statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.EmploymentStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the employment statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmploymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employment statuses
	* @param end the upper bound of the range of employment statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employment statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.EmploymentStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employment statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employment statuses.
	*
	* @return the number of employment statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the leave rule applicables associated with the employment status.
	*
	* @param pk the primary key of the employment status
	* @return the leave rule applicables associated with the employment status
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.LeaveRuleApplicable> getLeaveRuleApplicables(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLeaveRuleApplicables(pk);
	}

	/**
	* Returns a range of all the leave rule applicables associated with the employment status.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmploymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the employment status
	* @param start the lower bound of the range of employment statuses
	* @param end the upper bound of the range of employment statuses (not inclusive)
	* @return the range of leave rule applicables associated with the employment status
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.LeaveRuleApplicable> getLeaveRuleApplicables(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLeaveRuleApplicables(pk, start, end);
	}

	/**
	* Returns an ordered range of all the leave rule applicables associated with the employment status.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmploymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the employment status
	* @param start the lower bound of the range of employment statuses
	* @param end the upper bound of the range of employment statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of leave rule applicables associated with the employment status
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.LeaveRuleApplicable> getLeaveRuleApplicables(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLeaveRuleApplicables(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of leave rule applicables associated with the employment status.
	*
	* @param pk the primary key of the employment status
	* @return the number of leave rule applicables associated with the employment status
	* @throws SystemException if a system exception occurred
	*/
	public static int getLeaveRuleApplicablesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLeaveRuleApplicablesSize(pk);
	}

	/**
	* Returns <code>true</code> if the leave rule applicable is associated with the employment status.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicablePK the primary key of the leave rule applicable
	* @return <code>true</code> if the leave rule applicable is associated with the employment status; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLeaveRuleApplicable(long pk,
		long leaveRuleApplicablePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLeaveRuleApplicable(pk, leaveRuleApplicablePK);
	}

	/**
	* Returns <code>true</code> if the employment status has any leave rule applicables associated with it.
	*
	* @param pk the primary key of the employment status to check for associations with leave rule applicables
	* @return <code>true</code> if the employment status has any leave rule applicables associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLeaveRuleApplicables(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLeaveRuleApplicables(pk);
	}

	/**
	* Adds an association between the employment status and the leave rule applicable. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicablePK the primary key of the leave rule applicable
	* @throws SystemException if a system exception occurred
	*/
	public static void addLeaveRuleApplicable(long pk,
		long leaveRuleApplicablePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLeaveRuleApplicable(pk, leaveRuleApplicablePK);
	}

	/**
	* Adds an association between the employment status and the leave rule applicable. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicable the leave rule applicable
	* @throws SystemException if a system exception occurred
	*/
	public static void addLeaveRuleApplicable(long pk,
		com.rknowsys.eapp.hrm.model.LeaveRuleApplicable leaveRuleApplicable)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLeaveRuleApplicable(pk, leaveRuleApplicable);
	}

	/**
	* Adds an association between the employment status and the leave rule applicables. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicablePKs the primary keys of the leave rule applicables
	* @throws SystemException if a system exception occurred
	*/
	public static void addLeaveRuleApplicables(long pk,
		long[] leaveRuleApplicablePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLeaveRuleApplicables(pk, leaveRuleApplicablePKs);
	}

	/**
	* Adds an association between the employment status and the leave rule applicables. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicables the leave rule applicables
	* @throws SystemException if a system exception occurred
	*/
	public static void addLeaveRuleApplicables(long pk,
		java.util.List<com.rknowsys.eapp.hrm.model.LeaveRuleApplicable> leaveRuleApplicables)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLeaveRuleApplicables(pk, leaveRuleApplicables);
	}

	/**
	* Clears all associations between the employment status and its leave rule applicables. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status to clear the associated leave rule applicables from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLeaveRuleApplicables(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLeaveRuleApplicables(pk);
	}

	/**
	* Removes the association between the employment status and the leave rule applicable. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicablePK the primary key of the leave rule applicable
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLeaveRuleApplicable(long pk,
		long leaveRuleApplicablePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLeaveRuleApplicable(pk, leaveRuleApplicablePK);
	}

	/**
	* Removes the association between the employment status and the leave rule applicable. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicable the leave rule applicable
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLeaveRuleApplicable(long pk,
		com.rknowsys.eapp.hrm.model.LeaveRuleApplicable leaveRuleApplicable)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLeaveRuleApplicable(pk, leaveRuleApplicable);
	}

	/**
	* Removes the association between the employment status and the leave rule applicables. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicablePKs the primary keys of the leave rule applicables
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLeaveRuleApplicables(long pk,
		long[] leaveRuleApplicablePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLeaveRuleApplicables(pk, leaveRuleApplicablePKs);
	}

	/**
	* Removes the association between the employment status and the leave rule applicables. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicables the leave rule applicables
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLeaveRuleApplicables(long pk,
		java.util.List<com.rknowsys.eapp.hrm.model.LeaveRuleApplicable> leaveRuleApplicables)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLeaveRuleApplicables(pk, leaveRuleApplicables);
	}

	/**
	* Sets the leave rule applicables associated with the employment status, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicablePKs the primary keys of the leave rule applicables to be associated with the employment status
	* @throws SystemException if a system exception occurred
	*/
	public static void setLeaveRuleApplicables(long pk,
		long[] leaveRuleApplicablePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLeaveRuleApplicables(pk, leaveRuleApplicablePKs);
	}

	/**
	* Sets the leave rule applicables associated with the employment status, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employment status
	* @param leaveRuleApplicables the leave rule applicables to be associated with the employment status
	* @throws SystemException if a system exception occurred
	*/
	public static void setLeaveRuleApplicables(long pk,
		java.util.List<com.rknowsys.eapp.hrm.model.LeaveRuleApplicable> leaveRuleApplicables)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLeaveRuleApplicables(pk, leaveRuleApplicables);
	}

	public static EmploymentStatusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmploymentStatusPersistence)PortletBeanLocatorUtil.locate(com.rknowsys.eapp.hrm.service.ClpSerializer.getServletContextName(),
					EmploymentStatusPersistence.class.getName());

			ReferenceRegistry.registerReference(EmploymentStatusUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmploymentStatusPersistence persistence) {
	}

	private static EmploymentStatusPersistence _persistence;
}