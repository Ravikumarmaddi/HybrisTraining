/**
 *
 */
package de.hybris.platform.cuppytrail.impl;

import static org.mockito.Mockito.mock;

import de.hybris.platform.cuppytrail.daos.StadiumDAO;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.cuppytrail.services.impl.DefaultStadiumService;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.mockito.Mockito;


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

	public void testGetStadiums()
	{

		final List<StadiumModel> stadiumModels = Arrays.asList(stadiumModel);

		Mockito.when(stadiumDAO.findStadiums()).thenReturn(stadiumModels);

	}

}
