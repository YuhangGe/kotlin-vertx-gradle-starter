package com.hansight.analysis

import io.vertx.core.AbstractVerticle
import io.vertx.ext.web.Router

fun getGreeting(): String {
  return "Hello, World!"
}

class MainVerticle : AbstractVerticle() {

  override fun start() {
    val a = B()
    a.say()
    val b = A()
    b.say()

    val router = Router.router(vertx)

    router.get("/").handler({
      it.response().end("Hello, World!")
    })
    router.get("/ok").handler({
      it.response().end("Ok!")
    })

    vertx.createHttpServer()
        .requestHandler({
          router.accept(it)
        }).listen(8080)
  }

}
