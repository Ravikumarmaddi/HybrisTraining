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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.TrainingConstants;
import org.training.jalo.MyCategory;
import org.training.jalo.ProductImage;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MyProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyProduct extends GenericItem
{
	/** Qualifier of the <code>MyProduct.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>MyProduct.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>MyProduct.price</code> attribute **/
	public static final String PRICE = "price";
	/** Qualifier of the <code>MyProduct.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>MyProduct.imagescoll</code> attribute **/
	public static final String IMAGESCOLL = "imagescoll";
	/** Qualifier of the <code>MyProduct.imageslist</code> attribute **/
	public static final String IMAGESLIST = "imageslist";
	/** Qualifier of the <code>MyProduct.imagesset</code> attribute **/
	public static final String IMAGESSET = "imagesset";
	/** Qualifier of the <code>MyProduct.image</code> attribute **/
	public static final String IMAGE = "image";
	/**
	* {@link OneToManyHandler} for handling 1:n IMAGE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductImage> IMAGEHANDLER = new OneToManyHandler<ProductImage>(
	TrainingConstants.TC.PRODUCTIMAGE,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PRICE, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(IMAGESCOLL, AttributeMode.INITIAL);
		tmp.put(IMAGESLIST, AttributeMode.INITIAL);
		tmp.put(IMAGESSET, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.category</code> attribute.
	 * @return the category
	 */
	public MyCategory getCategory(final SessionContext ctx)
	{
		return (MyCategory)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.category</code> attribute.
	 * @return the category
	 */
	public MyCategory getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final MyCategory value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final MyCategory value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.image</code> attribute.
	 * @return the image
	 */
	public Collection<ProductImage> getImage(final SessionContext ctx)
	{
		return IMAGEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.image</code> attribute.
	 * @return the image
	 */
	public Collection<ProductImage> getImage()
	{
		return getImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.image</code> attribute. 
	 * @param value the image
	 */
	public void setImage(final SessionContext ctx, final Collection<ProductImage> value)
	{
		IMAGEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.image</code> attribute. 
	 * @param value the image
	 */
	public void setImage(final Collection<ProductImage> value)
	{
		setImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to image. 
	 * @param value the item to add to image
	 */
	public void addToImage(final SessionContext ctx, final ProductImage value)
	{
		IMAGEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to image. 
	 * @param value the item to add to image
	 */
	public void addToImage(final ProductImage value)
	{
		addToImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from image. 
	 * @param value the item to remove from image
	 */
	public void removeFromImage(final SessionContext ctx, final ProductImage value)
	{
		IMAGEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from image. 
	 * @param value the item to remove from image
	 */
	public void removeFromImage(final ProductImage value)
	{
		removeFromImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.imagescoll</code> attribute.
	 * @return the imagescoll
	 */
	public Collection<ProductImage> getImagescoll(final SessionContext ctx)
	{
		Collection<ProductImage> coll = (Collection<ProductImage>)getProperty( ctx, IMAGESCOLL);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.imagescoll</code> attribute.
	 * @return the imagescoll
	 */
	public Collection<ProductImage> getImagescoll()
	{
		return getImagescoll( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.imagescoll</code> attribute. 
	 * @param value the imagescoll
	 */
	public void setImagescoll(final SessionContext ctx, final Collection<ProductImage> value)
	{
		setProperty(ctx, IMAGESCOLL,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.imagescoll</code> attribute. 
	 * @param value the imagescoll
	 */
	public void setImagescoll(final Collection<ProductImage> value)
	{
		setImagescoll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.imageslist</code> attribute.
	 * @return the imageslist
	 */
	public Collection<ProductImage> getImageslist(final SessionContext ctx)
	{
		Collection<ProductImage> coll = (Collection<ProductImage>)getProperty( ctx, IMAGESLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.imageslist</code> attribute.
	 * @return the imageslist
	 */
	public Collection<ProductImage> getImageslist()
	{
		return getImageslist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.imageslist</code> attribute. 
	 * @param value the imageslist
	 */
	public void setImageslist(final SessionContext ctx, final Collection<ProductImage> value)
	{
		setProperty(ctx, IMAGESLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.imageslist</code> attribute. 
	 * @param value the imageslist
	 */
	public void setImageslist(final Collection<ProductImage> value)
	{
		setImageslist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.imagesset</code> attribute.
	 * @return the imagesset
	 */
	public Collection<ProductImage> getImagesset(final SessionContext ctx)
	{
		Collection<ProductImage> coll = (Collection<ProductImage>)getProperty( ctx, IMAGESSET);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.imagesset</code> attribute.
	 * @return the imagesset
	 */
	public Collection<ProductImage> getImagesset()
	{
		return getImagesset( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.imagesset</code> attribute. 
	 * @param value the imagesset
	 */
	public void setImagesset(final SessionContext ctx, final Collection<ProductImage> value)
	{
		setProperty(ctx, IMAGESSET,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.imagesset</code> attribute. 
	 * @param value the imagesset
	 */
	public void setImagesset(final Collection<ProductImage> value)
	{
		setImagesset( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive()
	{
		return getPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final Double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final double value)
	{
		setPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
}
