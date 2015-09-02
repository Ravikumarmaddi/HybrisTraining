/**
 *
 */
package de.hybris.platform.cuppytrail.services.impl;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.cuppytrail.services.StadiumService;
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
public class DefaultStadiumServiceIntegrationTest extends ServicelayerTransactionalTest
{
	@Resource
	StadiumService stadiumService;

	@Resource
	ModelService modelService;

	StadiumModel stadiumModel;

	private static final String STADIUM_CODE = "Wembley";
	private static final Integer STADIUM_CAPACITY = Integer.valueOf(12345);


	@Before
	public void setup()
	{
		stadiumModel = new StadiumModel();
		stadiumModel.setCode(STADIUM_CODE);
		stadiumModel.setCapacity(STADIUM_CAPACITY);

	}

	@Test(expected = UnknownIdentifierException.class)
	public void testGetStadiumByCode()

	{
		stadiumService.getStadiumByCode(STADIUM_CODE);
	}

	@Test
	public void stadiumServiceTest()
	{
		List<StadiumModel> allStadiums = stadiumService.getStadiums();
		assertTrue("Unexpected stadium found", allStadiums.isEmpty());
		final int size = allStadiums.size();

		modelService.save(stadiumModel);

		allStadiums = stadiumService.getStadiums();
		assertEquals("Stadium not added", size + 1, allStadiums.size());

		assertEquals("Different Stadium found ", STADIUM_CODE, allStadiums.get(allStadiums.size() - 1).getCode());

	}

}
