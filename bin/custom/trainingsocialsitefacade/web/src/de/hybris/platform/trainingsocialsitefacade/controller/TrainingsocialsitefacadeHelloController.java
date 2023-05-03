/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.trainingsocialsitefacade.controller;

import static de.hybris.platform.trainingsocialsitefacade.constants.TrainingsocialsitefacadeConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.hybris.platform.trainingsocialsitefacade.service.TrainingsocialsitefacadeService;


@Controller
public class TrainingsocialsitefacadeHelloController
{
	@Autowired
	private TrainingsocialsitefacadeService trainingsocialsitefacadeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", trainingsocialsitefacadeService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
