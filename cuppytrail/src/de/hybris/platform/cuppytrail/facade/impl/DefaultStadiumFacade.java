/**
 *
 */
package de.hybris.platform.cuppytrail.facade.impl;

import de.hybris.platform.cuppy.model.MatchModel;
import de.hybris.platform.cuppytrail.data.MatchSummaryData;
import de.hybris.platform.cuppytrail.data.StadiumData;
import de.hybris.platform.cuppytrail.facade.StadiumFacade;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.cuppytrail.services.StadiumService;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/**
 * @author sivanmundru
 *
 */
@Component(value = "stadiumFacade")
public class DefaultStadiumFacade implements StadiumFacade
{


	@Resource
	private StadiumService stadiumService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.cuppytrail.facade.StadiumFacade#getStadiums()
	 */
	@Override
	public List<StadiumData> getStadiums()
	{
		final List<StadiumModel> stadiumModels = stadiumService.getStadiums();
		final List<StadiumData> stadiums = new ArrayList<StadiumData>();

		for (final StadiumModel stadiumModel : stadiumModels)
		{
			final StadiumData stadium = new StadiumData();
			stadium.setName(stadiumModel.getCode());
			stadium.setCapacity(stadiumModel.getCapacity().toString());
			stadiums.add(stadium);
		}
		return stadiums;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.cuppytrail.facade.StadiumFacade#getStadium(java.lang.String)
	 */
	@Override
	public StadiumData getStadium(final String code)
	{

		StadiumModel stadiumModel = null;

		if (code != null)
		{
			stadiumModel = stadiumService.getStadiumByCode(code);
		}
		else
		{
			throw new IllegalArgumentException("Stadium with Name " + code + " does not exist");
		}


		final StadiumData stadium = new StadiumData();
		stadium.setName(stadiumModel.getCode());
		stadium.setCapacity(stadiumModel.getCapacity().toString());

		final List<MatchSummaryData> matchDataSummary = new ArrayList<MatchSummaryData>();
		final List<MatchModel> matches = (List<MatchModel>) stadiumModel.getMatches();
		if (matches != null)
		{
			for (final MatchModel match : matches)
			{
				final MatchSummaryData matchData = new MatchSummaryData();
				final String homeTeam = match.getHomeTeam().getName();
				final String guestTeam = match.getGuestTeam().getName();
				final String homeGoals = match.getHomeGoals().toString();
				final String guestGoals = match.getGuestGoals().toString();
				final Date matchDate = match.getDate();

				matchData.setDate(match.getDate());
				matchData.setGuestGoals(guestGoals);
				matchData.setGuestTeam(guestTeam);
				matchData.setHomeGoals(homeGoals);
				matchData.setHomeTeam(homeTeam);
				final String formattedDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(matchDate);
				final String matchSummaryFormatted = homeTeam + ":( " + homeGoals + " ) " + guestTeam + ":( " + guestGoals + " ) "
						+ formattedDate;
				matchData.setMatchSummaryFormatted(matchSummaryFormatted);
				matchDataSummary.add(matchData);
			}
		}
		stadium.setMatches(matchDataSummary);
		return stadium;

	}

	/**
	 * @param stadiumService
	 *           the stadiumService to set
	 */
	public void setStadiumService(final StadiumService stadiumService)
	{
		this.stadiumService = stadiumService;
	}

}
