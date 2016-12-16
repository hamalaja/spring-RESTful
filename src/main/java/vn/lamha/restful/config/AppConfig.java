package vn.lamha.restful.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lamhm
 *
 */
@Configuration
@PropertySources({ @PropertySource(value = "config/application.properties", ignoreResourceNotFound = true) })
public class AppConfig extends WebMvcConfigurerAdapter {

}
