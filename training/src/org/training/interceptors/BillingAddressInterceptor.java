/**
 *
 */
package org.training.interceptors;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.training.events.BillingAddressEvent;
import org.training.model.MyBillingAddressModel;


/**
 * @author sivanmundru
 *
 */
public class BillingAddressInterceptor implements PrepareInterceptor<MyBillingAddressModel>
{
	@Autowired
	EventService eventService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final MyBillingAddressModel billing, final InterceptorContext ctx) throws InterceptorException
	{
		final BillingAddressEvent event = new BillingAddressEvent(billing.getName());
		eventService.publishEvent(event);

	}

}
