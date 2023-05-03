package de.hybris.platform.trainingsocialsitecore.service.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.trainingsocialsitecore.dao.impl.TrainingSocialSiteCustomerDaoImpl;
import de.hybris.platform.trainingsocialsitecore.service.ITrainingSocialSiteCoreService;

import java.util.List;

public class TrainingSocialSiteCoreService implements ITrainingSocialSiteCoreService {

    private TrainingSocialSiteCustomerDaoImpl trainingSocialSiteDao;


    @Override
    public List<CustomerModel> getCutomers() {
        return (List<CustomerModel>) trainingSocialSiteDao.getCustomers();
    }

    @Override
    public CustomerModel getCustomerById(String customerId) {
        return trainingSocialSiteDao.getCustomerById(customerId);
    }
}
