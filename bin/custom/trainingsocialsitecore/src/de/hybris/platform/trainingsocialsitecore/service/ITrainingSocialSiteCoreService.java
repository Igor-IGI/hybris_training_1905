package de.hybris.platform.trainingsocialsitecore.service;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.Collection;
import java.util.List;

public interface ITrainingSocialSiteCoreService {

    public List<CustomerModel> getCutomers();
    public CustomerModel getCustomerById(String CustomerId);
}
