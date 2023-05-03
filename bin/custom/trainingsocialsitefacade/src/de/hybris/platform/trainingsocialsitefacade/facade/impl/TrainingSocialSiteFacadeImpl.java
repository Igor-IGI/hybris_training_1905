package de.hybris.platform.trainingsocialsitefacade.facade.impl;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.trainingsocialsitecore.service.impl.TrainingSocialSiteCoreService;
import de.hybris.platform.trainingsocialsitefacade.facade.ITrainingSocialSiteFacade;

import java.util.List;

public class TrainingSocialSiteFacadeImpl implements ITrainingSocialSiteFacade {

    private TrainingSocialSiteCoreService courseService;
    private Converter<CustomerModel, CustomerData> trainingCustomerConverter;

    @Override
    public List<CustomerData> getCustomers() {
        //Convert CustomerModel to CustomerData
        return Converters.convertAll(getCourseService().getCutomers(), getTrainingCustomerConverter());
    }

    @Override
    public CustomerData getCustomerById(String customerId) {
        //Convert CustomerModel to CustomerData
        return getTrainingCustomerConverter().convert(getCourseService().getCustomerById(customerId));
    }

    public Converter<CustomerModel, CustomerData> getTrainingCustomerConverter() {
        return trainingCustomerConverter;
    }

    public void setTrainingCustomerConverter(Converter<CustomerModel, CustomerData> trainingCustomerConverter) {
        this.trainingCustomerConverter = trainingCustomerConverter;
    }

    public TrainingSocialSiteCoreService getCourseService() {
        return courseService;
    }

    public void setCourseService(TrainingSocialSiteCoreService courseService) {
        this.courseService = courseService;
    }

}