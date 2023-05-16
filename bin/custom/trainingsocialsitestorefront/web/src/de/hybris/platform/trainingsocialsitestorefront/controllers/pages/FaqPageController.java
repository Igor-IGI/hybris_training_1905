package de.hybris.platform.trainingsocialsitestorefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.AbstractController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.trainingsocialsitefacade.data.FaqData;
import de.hybris.platform.trainingsocialsitefacade.facade.impl.TrainingFaqFacadeImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/faq")
public class FaqPageController extends AbstractPageController {

    private static final String FAQ_CMS_PAGE = "faqCMSPage";
    @Resource(name = "trainingFaqFacade")
    private TrainingFaqFacadeImpl faqFacade;

    @RequestMapping(value = "/faqs", method = RequestMethod.GET)
    public String getFaqs(final Model model) throws CMSItemNotFoundException {

        List<FaqData> faqs = faqFacade.getFaq();
        model.addAttribute("faq", faqs);

        // This will retrieve the created page by label which one we declared as "faqCMSPage"
        final ContentPageModel faqCMSPage = getContentPageForLabelOrId(FAQ_CMS_PAGE);
        storeCmsPageInModel(model, faqCMSPage);
        setUpMetaDataForContentPage(model, faqCMSPage);
        return getViewForPage(model);
    }
}