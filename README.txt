..
Jared Kremer 
1001562181
Project 1
Table of Contents
------------------


* Introduction
* Features
* Installation
* References
* Demo


Introduction
-------------
 This web server can handle multiple requests concurrently and the 
 web client can connect to the server via a socket and request a Page
 on the server

Features
-------------

- server handles multiple requests concurrently
- server sets up a TCP connection to the requesting client and serves thee request in a sperate thread
- client is able to connect to the server via a socket and request a page on the server
- client extracts and dispays the message status, and then retrieves the page content from the message body

Installation
-------------
- install an internet browser (i.e Chrome) to test the server without the client
- (optional) install netbeans to test and run the server



References
-------------
 template for client program
 https://www.javaworld.com/article/2853780/socket-programming-for-scalable-systems.html
 template to get localhost ip address           
 https://www.google.com/search?q=how+to+find+your+ip+address+using+java.net&oq=how+to+find+your+ip+address+using+java.net&aqs=chrome..69i57j33.21661j0j7&sourceid=chrome&ie=UTF-8
 examples on server sockets
 https://www.codejava.net/java-se/networking/java-socket-server-examples-tcp-ip
 examples on establishing a data output stream
 http://tutorials.jenkov.com/java-io/dataoutputstream.html#dataoutputstream-example
 used to return a files correct MIME type
 https://en.wikipedia.org/wiki/JPEG
 https://en.wikipedia.org/wiki/GIF
 Java.net documentation
 https://docs.oracle.com/javase/8/docs/api/java/net/package-frame.html
 skeleton code for the server provided in Computer Networks a Top Down Approach's companion website



Demo
-------------

 - Firstly open two command prompts (or terminals) and change to the directory that has the code
 - Execute the javac command inside the directory with the webserver java source code by typing "javac WebServer.java" (no quotations) 
 - Back up to the previous directory by issuing the cd.. bash command and then type "java webserver.WebServer port_number" (no quotations) and press enter 
 - From there test to make sure the server is working by accesing your web browser and typing "localhost:port_number/index.html" (no quotations and port_number is the port_number you chose when executing the server in the command prompt, default is 8080)
   the index.html file should be displayed in the browser, if it is not make sure the html file is in the parent directory of the directory containing the webserver source code
 - Next we will test the web client by accesing the 2nd command prompt(or terminal) and change to the directory that has the webclient code and execute the code in the directory by first typing "javac WebClient.java"
 - Then change to the parent directory of the directory that has the webclient code and type "java webclient.WebClient port_number requested_file_name_path" 
   i.e java webclient.WebClient 8080 /index.html 
 - Once testing is complete type ctrl c in the server and close the command prompts(or terminals)
   
