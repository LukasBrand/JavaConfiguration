package com.lukasbrand.configuration;

import com.lukasbrand.configuration_processor.EnvConfiguration;
import com.lukasbrand.configuration_processor.XmlConfiguration;
import com.lukasbrand.configuration_processor.annotations.Configuration;
import org.jetbrains.annotations.NotNull;

abstract class ConfigurationAllEntity implements XmlConfiguration<ConfigurationAllEntity>, EnvConfiguration<ConfigurationAllEntity> {
    private final @NotNull String name;
    private final @NotNull String surname;
    private final int age;

    @Configuration
    ConfigurationAllEntity(final @NotNull String name, final @NotNull String surname, final int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public @NotNull String getName() {
        return name;
    }

    public @NotNull String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
