/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.trainingsocialsitecore.controller;

import static de.hybris.platform.trainingsocialsitecore.constants.TrainingsocialsitecoreConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.hybris.platform.trainingsocialsitecore.service.TrainingsocialsitecoreService;


@Controller
public class TrainingsocialsitecoreHelloController
{
	@Autowired
	private TrainingsocialsitecoreService trainingsocialsitecoreService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", trainingsocialsitecoreService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
