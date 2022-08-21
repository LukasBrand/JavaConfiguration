package com.lukasbrand.configuration_processor

sealed interface Configuration {

    interface Context {
        fun getName(): String

        fun getPath(): String

        fun getConfigurationManager(): ConfigurationManager
    }

    fun save()

    fun getContext(): Context
}