import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

def f(): Future[Int] = {

  for {
    i <- Future.successful(1)
    a = t()
  } yield i

}

def t(): Unit = {
  throw new Exception("errrrr")
}

f.map(println).recover { case e =>
  println(e.getMessage)
}
//errrrr