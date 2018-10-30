// Wei Chen 2018-10-30
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.directives.ContentTypeResolver.Default

object AkkaHttpGUI extends App {

  implicit val actorSystem = ActorSystem("system")
  implicit val actorMaterializer = ActorMaterializer()

  val route =
    pathSingleSlash {
      getFromFile("public/index.html")
    } ~
    path("public" / Segment) { name =>
      getFromFile(s"public/$name")
    }
  
  Http().bindAndHandle(route, "localhost", 8080)
  println("server started at 8080")
}
