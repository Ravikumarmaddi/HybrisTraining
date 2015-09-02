package org.training.events;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 *
 */

/**
 * @author sivanmundru
 *
 */
public class BillingAddressEvent extends AbstractEvent
{

	private final String message;

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * @param message
	 */
	public BillingAddressEvent(final String message)
	{
		super();
		this.message = message;
	}

}
