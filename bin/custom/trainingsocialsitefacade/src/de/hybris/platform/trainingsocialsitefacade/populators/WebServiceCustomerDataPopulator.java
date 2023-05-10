package de.hybris.platform.trainingsocialsitefacade.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.trainingsocialsitecore.model.SocialSiteModel;
import de.hybris.platform.trainingsocialsitefacade.data.SocialSiteData;

public class WebServiceCustomerDataPopulator extends CustomerPopulator implements Populator<CustomerModel, CustomerData> {

    private Converter<SocialSiteModel, SocialSiteData> socialSiteConverter;

    public Converter<SocialSiteModel, SocialSiteData> getSocialSiteConverter() {
        return socialSiteConverter;
    }

    public void setSocialSiteConverter(Converter<SocialSiteModel, SocialSiteData> socialSiteConverter) {
        this.socialSiteConverter = socialSiteConverter;
    }

    @Override
    public void populate(CustomerModel source, CustomerData target) throws ConversionException {
        super.populate(source, target);

        target.setSocialSites(Converters.convertAll(source.getSocialSites(), getSocialSiteConverter()));
    }
}
