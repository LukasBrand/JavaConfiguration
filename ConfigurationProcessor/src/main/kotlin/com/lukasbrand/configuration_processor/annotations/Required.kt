package com.lukasbrand.configuration_processor.annotations

@Target(AnnotationTarget.FIELD, AnnotationTarget.TYPE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Required()
