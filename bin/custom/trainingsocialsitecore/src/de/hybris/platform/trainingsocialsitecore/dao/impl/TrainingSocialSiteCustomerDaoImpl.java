package de.hybris.platform.trainingsocialsitecore.dao.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.trainingsocialsitecore.dao.ITrainingSocialSiteCustomDao;

import java.util.*;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class TrainingSocialSiteCustomerDaoImpl extends AbstractItemDao implements ITrainingSocialSiteCustomDao {
    private final String CUSTOMER_QUERY = "SELECT {" + CustomerModel.PK + "}" + "FROM {" +
            CustomerModel._TYPECODE + " AS customers}";

    private final String CUSTOMER_BY_ID_QUERY = "SELECT {" + CustomerModel.PK + "}" + "FROM {"
            + CustomerModel._TYPECODE + "} WHERE {" + CustomerModel.UID + "=?customerId}";

    @Override
    public List<CustomerModel> getCustomers() {
        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {c:").append(CustomerModel.PK).append("}");
        builder.append("FROM {").append(CustomerModel._TYPECODE).append(" AS c}");

        final FlexibleSearchQuery query = new FlexibleSearchQuery(CUSTOMER_QUERY);

        return flexibleSearchService.<CustomerModel>search(query).getResult();
//        var result = flexibleSearchService.<CustomerModel>search(query).getResult();
//        final SearchResult<CustomerModel> customersModelSearchResult = getFlexibleSearchService().search(CUSTOMER_QUERY);
//        return customersModelSearchResult.getResult() == null ? Collections.emptyList() : customersModelSearchResult.getResult();
    }

    @Override
    public CustomerModel getCustomerById(String customerId) {
        validateParameterNotNull(customerId, "Customer ID can't be empty!");

        // Create new Mapping object where we store object (customer);
        final Map<String, Object> parameter = new HashMap<>();
        parameter.put("customerId", customerId);

        final SearchResult<CustomerModel> customerModelSearchResult = getFlexibleSearchService().search(CUSTOMER_BY_ID_QUERY, parameter);
        return customerModelSearchResult.getResult().get(0);
    }

}
