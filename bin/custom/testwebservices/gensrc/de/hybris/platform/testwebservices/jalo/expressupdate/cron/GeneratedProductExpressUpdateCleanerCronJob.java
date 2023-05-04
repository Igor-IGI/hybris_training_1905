/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4 May 2023, 13:15:36                        ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.testwebservices.jalo.expressupdate.cron;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.testwebservices.constants.YcommercewebservicesConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.testwebservices.jalo.expressupdate.cron.ProductExpressUpdateCleanerCronJob ProductExpressUpdateCleanerCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedProductExpressUpdateCleanerCronJob extends CronJob
{
	/** Qualifier of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute **/
	public static final String QUEUETIMELIMIT = "queueTimeLimit";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(QUEUETIMELIMIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute.
	 * @return the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	public Integer getQueueTimeLimit(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QUEUETIMELIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute.
	 * @return the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	public Integer getQueueTimeLimit()
	{
		return getQueueTimeLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute. 
	 * @return the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	public int getQueueTimeLimitAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQueueTimeLimit( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute. 
	 * @return the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	public int getQueueTimeLimitAsPrimitive()
	{
		return getQueueTimeLimitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute. 
	 * @param value the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	public void setQueueTimeLimit(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QUEUETIMELIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute. 
	 * @param value the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	public void setQueueTimeLimit(final Integer value)
	{
		setQueueTimeLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute. 
	 * @param value the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	public void setQueueTimeLimit(final SessionContext ctx, final int value)
	{
		setQueueTimeLimit( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute. 
	 * @param value the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	public void setQueueTimeLimit(final int value)
	{
		setQueueTimeLimit( getSession().getSessionContext(), value );
	}
	
}
