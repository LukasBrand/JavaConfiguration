package com.lukasbrand.configuration_processor.annotations

@Target(AnnotationTarget.CONSTRUCTOR, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Configuration(val name: String = "", val path: String = "configuration")
