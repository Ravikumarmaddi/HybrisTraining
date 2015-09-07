/**
 *
 */
package de.hybris.platform.cuppytrail.facades.impl;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import de.hybris.platform.cuppytrail.data.StadiumData;
import de.hybris.platform.cuppytrail.facade.StadiumFacade;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;



/**
 * @author sivanmundru
 *
 */
public class DefaultStadiumFacadeIntegrationTest extends ServicelayerTransactionalTest
{
	private StadiumModel stadiumModel;
	private static final String STADIUM_CODE = "Wembley";
	private static final Integer STADIUM_CAPACITY = Integer.valueOf(12345);
	@Resource
	private StadiumFacade stadiumFacade;
	@Resource
	private ModelService modelService;

	@Before
	public void setup()
	{
		stadiumModel = new StadiumModel();
		stadiumModel.setCode(STADIUM_CODE);
		stadiumModel.setCapacity(STADIUM_CAPACITY);
	}

	@Test(expected = UnknownIdentifierException.class)
	public void testInvalidParameters()
	{
		stadiumFacade.getStadium(STADIUM_CODE);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullPerameter()
	{
		stadiumFacade.getStadium(null);
	}

	@Test
	public void testStadiumFacade()
	{
		List<StadiumData> stadiums = stadiumFacade.getStadiums();
		final int size = stadiums.size();

		modelService.save(stadiumModel);

		stadiums = stadiumFacade.getStadiums();
		assertEquals(size + 1, stadiums.size());

		final StadiumData persistedStadiumData = stadiumFacade.getStadium(STADIUM_CODE);
		assertNotNull(persistedStadiumData);
		assertEquals(STADIUM_CODE, persistedStadiumData.getName());
		assertEquals(STADIUM_CAPACITY.toString(), persistedStadiumData.getCapacity());
	}

}
