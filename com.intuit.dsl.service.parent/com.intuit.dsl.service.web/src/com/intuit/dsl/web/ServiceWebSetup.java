/*
 * generated by Xtext 2.25.0
 */
package com.intuit.dsl.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.intuit.dsl.ServiceRuntimeModule;
import com.intuit.dsl.ServiceStandaloneSetup;
import com.intuit.dsl.ide.ServiceIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class ServiceWebSetup extends ServiceStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ServiceRuntimeModule(), new ServiceIdeModule(), new ServiceWebModule()));
	}
	
}
