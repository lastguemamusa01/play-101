# play-101


Play Framework is an open-source web application framework which follows the model–view–controller (MVC) architectural pattern. It is written in Scala and usable from other programming languages that are compiled to JVM bytecode, e.g. Java. It aims to optimize developer productivity by using convention over configuration, hot code reloading and display of errors in the browser.[2]
Support for the Scala programming language has been available since version 1.1 of the framework.[3] In version 2.0, the framework core was rewritten in Scala. Build and deployment was migrated to SBT, and templates use Scala[4] instead of Apache Groovy.



Play is heavily inspired by ASP.NET MVC, Ruby on Rails and Django and is similar to this family of frameworks. Play web applications can be written in Scala or Java, in an environment that may be less Java Enterprise Edition-centric. Play uses no Java EE constraints. This can make Play simpler to develop compared to other Java-centric platforms.[18]
Although Play 1.x could also be packaged as WAR files to be distributed to standard Java EE application servers,[19] Play 2.x applications are now designed to be run using the built-in Akka HTTP or Netty web servers exclusively.

•	Stateless: Play 2 is fully RESTful – there is no Java EE session per connection.
•	Integrated unit testing: JUnit and Selenium support is included in the core.
•	API comes with most required elements built-in.
•	Asynchronous I/O: due to using Akka HTTP as its web server, Play can service long requests asynchronously rather than tying up HTTP threads doing business logic like Java EE frameworks that don't use the asynchronous support offered by Servlet 3.0.[20]
•	Modular architecture: like Ruby on Rails and Django, Play comes with the concept of modules.
•	Native Scala support: Play 2 uses Scala internally but also exposes both a Scala API, and a Java API that is deliberately slightly different to fit in with Java conventions, and Play is completely interoperable with Java.



Play is modern java and scala framework that allow to build web application quickly.

Build scalable web application -> MVC -> model view controller

Model – control data
View – visual(HTML)
Controller – logic


Command 
sbt new playframwork/play-java-seed.g8
sbt new playframwork/play-scala-seed.g8

this going to create new project -> enter the name and organization
go to cd name
sbt run -> command to run the application


command : sbt.  -> interactive mode,  do some command while application running

command inside sbt:  compile -> compile application
command inside sbt:  test -> to run tests in the application
command inside sbt:  console -> to enter to scala
command inside sbt:  help -> to see all command that you can do in interact mode

command +c -> to exit

in play use actions to hadle requests -> Actions = Request
actions are the request that we sent to the application to handle a response back.

Whenever we are doing in the application we are requesting something
Any actions on the application makes a request
This request gets a response
These actions are handled through http routing

In the view form -> we input contact infomartion when click button to submit
This is post method
The request has the route : /contracts 
Controller handles the post request

Server return
Response : success or failure response

Get all contacts -> get method with countact
Update   /contacts/:id.  – put 
Delete  delete method with /contact/:id


The route need to be added in the conf/routes file


Comet & websockets – two different methods to allow two-ways communications like chat application. Is a communication protocol for duplex communication.

Differences 
	Comet – connection remains open until server push – resource heavy
  	Websocket – once server and client agree, open the connection – hand shake. Save resources. 

Twirl – template using play is named twirl - > templating language for views.

Twirl – template engine – simplify to introduce html
@ -> dynamic syntax with html -> dynamic code is happening in there

Library dependencies need call external api


In build.sbt – quit server first

Add

libraryDependencies ++= Seq(
    javaWs
)


We need this dependencies to use the web server or WS with java

Json in play

You can create you json objects or you can actually consume json data from apis

https://www.playframework.com/documentation/2.8.x/JavaJsonActions

JsonNode type


Request with ws (consuming apis)
https://www.playframework.com/documentation/2.8.x/JavaWS#Adding-WS-to-project



build your own api
https://www.playframework.com/documentation/2.8.x/Tutorials
rest api example

https://github.com/playframework/play-samples/tree/2.8.x/play-java-rest-api-example/


modules – are libraries that allow you to extends your application functions,  or connect specfici databases. Etc.

https://www.playframework.com/documentation/2.8.x/ModuleDirectory


you can integrate in play react or angular
Third Party Tutorials and Templates
https://www.playframework.com/documentation/2.8.x/Tutorials




![image](https://user-images.githubusercontent.com/25869911/139605832-36cc5411-71ae-40d8-a90b-df8cd6b19bef.png)
