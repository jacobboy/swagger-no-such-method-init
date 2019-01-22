/**
 * The API
 * An API that is an API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.server.api

import org.openapitools.server.model.Error
import org.openapitools.server.model.OperationGetResponse
import org.openapitools.server.model.OperationPostResponse

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class DefaultApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "DefaultApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val theGetOperationOperation = (apiOperation[List[OperationGetResponse]]("theGetOperation")
    summary ""
    parameters(queryParam[String]("sort").description("").optional, queryParam[Int]("limit").description("").optional)
  )

  get("/operation", operation(theGetOperationOperation)) {
            val sort = params.getAs[String]("sort")

    //println("sort: " + sort)
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
  }

  

  val thePostOperationOperation = (apiOperation[List[OperationPostResponse]]("thePostOperation")
    summary ""
    parameters()
  )

  post("/operation", operation(thePostOperationOperation)) {
  }

}
