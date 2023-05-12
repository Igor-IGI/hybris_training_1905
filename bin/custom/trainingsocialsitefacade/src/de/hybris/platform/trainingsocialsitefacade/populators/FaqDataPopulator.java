package de.hybris.platform.trainingsocialsitefacade.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.trainingsocialsitecore.model.FaqModel;
import de.hybris.platform.trainingsocialsitefacade.data.FaqData;
import org.springframework.util.Assert;

public class FaqDataPopulator implements Populator<FaqModel, FaqData> {

    @Override
    public void populate(FaqModel source, FaqData target) throws ConversionException {
        Assert.notNull(source, "Parameter source-FaqModel cannot be null.");
        Assert.notNull(target, "Parameter target-FaqData cannot be null.");

        target.setTitle(source.getTitle());
        target.setContent(source.getContent());
    }
}
