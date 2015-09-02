/**
 *
 */
package de.hybris.platform.cuppytrail.services.impl;

import de.hybris.platform.cuppytrail.daos.StadiumDAO;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.cuppytrail.services.StadiumService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/**
 * @author sivanmundru
 *
 */
@Component(value = "stadiumService")
public class DefaultStadiumService implements StadiumService
{

	@Resource
	StadiumDAO stadiumDAO;

	@Override
	public List<StadiumModel> getStadiums()
	{
		return stadiumDAO.findStadiums();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.cuppytrail.services.StadiumService#getStadiumByCode(java.lang.String)
	 */
	@Override
	public StadiumModel getStadiumByCode(final String code)
	{

		final List<StadiumModel> result = (stadiumDAO.findStadiumsByCode(code));
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Stadium with Code : " + code + " is not found");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Stadium code : " + code + " is not unique " + result.size() + " Stadiums found");

		}

		return result.get(0);
	}

	public void setStadiumDAO(final StadiumDAO stadiumDAO)
	{
		this.stadiumDAO = stadiumDAO;
	}
}
