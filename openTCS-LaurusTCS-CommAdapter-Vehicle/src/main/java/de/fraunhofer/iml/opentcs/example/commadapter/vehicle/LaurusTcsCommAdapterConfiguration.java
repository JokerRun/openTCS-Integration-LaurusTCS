/**
 * Copyright (c) Fraunhofer IML
 */
package de.fraunhofer.iml.opentcs.example.commadapter.vehicle;

import org.opentcs.configuration.ConfigurationEntry;
import org.opentcs.configuration.ConfigurationPrefix;

/**
 * Provides methods to configure the {@link LaurusTcsCommAdapter}.
 *
 * @author Leonard Schuengel (Fraunhofer IML)
 */
@ConfigurationPrefix(LaurusTcsCommAdapterConfiguration.PREFIX)
public interface LaurusTcsCommAdapterConfiguration {

  /**
   * This configuration's prefix.
   */
  String PREFIX = "example.commadapter";

  @ConfigurationEntry(
      type = "Boolean",
      description = "Whether to register/enable the example communication adapter.",
      orderKey = "0_enable")
  boolean enable();

}
