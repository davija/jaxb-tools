package org.jvnet.jaxb.plugin.setters;

import javax.xml.namespace.QName;

/**
 * Customizations previous namespace handling
 *
 * @deprecated since 3.0, for removal
 */
@Deprecated
public class LegacyCustomizations {

	public static String NAMESPACE_URI = "http://jaxb2-commons.dev.java.net/basic/collectionsetters";

	public static QName IGNORED_ELEMENT_NAME = new QName(NAMESPACE_URI,
			"ignored");

}
