/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-Aug-2015 16:36:17                        ---
 * ----------------------------------------------------------------
 */
package org.training.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedTrainingConstants
{
	public static final String EXTENSIONNAME = "training";
	public static class TC
	{
		public static final String MYADDRESS = "MyAddress".intern();
		public static final String MYBILLINGADDRESS = "MyBillingAddress".intern();
		public static final String MYCATEGORY = "MyCategory".intern();
		public static final String MYCUSTOMER = "MyCustomer".intern();
		public static final String MYPRODUCT = "MyProduct".intern();
		public static final String MYSHIPPINGADDRESS = "MyShippingAddress".intern();
		public static final String PRODUCTIMAGE = "ProductImage".intern();
		public static final String SEX = "Sex".intern();
	}
	public static class Attributes
	{
		// no constants defined.
	}
	public static class Enumerations
	{
		public static class Sex
		{
			public static final String SELECT = "Select".intern();
			public static final String MALE = "Male".intern();
			public static final String FEMALE = "Female".intern();
			public static final String OTHER = "Other".intern();
		}
	}
	public static class Relations
	{
		public static final String CUSTOMERTOBILLINGADDRESS = "CustomerToBillingAddress".intern();
		public static final String CUSTOMERTOSHIPPINGADDRESS = "CustomerToShippingAddress".intern();
		public static final String PRODUCTTOCATEGORY = "ProductToCategory".intern();
		public static final String PRODUCTTOIMAGES = "ProductToImages".intern();
	}
	
	protected GeneratedTrainingConstants()
	{
		// private constructor
	}
	
	
}
