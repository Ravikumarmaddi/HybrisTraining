/**
 *
 */
package de.hybris.platform.cuppytrail.jobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cuppy.model.PlayerModel;
import de.hybris.platform.cuppy.services.MailService;
import de.hybris.platform.cuppy.services.PlayerService;
import de.hybris.platform.cuppy.services.RankingData;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.List;

import org.apache.log4j.Logger;


/**
 * @author sivanmundru
 *
 */
public class SendRankingJob extends AbstractJobPerformable<CronJobModel>
{

	private static final Logger LOG = Logger.getLogger(SendRankingJob.class);

	private MailService mailService;
	private PlayerService playerService;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable#perform(de.hybris.platform.cronjob.model.CronJobModel
	 * )
	 */
	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{

		LOG.info(".....Sending Ranking eMails...");
		final List<RankingData> rankings = playerService.getRankings();
		if (rankings.isEmpty())
		{
			LOG.info("No ranking Updates to be sent, Skipping send of emails");
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		for (final PlayerModel player : playerService.getAllPlayers())
		{
			final List<RankingData> playerRankings = playerService.filterRankingsForPlayer(rankings, player);
			if (!playerRankings.isEmpty() && player.isSendNewsletter())
			{
				mailService.sendRankingMail(player, playerRankings);
			}
		}
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}

	/**
	 * @param mailService
	 *           the mailService to set
	 */
	public void setMailService(final MailService mailService)
	{
		this.mailService = mailService;
	}

	/**
	 * @param playerService
	 *           the playerService to set
	 */
	public void setPlayerService(final PlayerService playerService)
	{
		this.playerService = playerService;
	}

}
