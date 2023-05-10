package de.hybris.platform.trainingsocialsitecore.dao;

import de.hybris.platform.trainingsocialsitecore.model.FaqModel;

import java.util.List;

public interface ITrainingFaqDao {

    public List<FaqModel> getFaqs();
    public FaqModel putFaqs();
}
