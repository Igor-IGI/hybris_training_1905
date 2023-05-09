package de.hybris.platform.trainingsocialsitecore.dao;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.Collection;
import java.util.List;

public interface ITrainingSocialSiteCustomDao {

    List<CustomerModel> getCustomers();
    CustomerModel getCustomerById(String uId);
}