package de.hybris.platform.trainingsocialsitefacade.facade.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.trainingsocialsitecore.model.FaqModel;
import de.hybris.platform.trainingsocialsitecore.service.ITrainingFaqCoreService;
import de.hybris.platform.trainingsocialsitefacade.data.FaqData;
import de.hybris.platform.trainingsocialsitefacade.facade.ITrainingFaqFacade;

import javax.annotation.Resource;
import java.util.List;

public class TrainingFaqFacadeImpl implements ITrainingFaqFacade {

    private Converter<FaqModel, FaqData> converter;

    public Converter<FaqModel, FaqData> getConverter() {
        return converter;
    }

    public void setConverter(Converter<FaqModel, FaqData> converter) {
        this.converter = converter;
    }

    @Resource(name = "trainingFqaService")
    private ITrainingFaqCoreService trainingFaqCoreService;

    public ITrainingFaqCoreService getTrainingFaqCoreService() {
        return trainingFaqCoreService;
    }

    public void setTrainingFaqCoreService(ITrainingFaqCoreService trainingFaqCoreService) {
        this.trainingFaqCoreService = trainingFaqCoreService;
    }

    @Override
    public List<FaqData> getFaq() {
        return null;
    }
}
