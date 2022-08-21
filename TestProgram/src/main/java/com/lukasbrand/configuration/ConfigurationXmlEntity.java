package com.lukasbrand.configuration;

import com.lukasbrand.configuration_processor.XmlConfiguration;
import com.lukasbrand.configuration_processor.annotations.Configuration;
import org.jetbrains.annotations.NotNull;

public abstract class ConfigurationXmlEntity implements XmlConfiguration {
    private final @NotNull String name;
    private final @NotNull String surname;
    private final int age;

    @Configuration
    public ConfigurationXmlEntity(final @NotNull String name, final @NotNull String surname, final int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
