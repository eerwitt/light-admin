package org.lightadmin.core.config.domain.filter;

import org.lightadmin.core.config.domain.renderer.Renderer;
import org.lightadmin.core.config.domain.support.ConfigurationUnitBuilder;

public interface FiltersConfigurationUnitBuilder extends ConfigurationUnitBuilder<FiltersConfigurationUnit> {

	FiltersConfigurationUnitBuilder field( final String fieldName );

	FiltersConfigurationUnitBuilder renderer( final Renderer renderer );

}