package com.darshan.xD

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get

fun Routing.mobileData() {
    get(path = "/mobiles"){
        call.respondText(mobileData)
    }
}