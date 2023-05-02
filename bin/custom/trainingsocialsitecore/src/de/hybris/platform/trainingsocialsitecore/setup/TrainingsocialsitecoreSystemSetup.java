/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.trainingsocialsitecore.setup;

import static de.hybris.platform.trainingsocialsitecore.constants.TrainingsocialsitecoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.platform.trainingsocialsitecore.constants.TrainingsocialsitecoreConstants;
import de.hybris.platform.trainingsocialsitecore.service.TrainingsocialsitecoreService;


@SystemSetup(extension = TrainingsocialsitecoreConstants.EXTENSIONNAME)
public class TrainingsocialsitecoreSystemSetup
{
	private final TrainingsocialsitecoreService trainingsocialsitecoreService;

	public TrainingsocialsitecoreSystemSetup(final TrainingsocialsitecoreService trainingsocialsitecoreService)
	{
		this.trainingsocialsitecoreService = trainingsocialsitecoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		trainingsocialsitecoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return TrainingsocialsitecoreSystemSetup.class.getResourceAsStream("/trainingsocialsitecore/sap-hybris-platform.png");
	}
}
