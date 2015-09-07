/**
 *
 */
package de.hybris.platform.cuppytrail.facades.impl;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.platform.cuppytrail.data.StadiumData;
import de.hybris.platform.cuppytrail.facade.impl.DefaultStadiumFacade;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.cuppytrail.services.StadiumService;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


/**
 * @author sivanmundru
 *
 */
public class DefaultStadiumFacadeUnitTest
{

	private DefaultStadiumFacade stadiumFacade;

	private StadiumService stadiumService;

	private StadiumModel stadiumModel;

	private List<StadiumModel> stadiumModelList;

	private static final String STADIUM_NAME = "Wembley";
	private static final Integer STADIUM_CAPACITY = Integer.valueOf(12345);

	public StadiumModel dummyStadiumModel()
	{
		stadiumModel = new StadiumModel();
		stadiumModel.setCode(STADIUM_NAME);
		stadiumModel.setCapacity(STADIUM_CAPACITY);
		return stadiumModel;
	}

	public List<StadiumModel> dummyStadiumModelList()
	{
		stadiumModelList = new ArrayList<StadiumModel>();
		stadiumModelList.add(dummyStadiumModel());
		return stadiumModelList;
	}

	@Before
	public void setup()
	{
		stadiumService = mock(StadiumService.class);
		stadiumFacade = new DefaultStadiumFacade();
		stadiumFacade.setStadiumService(stadiumService);
	}

	@Test
	public void testGetStadiums()
	{
		final StadiumModel wembley = dummyStadiumModel();
		final List<StadiumModel> stadiumModelList = dummyStadiumModelList();

		when(stadiumService.getStadiums()).thenReturn(stadiumModelList);
		final List<StadiumData> stadiumDataList = stadiumFacade.getStadiums();

		assertNotNull(stadiumDataList);
		assertEquals(1, stadiumDataList.size());
		assertEquals(wembley.getCode(), stadiumDataList.get(0).getName());
		assertEquals(wembley.getCapacity().toString(), stadiumDataList.get(0).getCapacity());

	}

	@Test
	public void testGetStadiumForCode()
	{

		final StadiumModel wembley = dummyStadiumModel();

		when(stadiumService.getStadiumByCode(STADIUM_NAME)).thenReturn(wembley);

		final StadiumData stadium = stadiumFacade.getStadium(STADIUM_NAME);

		assertNotNull(stadium);
		assertEquals(wembley.getCode(), stadium.getName());
		assertEquals(wembley.getCapacity().toString(), stadium.getCapacity());

	}



}
