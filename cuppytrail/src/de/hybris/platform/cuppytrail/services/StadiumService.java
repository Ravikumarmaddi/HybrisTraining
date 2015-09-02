/**
 *
 */
package de.hybris.platform.cuppytrail.services;

import de.hybris.platform.cuppytrail.model.StadiumModel;

import java.util.List;


/**
 * @author sivanmundru
 *
 */
public interface StadiumService
{
	List<StadiumModel> getStadiums();

	StadiumModel getStadiumByCode(String code);
}
