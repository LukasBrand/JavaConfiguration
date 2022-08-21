package com.lukasbrand.configuration_processor

interface ConfigurationManager {

    fun <C : Configuration<C>> load(loader: C): C

    fun <C : Configuration<C>> save(configuration: C): C

    fun<C : Configuration<C>> onChange(clazz: Class<C>,  callback: (C) -> Unit)

}