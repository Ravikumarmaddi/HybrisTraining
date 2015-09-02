package de.hybris.platform.cuppytrail.daos.impl;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import de.hybris.platform.cuppytrail.daos.StadiumDAO;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;


/**
 * @author sivanmundru
 *
 */
public class DefaultStadiumDAOIntegrationTest extends ServicelayerTransactionalTest
{

	@Resource
	private StadiumDAO stadiumDAO;

	@Resource
	ModelService modelService;

	private static final String STADIUM_CODE = "wembley";
	private static final Integer STADIUM_CAPCITY = Integer.valueOf(12345);

	@Test
	public void stadiumDAOTest()
	{
		List<StadiumModel> stadiumsByCode = stadiumDAO.findStadiumsByCode(STADIUM_CODE);
		assertTrue("No Stadium should be returned", stadiumsByCode.isEmpty());

		List<StadiumModel> allStadiums = stadiumDAO.findStadiums();
		final int size = allStadiums.size();

		final StadiumModel stadiumModel = new StadiumModel();
		stadiumModel.setCode(STADIUM_CODE);
		stadiumModel.setCapacity(STADIUM_CAPCITY);
		modelService.save(stadiumModel);

		allStadiums = stadiumDAO.findStadiums();
		assertEquals(size + 1, allStadiums.size());
		assertEquals("Unexpected Stadium Found", stadiumModel, allStadiums.get(allStadiums.size() - 1));

		stadiumsByCode = stadiumDAO.findStadiumsByCode(STADIUM_CODE);
		assertEquals("Did not find the stadium we just saved", 1, stadiumsByCode.size());
		assertEquals("Retrived Stadium's name attribute incorrect", STADIUM_CODE, stadiumsByCode.get(0).getCode());
		assertEquals(STADIUM_CAPCITY, stadiumsByCode.get(0).getCapacity());

	}

	@Test
	public void testFindStadiums_EmptyStringParam()
	{
		final List<StadiumModel> stadiumModels = stadiumDAO.findStadiumsByCode("");
		assertTrue("No stadium should be returned", stadiumModels.isEmpty());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindStadiums_NullParam()
	{
		stadiumDAO.findStadiumsByCode(null);
	}
}
