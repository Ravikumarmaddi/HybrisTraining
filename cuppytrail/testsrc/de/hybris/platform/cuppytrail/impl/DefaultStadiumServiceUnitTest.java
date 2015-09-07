/**
 *
 */
package de.hybris.platform.cuppytrail.impl;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.platform.cuppytrail.daos.StadiumDAO;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.cuppytrail.services.impl.DefaultStadiumService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


/**
 * @author sivanmundru
 *
 */
public class DefaultStadiumServiceUnitTest
{

	private DefaultStadiumService stadiumService;
	private StadiumDAO stadiumDAO;

	private StadiumModel stadiumModel;
	private static final String STADIUM_CODE = "Wembley";
	private static final Integer STADIUM_CAPACITY = Integer.valueOf(12345);

	@Before
	public void setup()
	{
		stadiumModel = new StadiumModel();
		stadiumModel.setCode(STADIUM_CODE);
		stadiumModel.setCapacity(STADIUM_CAPACITY);

		stadiumService = new DefaultStadiumService();
		stadiumDAO = mock(StadiumDAO.class);
		stadiumService.setStadiumDAO(stadiumDAO);

	}

	@Test
	public void testGetStadiums()
	{

		final List<StadiumModel> stadiumModels = Arrays.asList(stadiumModel);
		when(stadiumDAO.findStadiums()).thenReturn(stadiumModels);
		final List<StadiumModel> fetchedStadiums = stadiumService.getStadiums();
		assertEquals(1, fetchedStadiums.size());
		assertEquals("Unexpected Stadium Found", stadiumModel, fetchedStadiums.get(0));
	}

	@Test
	public void testGetStadiumForCode()
	{

		when(stadiumDAO.findStadiumsByCode(STADIUM_CODE)).thenReturn(Collections.singletonList(stadiumModel));
		assertEquals(stadiumService.getStadiumByCode(STADIUM_CODE), stadiumModel);

	}

}
