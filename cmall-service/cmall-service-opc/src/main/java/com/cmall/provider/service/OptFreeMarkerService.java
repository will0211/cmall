
package com.cmall.provider.service;

import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.Map;


/**
 * The interface Opt free marker service.
 *
 */
public interface OptFreeMarkerService {

	/**
	 * Gets template.
	 *
	 * @param map              the map
	 * @param templateLocation the template location
	 *
	 * @return the template
	 *
	 * @throws IOException       the io exception
	 * @throws TemplateException the template exception
	 */
	String getTemplate(Map<String, Object> map, String templateLocation) throws IOException, TemplateException;
}
