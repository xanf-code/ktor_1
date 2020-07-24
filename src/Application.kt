package com.darshan.xD

import io.ktor.application.*
import io.ktor.http.ContentType
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

public val mobileData = "{\"Mobiles\" : [\"OnePlus\",\"Samsung\",\"Nokia\"]}"

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    routing {
        this.root()
        this.post()
        this.mobileData()
    }
}

