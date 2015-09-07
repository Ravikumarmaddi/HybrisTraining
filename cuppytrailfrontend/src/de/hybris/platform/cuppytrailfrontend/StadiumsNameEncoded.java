/**
 *
 */
package de.hybris.platform.cuppytrailfrontend;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.log4j.Logger;


/**
 * @author sivanmundru
 *
 */
public class StadiumsNameEncoded
{

	private static final Logger LOGGER = Logger.getLogger(StadiumsNameEncoded.class);

	public static String getNameEncoded(final String name)
	{
		try
		{
			return URLEncoder.encode(name, "UTF-8");
		}
		catch (final UnsupportedEncodingException e)
		{
			LOGGER.error("Problem while encoding", e);
			return "";
		}
	}

}
