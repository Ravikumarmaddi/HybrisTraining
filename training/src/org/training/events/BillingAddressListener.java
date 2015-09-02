/**
 *
 */
package org.training.events;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

import org.apache.log4j.Logger;


/**
 * @author sivanmundru
 *
 */
public class BillingAddressListener extends AbstractEventListener<BillingAddressEvent>
{
	private static final Logger LOG = Logger.getLogger(BillingAddressListener.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.event.impl.AbstractEventListener#onEvent(de.hybris.platform.servicelayer.event
	 * .events.AbstractEvent)
	 */
	@Override
	protected void onEvent(final BillingAddressEvent event)
	{
		LOG.info("Billing address added!!" + event.getMessage());

	}

}
