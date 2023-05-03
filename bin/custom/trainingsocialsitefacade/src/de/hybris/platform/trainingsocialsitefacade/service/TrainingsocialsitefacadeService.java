/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.trainingsocialsitefacade.service;

public interface TrainingsocialsitefacadeService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
