package de.hybris.platform.trainingsocialsitefacade.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.trainingsocialsitecore.model.SocialSiteModel;
import de.hybris.platform.trainingsocialsitefacade.data.SocialSiteData;

public class SocialSiteDataPopulator implements Populator<SocialSiteModel, SocialSiteData> {
    @Override
    public void populate(SocialSiteModel source, SocialSiteData target) throws ConversionException {
        target.setSocialSite(source.getNameOfSocialSite().toString());
        target.setUrl(source.getUrl());
    }
}