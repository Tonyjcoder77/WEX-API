# API WEX

This Endpoint is for converting dollar currency purchases to others curencies in the world.

The following operations are available:
-Create a list of purchases.
-Convert the list of purchase to all currency available with conversion rate not older than 
 six months based in the date of the purchase.
-The status of the conversion is issue for every conversion
-Generate a list of conversion rate for every currency to dollar in the 6 months based in a 
 input date

The system handles a Purchase table

When you start the application a set of purchase examples are load in the table based in the 
data.sql file 
 
The API documentation is in the 
http://localhost:8080/swagger-ui.html#/

To build the project go (in intellij) to  Package->Run Maven Build
Then the JAR file is generated. Next copy this file to the server.

Its necessary to point production environment resources in the application-prod.properties
for example the production data base.

