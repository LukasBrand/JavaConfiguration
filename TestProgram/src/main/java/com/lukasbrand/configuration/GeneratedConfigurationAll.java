package com.lukasbrand.configuration;

import com.lukasbrand.configuration_processor.ConfigurationManager;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class GeneratedConfigurationAll extends ConfigurationAllEntity {
    private final @NotNull Context context;

    private GeneratedConfigurationAll(final @NotNull String name, final @NotNull String surname, final int age, final @NotNull Context context) {
        super(name, surname, age);
        this.context = context;
    }

    public static @NotNull GeneratedConfigurationAll load(final @NotNull ConfigurationManager configurationManager) {
        return new GeneratedConfigurationAll("a", "b", 1, new GeneratedConfigurationAllContext(configurationManager));
    }

    public void onChange(final @NotNull Consumer<ConfigurationAllEntity> callback) {
        callback.accept(this);
    }

    @Override
    public void save() {
        context.getConfigurationManager().save(this);
    }


    @Override
    public @NotNull Context getContext() {
        return context;
    }


    private static class GeneratedConfigurationAllContext implements Context {

        private final @NotNull ConfigurationManager configurationManager;

        private GeneratedConfigurationAllContext(final @NotNull ConfigurationManager configurationManager) {
            this.configurationManager = configurationManager;
        }

        @Override
        public @NotNull String getName() {
            return "EntityName";
        }

        @Override
        public @NotNull String getPath() {
            return "configuration";
        }

        @Override
        public @NotNull ConfigurationManager getConfigurationManager() {
            return configurationManager;
        }
    }
}
