/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-Aug-2015 16:36:17                        ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.training.constants.TrainingConstants;
import org.training.jalo.MyBillingAddress;
import org.training.jalo.MyShippingAddress;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MyCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyCustomer extends GenericItem
{
	/** Qualifier of the <code>MyCustomer.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>MyCustomer.firstname</code> attribute **/
	public static final String FIRSTNAME = "firstname";
	/** Qualifier of the <code>MyCustomer.lastname</code> attribute **/
	public static final String LASTNAME = "lastname";
	/** Qualifier of the <code>MyCustomer.dob</code> attribute **/
	public static final String DOB = "dob";
	/** Qualifier of the <code>MyCustomer.billingaddressesset</code> attribute **/
	public static final String BILLINGADDRESSESSET = "billingaddressesset";
	/** Qualifier of the <code>MyCustomer.shippingaddressesset</code> attribute **/
	public static final String SHIPPINGADDRESSESSET = "shippingaddressesset";
	/** Qualifier of the <code>MyCustomer.gender</code> attribute **/
	public static final String GENDER = "gender";
	/** Qualifier of the <code>MyCustomer.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>MyCustomer.billingaddress</code> attribute **/
	public static final String BILLINGADDRESS = "billingaddress";
	/** Relation ordering override parameter constants for CustomerToBillingAddress from ((training))*/
	protected static String CUSTOMERTOBILLINGADDRESS_SRC_ORDERED = "relation.CustomerToBillingAddress.source.ordered";
	protected static String CUSTOMERTOBILLINGADDRESS_TGT_ORDERED = "relation.CustomerToBillingAddress.target.ordered";
	/** Relation disable markmodifed parameter constants for CustomerToBillingAddress from ((training))*/
	protected static String CUSTOMERTOBILLINGADDRESS_MARKMODIFIED = "relation.CustomerToBillingAddress.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(DOB, AttributeMode.INITIAL);
		tmp.put(BILLINGADDRESSESSET, AttributeMode.INITIAL);
		tmp.put(SHIPPINGADDRESSESSET, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.billingaddress</code> attribute.
	 * @return the billingaddress
	 */
	public Collection<MyBillingAddress> getBillingaddress(final SessionContext ctx)
	{
		final List<MyBillingAddress> items = getLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.billingaddress</code> attribute.
	 * @return the billingaddress
	 */
	public Collection<MyBillingAddress> getBillingaddress()
	{
		return getBillingaddress( getSession().getSessionContext() );
	}
	
	public long getBillingaddressCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null
		);
	}
	
	public long getBillingaddressCount()
	{
		return getBillingaddressCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.billingaddress</code> attribute. 
	 * @param value the billingaddress
	 */
	public void setBillingaddress(final SessionContext ctx, final Collection<MyBillingAddress> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERTOBILLINGADDRESS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.billingaddress</code> attribute. 
	 * @param value the billingaddress
	 */
	public void setBillingaddress(final Collection<MyBillingAddress> value)
	{
		setBillingaddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to billingaddress. 
	 * @param value the item to add to billingaddress
	 */
	public void addToBillingaddress(final SessionContext ctx, final MyBillingAddress value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERTOBILLINGADDRESS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to billingaddress. 
	 * @param value the item to add to billingaddress
	 */
	public void addToBillingaddress(final MyBillingAddress value)
	{
		addToBillingaddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from billingaddress. 
	 * @param value the item to remove from billingaddress
	 */
	public void removeFromBillingaddress(final SessionContext ctx, final MyBillingAddress value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERTOBILLINGADDRESS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERTOBILLINGADDRESS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from billingaddress. 
	 * @param value the item to remove from billingaddress
	 */
	public void removeFromBillingaddress(final MyBillingAddress value)
	{
		removeFromBillingaddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.billingaddressesset</code> attribute.
	 * @return the billingaddressesset
	 */
	public Set<MyBillingAddress> getBillingaddressesset(final SessionContext ctx)
	{
		Set<MyBillingAddress> coll = (Set<MyBillingAddress>)getProperty( ctx, BILLINGADDRESSESSET);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.billingaddressesset</code> attribute.
	 * @return the billingaddressesset
	 */
	public Set<MyBillingAddress> getBillingaddressesset()
	{
		return getBillingaddressesset( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.billingaddressesset</code> attribute. 
	 * @param value the billingaddressesset
	 */
	public void setBillingaddressesset(final SessionContext ctx, final Set<MyBillingAddress> value)
	{
		setProperty(ctx, BILLINGADDRESSESSET,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.billingaddressesset</code> attribute. 
	 * @param value the billingaddressesset
	 */
	public void setBillingaddressesset(final Set<MyBillingAddress> value)
	{
		setBillingaddressesset( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.dob</code> attribute.
	 * @return the dob
	 */
	public Date getDob(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.dob</code> attribute.
	 * @return the dob
	 */
	public Date getDob()
	{
		return getDob( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.dob</code> attribute. 
	 * @param value the dob
	 */
	public void setDob(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.dob</code> attribute. 
	 * @param value the dob
	 */
	public void setDob(final Date value)
	{
		setDob( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.firstname</code> attribute.
	 * @return the firstname
	 */
	public String getFirstname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.firstname</code> attribute.
	 * @return the firstname
	 */
	public String getFirstname()
	{
		return getFirstname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.firstname</code> attribute. 
	 * @param value the firstname
	 */
	public void setFirstname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.firstname</code> attribute. 
	 * @param value the firstname
	 */
	public void setFirstname(final String value)
	{
		setFirstname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.lastname</code> attribute.
	 * @return the lastname
	 */
	public String getLastname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.lastname</code> attribute.
	 * @return the lastname
	 */
	public String getLastname()
	{
		return getLastname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.lastname</code> attribute. 
	 * @param value the lastname
	 */
	public void setLastname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.lastname</code> attribute. 
	 * @param value the lastname
	 */
	public void setLastname(final String value)
	{
		setLastname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.shippingaddressesset</code> attribute.
	 * @return the shippingaddressesset
	 */
	public Set<MyShippingAddress> getShippingaddressesset(final SessionContext ctx)
	{
		Set<MyShippingAddress> coll = (Set<MyShippingAddress>)getProperty( ctx, SHIPPINGADDRESSESSET);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomer.shippingaddressesset</code> attribute.
	 * @return the shippingaddressesset
	 */
	public Set<MyShippingAddress> getShippingaddressesset()
	{
		return getShippingaddressesset( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.shippingaddressesset</code> attribute. 
	 * @param value the shippingaddressesset
	 */
	public void setShippingaddressesset(final SessionContext ctx, final Set<MyShippingAddress> value)
	{
		setProperty(ctx, SHIPPINGADDRESSESSET,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomer.shippingaddressesset</code> attribute. 
	 * @param value the shippingaddressesset
	 */
	public void setShippingaddressesset(final Set<MyShippingAddress> value)
	{
		setShippingaddressesset( getSession().getSessionContext(), value );
	}
	
}
