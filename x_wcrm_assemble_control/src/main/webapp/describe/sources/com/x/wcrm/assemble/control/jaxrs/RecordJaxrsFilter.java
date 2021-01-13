package com.x.wcrm.assemble.control.jaxrs;

import javax.servlet.annotation.WebFilter;

import com.x.base.core.project.jaxrs.CipherManagerUserJaxrsFilter;

@WebFilter(urlPatterns = "/jaxrs/record/*", asyncSupported = true)
public class RecordJaxrsFilter extends CipherManagerUserJaxrsFilter {

}
