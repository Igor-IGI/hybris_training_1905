/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 3 May 2023, 10:30:32                        ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.trainingsocialsitecore.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.trainingsocialsitecore.constants.TrainingsocialsitecoreConstants;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type SocialSite.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class SocialSite extends GenericItem
{
	/** Qualifier of the <code>SocialSite.nameOfSocialSite</code> attribute **/
	public static final String NAMEOFSOCIALSITE = "nameOfSocialSite";
	/** Qualifier of the <code>SocialSite.url</code> attribute **/
	public static final String URL = "url";
	/** Qualifier of the <code>SocialSite.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CUSTOMER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<SocialSite> CUSTOMERHANDLER = new BidirectionalOneToManyHandler<SocialSite>(
	TrainingsocialsitecoreConstants.TC.SOCIALSITE,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAMEOFSOCIALSITE, AttributeMode.INITIAL);
		tmp.put(URL, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CUSTOMERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialSite.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, "customer".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialSite.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialSite.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		CUSTOMERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialSite.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialSite.nameOfSocialSite</code> attribute.
	 * @return the nameOfSocialSite - Store the value of social site
	 */
	public EnumerationValue getNameOfSocialSite(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "nameOfSocialSite".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialSite.nameOfSocialSite</code> attribute.
	 * @return the nameOfSocialSite - Store the value of social site
	 */
	public EnumerationValue getNameOfSocialSite()
	{
		return getNameOfSocialSite( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialSite.nameOfSocialSite</code> attribute. 
	 * @param value the nameOfSocialSite - Store the value of social site
	 */
	public void setNameOfSocialSite(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "nameOfSocialSite".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialSite.nameOfSocialSite</code> attribute. 
	 * @param value the nameOfSocialSite - Store the value of social site
	 */
	public void setNameOfSocialSite(final EnumerationValue value)
	{
		setNameOfSocialSite( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialSite.url</code> attribute.
	 * @return the url - Store the value of url link to social site.
	 */
	public String getUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "url".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialSite.url</code> attribute.
	 * @return the url - Store the value of url link to social site.
	 */
	public String getUrl()
	{
		return getUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialSite.url</code> attribute. 
	 * @param value the url - Store the value of url link to social site.
	 */
	public void setUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "url".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialSite.url</code> attribute. 
	 * @param value the url - Store the value of url link to social site.
	 */
	public void setUrl(final String value)
	{
		setUrl( getSession().getSessionContext(), value );
	}
	
}
