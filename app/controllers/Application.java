package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render("Your new application is ready."));
	}

	public static Result sobre() {
		// ok("Sobre");
		return ok(views.html.sobre.render("Top 100 filmes Cult",play.core.PlayVersion.current()));
	}

}
