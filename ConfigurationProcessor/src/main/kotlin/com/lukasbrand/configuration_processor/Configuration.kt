package com.lukasbrand.configuration_processor

import java.util.function.Consumer

sealed interface Configuration<C : Configuration<C>> {

    interface Context {
        fun getName(): String

        fun getPath(): String

        fun getConfigurationManager(): ConfigurationManager
    }

    fun onChange(callback: Consumer<C>)

    fun save()

    fun getContext(): Context
}