val ScalatraVersion = "2.6.4"
val JettyVersion = "9.4.14.v20181114"

organization := "com.example"

name := "My Scalatra Web App"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.6"

resolvers += Classpaths.typesafeReleases


libraryDependencies ++= Seq(
  "org.scalatra"        %% "scalatra"             % ScalatraVersion,
  "org.scalatra"        %% "scalatra-scalatest"   % ScalatraVersion   % "test",
  "org.scalatra"        %% "scalatra-swagger"     % ScalatraVersion,
  "ch.qos.logback"       % "logback-classic"      % "1.2.3"           % "runtime",
  "org.eclipse.jetty"    % "jetty-webapp"         % JettyVersion      % "container",
  "javax.servlet"        % "javax.servlet-api"    % "3.1.0"           % "provided",
)

enablePlugins(ScalatraPlugin)
