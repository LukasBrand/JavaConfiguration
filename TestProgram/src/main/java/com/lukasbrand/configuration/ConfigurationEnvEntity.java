package com.lukasbrand.configuration;

import com.lukasbrand.configuration_processor.EnvConfiguration;
import com.lukasbrand.configuration_processor.annotations.Configuration;
import org.jetbrains.annotations.NotNull;

public abstract class ConfigurationEnvEntity implements EnvConfiguration<ConfigurationEnvEntity> {
    private final @NotNull String name;
    private final @NotNull String surname;
    private final int age;

    @Configuration
    public ConfigurationEnvEntity(final @NotNull String name, final @NotNull String surname, final int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
