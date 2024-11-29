package ru.specialist.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("ru.specialist.lab21")
@PropertySource("prop.properties")
public class Config {
}
