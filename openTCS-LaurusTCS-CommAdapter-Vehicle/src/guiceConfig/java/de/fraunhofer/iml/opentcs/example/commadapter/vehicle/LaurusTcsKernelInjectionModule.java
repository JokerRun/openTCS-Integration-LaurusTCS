/**
 * Copyright (c) Fraunhofer IML
 */
package de.fraunhofer.iml.opentcs.example.commadapter.vehicle;

import com.google.inject.assistedinject.FactoryModuleBuilder;
import org.opentcs.customizations.kernel.KernelInjectionModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LaurusTcsKernelInjectionModule
    extends KernelInjectionModule {
  
  private static final Logger LOG = LoggerFactory.getLogger(LaurusTcsKernelInjectionModule.class);

  @Override
  protected void configure() {
    
    LaurusTcsCommAdapterConfiguration configuration
        = getConfigBindingProvider().get(LaurusTcsCommAdapterConfiguration.PREFIX,
                                         LaurusTcsCommAdapterConfiguration.class);
    
    if (!configuration.enable()) {
      LOG.info("LaurusTcs communication adapter disabled by configuration.");
      return;
    }
    
    install(new FactoryModuleBuilder().build(LaurusTcsAdapterComponentsFactory.class));
    vehicleCommAdaptersBinder().addBinding().to(LaurusTcsCommAdapterFactory.class);
  }
}
