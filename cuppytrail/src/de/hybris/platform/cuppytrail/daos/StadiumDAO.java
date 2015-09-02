/**
 *
 */
package de.hybris.platform.cuppytrail.daos;

import de.hybris.platform.cuppytrail.model.StadiumModel;

import java.util.List;


/**
 * @author sivanmundru
 *
 */
public interface StadiumDAO
{

	List<StadiumModel> findStadiums();

	List<StadiumModel> findStadiumsByCode(String code);

}
