package de.hybris.platform.trainingsocialsitecore.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.trainingsocialsitecore.dao.ITrainingFaqDao;
import de.hybris.platform.trainingsocialsitecore.model.FaqModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class TrainingFaqDaoImpl extends AbstractItemDao implements ITrainingFaqDao {

    private static final Logger LOG = LoggerFactory.getLogger(TrainingFaqDaoImpl.class);
    private final String FAQS_QUERY = "SELECT {" + FaqModel.PK + "} " + "FROM {" + FaqModel._TYPECODE + "}";
    private final String FAQ_BY_ID_QUERY = "SELECT {" + FaqModel.PK + "} " +
            "FROM {" + FaqModel._TYPECODE + "} " +
            "WHERE {" + FaqModel.PK + "} = ?customerID";

    @Override
    public List<FaqModel> getFaqs() {
        try
        {
            final SearchResult<FaqModel> searchResult = getFlexibleSearchService().search(FAQS_QUERY);
            return searchResult == null ? Collections.emptyList() : searchResult.getResult();
        } catch (Exception e)
        {
            LOG.error(e.getMessage(), e);
            return Collections.emptyList();
        }
    }

    @Override
    public void putFaq(FaqModel faqModel) {

        try
        {
            if (faqModel != null)
                getModelService().save(faqModel);
            else
                throw new NullPointerException("FaqModel can't be null!");

        } catch (Exception e)
        {
            LOG.error(e.getMessage(), e);
        }
    }
}
