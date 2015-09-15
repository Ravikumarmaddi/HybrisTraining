/**
 *
 */
package de.hybris.platform.cuppytrail.events;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 * @author sivanmundru
 *
 */
public class CapacityEvent extends AbstractEvent
{

	private final String code;
	private final Integer capacity;

	/**
	 * @param code
	 * @param capacity
	 */
	public CapacityEvent(final String code, final Integer capacity)
	{
		super();
		this.code = code;
		this.capacity = capacity;
	}

	/**
	 * @return the code
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * @return the capacity
	 */
	public Integer getCapacity()
	{
		return capacity;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "CapacityEvent [code=" + code + ", capacity=" + capacity + "]";
	}


}
