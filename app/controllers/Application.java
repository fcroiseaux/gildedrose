package controllers;

import models.Inn;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
      Inn.getInn().updateQuality();
    return ok(index.render("Your new application is ready."));
  }
  
}