/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-Aug-2015 16:36:17                        ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.constants.TrainingConstants;
import org.training.jalo.MyAddress;
import org.training.jalo.MyCustomer;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MyBillingAddress}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyBillingAddress extends MyAddress
{
	/** Qualifier of the <code>MyBillingAddress.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Relation ordering override parameter constants for CustomerToBillingAddress from ((training))*/
	protected static String CUSTOMERTOBILLINGADDRESS_SRC_ORDERED = "relation.CustomerToBillingAddress.source.ordered";
	protected static String CUSTOMERTOBILLINGADDRESS_TGT_ORDERED = "relation.CustomerToBillingAddress.target.ordered";
	/** Relation disable markmodifed parameter constants for CustomerToBillingAddress from ((training))*/
	protected static String CUSTOMERTOBILLINGADDRESS_MARKMODIFIED = "relation.CustomerToBillingAddress.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(MyAddress.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyBillingAddress.customer</code> attribute.
	 * @return the customer
	 */
	public Collection<MyCustomer> getCustomer(final SessionContext ctx)
	{
		final List<MyCustomer> items = getLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyBillingAddress.customer</code> attribute.
	 * @return the customer
	 */
	public Collection<MyCustomer> getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	public long getCustomerCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null
		);
	}
	
	public long getCustomerCount()
	{
		return getCustomerCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyBillingAddress.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Collection<MyCustomer> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERTOBILLINGADDRESS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyBillingAddress.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Collection<MyCustomer> value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customer. 
	 * @param value the item to add to customer
	 */
	public void addToCustomer(final SessionContext ctx, final MyCustomer value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERTOBILLINGADDRESS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customer. 
	 * @param value the item to add to customer
	 */
	public void addToCustomer(final MyCustomer value)
	{
		addToCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customer. 
	 * @param value the item to remove from customer
	 */
	public void removeFromCustomer(final SessionContext ctx, final MyCustomer value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERTOBILLINGADDRESS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customer. 
	 * @param value the item to remove from customer
	 */
	public void removeFromCustomer(final MyCustomer value)
	{
		removeFromCustomer( getSession().getSessionContext(), value );
	}
	
}
