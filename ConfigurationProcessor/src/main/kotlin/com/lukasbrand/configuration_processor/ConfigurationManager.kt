package com.lukasbrand.configuration_processor

interface ConfigurationManager {

    fun <C : Configuration> load(loader: C): C

    fun <C : Configuration> save(configuration: C): C

    fun <C : Configuration> onChange(clazz: Class<C>, callback: (C) -> Unit)

}