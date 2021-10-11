package com.example

import io.kotest.core.spec.style.FreeSpec
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Status.Companion.OK
import org.http4k.kotest.shouldHaveStatus

class AppTest : FreeSpec() {
    init {
        "should produce openapi3 spec for the API" {
            val openApiV1 = app(Request(Method.GET, "/contract/api/v1/swagger.json"))
            openApiV1 shouldHaveStatus OK
        }
    }
}
