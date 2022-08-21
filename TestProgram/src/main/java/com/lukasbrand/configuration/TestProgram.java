package com.lukasbrand.configuration;

import com.lukasbrand.configuration_processor.DefaultConfigurationManager;

public class TestProgram {

    public static void main(String[] args) {
        final DefaultConfigurationManager configurationManager = new DefaultConfigurationManager();

        final GeneratedConfigurationAll configurationAll = GeneratedConfigurationAll.load(configurationManager);

        configurationAll.onChange(configuration -> System.out.println(configuration.getName()));

        //configurationManager.load()

    }
}
