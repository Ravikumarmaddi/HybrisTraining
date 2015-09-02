/**
 *
 */
package org.training.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Date;

import org.apache.log4j.Logger;
import org.training.model.MyCustomerModel;


/**
 * @author sivanmundru
 *
 */
public class CustomerInterceptor implements LoadInterceptor<MyCustomerModel>, PrepareInterceptor<MyCustomerModel>
{


	private static final Logger LOG = Logger.getLogger(CustomerInterceptor.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final MyCustomerModel customer, final InterceptorContext ctx) throws InterceptorException
	{

		LOG.info("Prepare Interceptor");

		final Date filter = new Date(80, 00, 01);
		if (customer.getDob().compareTo(filter) == -1)
		{
			LOG.info("Prevoius DOB: " + filter);
			customer.setDob(new Date(83, 03, 18));
			LOG.info("Prevoius DOB: " + new Date(1983, 04, 18));

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.servicelayer.interceptor.LoadInterceptor#onLoad(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onLoad(final MyCustomerModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		LOG.info("Load Interceptor");

	}

}
