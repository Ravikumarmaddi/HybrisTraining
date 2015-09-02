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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.TrainingConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MyAddress}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyAddress extends GenericItem
{
	/** Qualifier of the <code>MyAddress.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>MyAddress.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>MyAddress.line1</code> attribute **/
	public static final String LINE1 = "line1";
	/** Qualifier of the <code>MyAddress.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>MyAddress.county</code> attribute **/
	public static final String COUNTY = "county";
	/** Qualifier of the <code>MyAddress.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>MyAddress.postcode</code> attribute **/
	public static final String POSTCODE = "postcode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(LINE1, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(COUNTY, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(POSTCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.county</code> attribute.
	 * @return the county
	 */
	public String getCounty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.county</code> attribute.
	 * @return the county
	 */
	public String getCounty()
	{
		return getCounty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.county</code> attribute. 
	 * @param value the county
	 */
	public void setCounty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.county</code> attribute. 
	 * @param value the county
	 */
	public void setCounty(final String value)
	{
		setCounty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.line1</code> attribute.
	 * @return the line1
	 */
	public String getLine1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.line1</code> attribute.
	 * @return the line1
	 */
	public String getLine1()
	{
		return getLine1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.line1</code> attribute. 
	 * @param value the line1
	 */
	public void setLine1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.line1</code> attribute. 
	 * @param value the line1
	 */
	public void setLine1(final String value)
	{
		setLine1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.postcode</code> attribute.
	 * @return the postcode
	 */
	public String getPostcode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyAddress.postcode</code> attribute.
	 * @return the postcode
	 */
	public String getPostcode()
	{
		return getPostcode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.postcode</code> attribute. 
	 * @param value the postcode
	 */
	public void setPostcode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyAddress.postcode</code> attribute. 
	 * @param value the postcode
	 */
	public void setPostcode(final String value)
	{
		setPostcode( getSession().getSessionContext(), value );
	}
	
}
