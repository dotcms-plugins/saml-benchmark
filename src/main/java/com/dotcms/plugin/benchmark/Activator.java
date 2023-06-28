package com.dotcms.plugin.benchmark;

import org.osgi.framework.BundleContext;
import com.dotcms.rest.config.RestServiceUtil;
import com.dotmarketing.osgi.GenericBundleActivator;
import com.dotmarketing.util.Logger;

public class Activator extends GenericBundleActivator {

	Class clazz = SamlBenchmarkResource.class;

	public void start(BundleContext context) throws Exception {

		Logger.info(this.getClass(), "Adding new Restful Service:" + clazz.getSimpleName());
		RestServiceUtil.addResource(clazz);
	}

	public void stop(BundleContext context) throws Exception {

		Logger.info(this.getClass(), "Removing new Restful Service:" + clazz.getSimpleName());
		RestServiceUtil.removeResource(clazz);
	}

}
