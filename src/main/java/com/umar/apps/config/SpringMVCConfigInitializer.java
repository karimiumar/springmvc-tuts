package com.umar.apps.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Spring framework detects the class extending AbstractAnnotationConfigDispatcherServletInitializer,
 * that class is automatically used to configure DispatcherServlet.
 * Class defined in getServletConfigClasses() method is used to load Spring application context.
 *
 * GetServletMappings() method defines the URL pattern served by the DispatcherServlet.
 */
public class SpringMVCConfigInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
