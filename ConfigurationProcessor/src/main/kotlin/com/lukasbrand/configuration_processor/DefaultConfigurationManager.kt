package com.lukasbrand.configuration_processor

class DefaultConfigurationManager : ConfigurationManager {


    override fun <C : Configuration<C>> load(loader: C): C {
        TODO("Not yet implemented")
    }

    override fun <C : Configuration<C>> save(configuration: C): C {
        TODO("Not yet implemented")
    }

    override fun <C : Configuration<C>> onChange(clazz: Class<C>, callback: (C) -> Unit) {
        TODO("Not yet implemented")
    }
}