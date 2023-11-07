package com.example

import io.micronaut.context.annotation.Context

/**
 * This object is a Singleton to be injected into
 * Module1 as a dependency in Unit Tests.
 *
 * See [com.example.ApplicationTest] test class.
 */
@Context
class DemoFixture {

    init {
        println("Hello from com.example.DemoFixture")
    }

    fun returnTrue() = true
}
