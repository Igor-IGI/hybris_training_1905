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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.trainingsocialsitecore.constants.TrainingsocialsitecoreConstants;
import de.hybris.platform.trainingsocialsitecore.jalo.SocialSite;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>TrainingsocialsitecoreManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class TrainingsocialsitecoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n SOCIALSITES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SocialSite> CUSTOMERTOSOCIALSITESOCIALSITESHANDLER = new OneToManyHandler<SocialSite>(
	TrainingsocialsitecoreConstants.TC.SOCIALSITE,
	true,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public SocialSite createSocialSite(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("SocialSite");
			return (SocialSite)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SocialSite : "+e.getMessage(), 0 );
		}
	}
	
	public SocialSite createSocialSite(final Map attributeValues)
	{
		return createSocialSite( getSession().getSessionContext(), attributeValues );
	}
	
	public static final TrainingsocialsitecoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingsocialsitecoreManager) em.getExtension(TrainingsocialsitecoreConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return TrainingsocialsitecoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.socialSites</code> attribute.
	 * @return the socialSites
	 */
	public Collection<SocialSite> getSocialSites(final SessionContext ctx, final Customer item)
	{
		return CUSTOMERTOSOCIALSITESOCIALSITESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.socialSites</code> attribute.
	 * @return the socialSites
	 */
	public Collection<SocialSite> getSocialSites(final Customer item)
	{
		return getSocialSites( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.socialSites</code> attribute. 
	 * @param value the socialSites
	 */
	public void setSocialSites(final SessionContext ctx, final Customer item, final Collection<SocialSite> value)
	{
		CUSTOMERTOSOCIALSITESOCIALSITESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.socialSites</code> attribute. 
	 * @param value the socialSites
	 */
	public void setSocialSites(final Customer item, final Collection<SocialSite> value)
	{
		setSocialSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to socialSites. 
	 * @param value the item to add to socialSites
	 */
	public void addToSocialSites(final SessionContext ctx, final Customer item, final SocialSite value)
	{
		CUSTOMERTOSOCIALSITESOCIALSITESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to socialSites. 
	 * @param value the item to add to socialSites
	 */
	public void addToSocialSites(final Customer item, final SocialSite value)
	{
		addToSocialSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from socialSites. 
	 * @param value the item to remove from socialSites
	 */
	public void removeFromSocialSites(final SessionContext ctx, final Customer item, final SocialSite value)
	{
		CUSTOMERTOSOCIALSITESOCIALSITESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from socialSites. 
	 * @param value the item to remove from socialSites
	 */
	public void removeFromSocialSites(final Customer item, final SocialSite value)
	{
		removeFromSocialSites( getSession().getSessionContext(), item, value );
	}
	
}
