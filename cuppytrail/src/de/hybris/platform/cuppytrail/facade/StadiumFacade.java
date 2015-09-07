/**
 *
 */
package de.hybris.platform.cuppytrail.facade;

import de.hybris.platform.cuppytrail.data.StadiumData;

import java.util.List;


/**
 * @author sivanmundru
 *
 */
public interface StadiumFacade
{
	List<StadiumData> getStadiums();

	StadiumData getStadium(String code);

}
