package de.hybris.platform.trainingsocialsitestorefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.AbstractController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
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

    @Resource(name = "trainingFaqFacade")
    private TrainingFaqFacadeImpl faqFacade;

    @RequestMapping(value = "/faqs", method = RequestMethod.GET)
    public String getFaqs(final Model model) {

        List<FaqData> faqs = faqFacade.getFaq();
        if (faqs != null)
            model.addAttribute("faq", faqs);

        return getViewForPage(model);
    }
}