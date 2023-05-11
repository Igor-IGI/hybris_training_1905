package de.hybris.platform.trainingsocialsitecore.dao.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.trainingsocialsitecore.dao.ITrainingFaqDao;
import de.hybris.platform.trainingsocialsitecore.model.FaqModel;
import de.hybris.platform.trainingsocialsitecore.service.impl.DefaultTrainingsocialsitecoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TrainingFaqDaoImpl extends AbstractItemDao implements ITrainingFaqDao {

    private static final Logger LOG = LoggerFactory.getLogger(TrainingFaqDaoImpl.class);
    private final String FAQS_QUERY = "SELECT {" + FaqModel.PK + "} " + "FROM {" + FaqModel._TYPECODE + "}";

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
    public FaqModel putFaqs() {
        return null;
    }
}
