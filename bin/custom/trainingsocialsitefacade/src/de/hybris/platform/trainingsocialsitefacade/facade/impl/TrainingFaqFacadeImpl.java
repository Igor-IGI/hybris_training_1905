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

    private Converter<FaqModel, FaqData> faqConverter;

    public Converter<FaqModel, FaqData> getFaqConverter() {
        return faqConverter;
    }

    public void setFaqConverter(Converter<FaqModel, FaqData> faqConverter) {
        this.faqConverter = faqConverter;
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
        return Converters.convertAll(getTrainingFaqCoreService().getFaqs(), getFaqConverter());
    }
}
