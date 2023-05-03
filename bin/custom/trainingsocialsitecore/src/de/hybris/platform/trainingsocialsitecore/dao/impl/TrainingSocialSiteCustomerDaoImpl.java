package de.hybris.platform.trainingsocialsitecore.dao.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.trainingsocialsitecore.dao.ITrainingSocialSiteCustomDao;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class TrainingSocialSiteCustomerDaoImpl extends AbstractItemDao implements ITrainingSocialSiteCustomDao {
    private final String CUSTOMER_QUERY = "SELECT {" + CustomerModel.PK + "}" + "FROM {" +
            CustomerModel._TYPECODE + "} AS customers";

    private final String CUSTOMER_BY_ID_QUERY = "SELECT {" + CustomerModel.PK + "}" + "FROM {"
            + CustomerModel._TYPECODE + "} WHERE {" + CustomerModel.UID + "}=?customerId";

    @Override
    public Collection<CustomerModel> getCustomers() {
        final SearchResult<CustomerModel> customersModelSearchResult =
                (SearchResult<CustomerModel>) getFlexibleSearchService().search(CUSTOMER_QUERY);
        return customersModelSearchResult.getResult() == null ? Collections.emptyList() : customersModelSearchResult.getResult();
    }

    @Override
    public CustomerModel getCustomerById(String customerId) {
        validateParameterNotNull(customerId, "Customer ID can't be empty!");

        // Create new Maping object where we store object (customer);
        final Map<String, Object> parameter = new HashMap<>();
        parameter.put("customerId", customerId);

        final SearchResult<CustomerModel> customerModelSearchResult =
                (SearchResult<CustomerModel>) getFlexibleSearchService().search(CUSTOMER_BY_ID_QUERY, parameter);
        return (CustomerModel) customerModelSearchResult.getResult();
    }

}
