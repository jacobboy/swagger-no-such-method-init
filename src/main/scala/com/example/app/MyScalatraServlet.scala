package com.example.app

import org.scalatra._

import org.scalatra.swagger._

class MyScalatraServlet(implicit val swagger: Swagger) extends ScalatraServlet
    with SwaggerSupport {

  protected val applicationDescription: String = "MyScalatraApi"

  get("/") {
    "what's up"
  }

}
