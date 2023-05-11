package de.hybris.platform.trainingsocialsitecore.service.impl;

import de.hybris.platform.trainingsocialsitecore.dao.impl.TrainingFaqDaoImpl;
import de.hybris.platform.trainingsocialsitecore.model.FaqModel;
import de.hybris.platform.trainingsocialsitecore.service.ITrainingFaqCoreService;
import de.hybris.platform.trainingsocialsitecore.service.ITrainingSocialSiteCoreService;

import javax.annotation.Resource;
import java.util.List;

public class TrainingFaqCoreService implements ITrainingFaqCoreService {

    public TrainingFaqDaoImpl getTrainingFaqDao() {
        return trainingFaqDao;
    }

    public void setTrainingFaqDao(TrainingFaqDaoImpl trainingFaqDao) {
        this.trainingFaqDao = trainingFaqDao;
    }

    @Resource(name = "trainingFaqDao")
    private TrainingFaqDaoImpl trainingFaqDao;


    @Override
    public List<FaqModel> getFaqs() {
        return getTrainingFaqDao().getFaqs();
    }
}
