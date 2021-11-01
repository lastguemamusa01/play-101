package controllers;

import play.mvc.*;

public class NewController extends Controller {

    public Result newPage() {
        // return html page
        return ok(views.html.newPage.render());
        
        // return text
        //return ok("hello im minku");
        // return internal server error (500)
        // return internalServerError("Opps!!");
        // restun specific status, customize status
        // return status(488, "Strage response type");
        // return not foud 404 y and show as html text page not found
        // return notFound("<h1>Page not found</h1>").as("text/html");
        // return redirect to main page
        // return redirect("/");
    }
    
}
