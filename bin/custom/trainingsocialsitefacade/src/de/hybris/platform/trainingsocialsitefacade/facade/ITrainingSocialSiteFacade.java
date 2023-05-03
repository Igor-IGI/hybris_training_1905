package de.hybris.platform.trainingsocialsitefacade.facade;

import de.hybris.platform.commercefacades.user.data.CustomerData;

import java.util.List;

public interface ITrainingSocialSiteFacade {
    public List<CustomerData> getCustomers();

    public CustomerData getCustomerById(String customerId);
}