/**
 *
 */
package de.hybris.platform.cuppytrail.events;

import de.hybris.platform.cuppy.model.NewsModel;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Locale;

import javax.annotation.Resource;

import org.apache.log4j.Logger;


/**
 * @author sivanmundru
 *
 */
public class CapacityEventListener extends AbstractEventListener<CapacityEvent>
{
	@Resource
	private ModelService modelService;

	private static final Logger LOG = Logger.getLogger(CapacityEventListener.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.servicelayer.event.impl.AbstractEventListener#onEvent(de.hybris.platform.servicelayer.event
	 * .events.AbstractEvent)
	 */
	@Override
	protected void onEvent(final CapacityEvent event)
	{
		LOG.info("Event acknowledged");
		final NewsModel news = new NewsModel();
		news.setContent("New BIG Stadium with Capacity: " + event.getCapacity().toString(), Locale.ENGLISH);
		modelService.save(news);

	}

}
