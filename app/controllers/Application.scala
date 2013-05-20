package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
        def index = Action {
                Ok(views.html.index())
        }

        def login = Action {
                Ok(views.html.login())
        }

        def register = Action {
                Ok(views.html.register())
        }
 
        def checkRegister = Action {
                Ok(views.html.index())
        }
}
