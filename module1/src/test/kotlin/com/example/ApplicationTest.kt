package com.example
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@MicronautTest
class ApplicationTest {

    @Inject
    lateinit var application: EmbeddedApplication<*>

    @Inject
    lateinit var demoFixture: DemoFixture

    @Test
    fun testItWorks() {
        Assertions.assertTrue(application.isRunning)
        Assertions.assertTrue(demoFixture.returnTrue())
    }

}
