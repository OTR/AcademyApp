package com.github.otr.academy.data.config

import com.github.otr.academy.BuildConfig

/**
 *
 */
object Config {

    val backendHost: String = BuildConfig.ACADEMY_HOST
        ?: throw IllegalArgumentException("Environment variable `ACADEMY_HOST` is not set")

}
