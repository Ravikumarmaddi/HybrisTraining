/**
 *
 */
package de.hybris.platform.cuppytrail.daos.impl;

import de.hybris.platform.cuppytrail.daos.StadiumDAO;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/**
 * @author sivanmundru
 *
 */
@Component(value = "stadiumDAO")
public class DefaultStadiumDAO implements StadiumDAO
{

	@Resource
	private FlexibleSearchService flexibleSearchService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.cuppytrail.daos.StadiumDAO#findStadiums()
	 */
	@Override
	public List<StadiumModel> findStadiums()
	{
		final String queryString = "SELECT {p:" + StadiumModel.PK + "} "//
				+ "FROM {" + StadiumModel._TYPECODE + " AS p} ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		return flexibleSearchService.<StadiumModel> search(query).getResult();

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.cuppytrail.daos.StadiumDAO#findStadiumsByCode(java.lang.String)
	 */
	@Override
	public List<StadiumModel> findStadiumsByCode(final String code)
	{
		final String queryString = "SELECT {p:" + StadiumModel.PK + "} FROM {" + StadiumModel._TYPECODE + " AS p} WHERE {"
				+ StadiumModel.CODE + "} =?code ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		return flexibleSearchService.<StadiumModel> search(query).getResult();
	}

}
