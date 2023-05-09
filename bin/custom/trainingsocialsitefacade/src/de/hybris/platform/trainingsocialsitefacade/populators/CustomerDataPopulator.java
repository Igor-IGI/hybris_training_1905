package de.hybris.platform.trainingsocialsitefacade.populators;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.trainingsocialsitecore.model.SocialSiteModel;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.trainingsocialsitefacade.data.SocialSiteData;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class CustomerDataPopulator implements Populator<CustomerModel, CustomerData> {

    //Converter for converting SocialSiteModel to SocialSiteData
    private Converter<SocialSiteModel, SocialSiteData> socialSiteConverter;

    @Override
    public void populate(CustomerModel source, CustomerData target) throws ConversionException {
        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");

        List<String> customerData = List.of(source.getName().split(" "));
        if (customerData.size() > 1) {
            target.setFirstName(customerData.get(0));
            target.setLastName(customerData.get(1));
        } else
            target.setFirstName(customerData.get(0));

        // Get collection of SocialSiteModel and convert all objects from it whit using converter to new collection of SocialSiteData
        target.setSocialSites(Converters.convertAll(source.getSocialSites(), getSocialSiteConverter()));
    }

    public Converter<SocialSiteModel, SocialSiteData> getSocialSiteConverter() {
        return socialSiteConverter;
    }

    public void setSocialSiteConverter(final Converter<SocialSiteModel, SocialSiteData> socialSiteConverter) {
        this.socialSiteConverter = socialSiteConverter;
    }
}
