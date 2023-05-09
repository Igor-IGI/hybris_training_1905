package de.hybris.platform.trainingsocialsitecore.service.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.trainingsocialsitecore.dao.ITrainingSocialSiteCustomDao;
import de.hybris.platform.trainingsocialsitecore.dao.impl.TrainingSocialSiteCustomerDaoImpl;
import de.hybris.platform.trainingsocialsitecore.service.ITrainingSocialSiteCoreService;

import javax.annotation.Resource;
import java.util.List;

public class TrainingSocialSiteCoreService implements ITrainingSocialSiteCoreService {

    @Resource(name = "trainingSocialSiteDao")
    private ITrainingSocialSiteCustomDao trainingSocialSiteDao;

    @Override
    public List<CustomerModel> getCutomers() {
        final List<CustomerModel> customers = (List<CustomerModel>) getTrainingSocialSiteDao().getCustomers();
        return customers;
    }

    @Override
    public CustomerModel getCustomerById(String customerId) {
        return trainingSocialSiteDao.getCustomerById(customerId);
    }

    public ITrainingSocialSiteCustomDao getTrainingSocialSiteDao() {
        return trainingSocialSiteDao;
    }

    public void setTrainingSocialSiteDao(ITrainingSocialSiteCustomDao trainingSocialSiteDao) {
        this.trainingSocialSiteDao = trainingSocialSiteDao;
    }
}