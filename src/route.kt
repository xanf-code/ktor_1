package com.darshan.xD

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.request.receive
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.post

fun  Routing.root() {
    get(path = "/"){
        call.respondText(text = "Keep Smiling :)",contentType = ContentType.Text.Plain)
    }
}

fun Routing.post() {
    post(path = "/"){
        val post = call.receive<String>()
        call.respondText(text = "Received $post :)",contentType = ContentType.Text.Plain)
    }
}