/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.trainingsocialsitefacade.setup;

import static de.hybris.platform.trainingsocialsitefacade.constants.TrainingsocialsitefacadeConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.platform.trainingsocialsitefacade.constants.TrainingsocialsitefacadeConstants;
import de.hybris.platform.trainingsocialsitefacade.service.TrainingsocialsitefacadeService;


@SystemSetup(extension = TrainingsocialsitefacadeConstants.EXTENSIONNAME)
public class TrainingsocialsitefacadeSystemSetup
{
	private final TrainingsocialsitefacadeService trainingsocialsitefacadeService;

	public TrainingsocialsitefacadeSystemSetup(final TrainingsocialsitefacadeService trainingsocialsitefacadeService)
	{
		this.trainingsocialsitefacadeService = trainingsocialsitefacadeService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		trainingsocialsitefacadeService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return TrainingsocialsitefacadeSystemSetup.class.getResourceAsStream("/trainingsocialsitefacade/sap-hybris-platform.png");
	}
}
