/**
 *
 */
package org.training.dynamicattributes;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import org.training.model.MyCustomerModel;


/**
 * @author sivanmundru
 *
 */
public class NameDisplayHandler implements DynamicAttributeHandler<String, MyCustomerModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#get(de.hybris.platform.servicelayer.model
	 * .AbstractItemModel)
	 */
	@Override
	public String get(final MyCustomerModel customer)
	{

		if (customer == null)
		{
			throw new IllegalArgumentException("Customer Model is required");
		}

		return customer.getFirstname() + " " + customer.getLastname();


	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#set(de.hybris.platform.servicelayer.model
	 * .AbstractItemModel, java.lang.Object)
	 */
	@Override
	public void set(final MyCustomerModel arg0, final String arg1)
	{

		throw new UnsupportedOperationException("Cannot set value ofr this attribute is its readonly");


	}

}
