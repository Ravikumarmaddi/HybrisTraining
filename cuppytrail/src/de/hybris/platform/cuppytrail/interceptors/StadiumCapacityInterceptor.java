/**
 *
 */
package de.hybris.platform.cuppytrail.interceptors;

import static de.hybris.platform.servicelayer.model.ModelContextUtils.getItemModelContext;

import de.hybris.platform.cuppytrail.events.CapacityEvent;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author sivanmundru
 *
 */
public class StadiumCapacityInterceptor implements ValidateInterceptor<StadiumModel>, PrepareInterceptor<StadiumModel>
{
	private static final Logger LOG = Logger.getLogger(StadiumCapacityInterceptor.class);

	private static final int BIG_STADIUM = 50000;
	private static final int TOO_BIG_STADIUM = 100000;

	@Autowired
	private EventService eventService;


	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final StadiumModel model, final InterceptorContext ctx) throws InterceptorException
	{
		LOG.info("In onPrepare Method");
		final StadiumModel stadiumModel = model;

		if (hasBecomeBig(stadiumModel, ctx))
		{
			LOG.info("Publishing the Event..");
			eventService.publishEvent(new CapacityEvent(model.getCode(), model.getCapacity()));
		}

	}

	public boolean hasBecomeBig(final StadiumModel model, final InterceptorContext ctx)
	{
		if (model.getCapacity().intValue() >= BIG_STADIUM && model.getCapacity().intValue() <= TOO_BIG_STADIUM)
		{
			if (ctx.isNew(model))
			{
				LOG.info("Stadium Became Big");
				return true;
			}
			else
			{
				final Integer oldCapacity = getItemModelContext(model).getOriginalValue(StadiumModel.CAPACITY);
				if (oldCapacity == null || oldCapacity.intValue() <= BIG_STADIUM)
				{
					return true;
				}

			}

		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final StadiumModel stadium, final InterceptorContext ctx) throws InterceptorException
	{
		if (stadium != null && stadium.getCapacity().intValue() >= 100000)
		{
			throw new InterceptorException("Capacity Too big!!!");
		}

	}
}
