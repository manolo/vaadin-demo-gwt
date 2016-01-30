This project is a starter vaadin application configured to be compiled
with GWT compiler instead of the vaadin-client-compiler

It depends on a [patched](https://gwt-review.googlesource.com/#/c/7857/) version of GWT-2.8.0-SNAPSHOT supporting Jetty.9

It also has a customised JettyLauncher so as Jetty reads servlet 3.0 annotations and reloads whenever any object in the classpath changes, which is usefull for vaadin apps.

Usage:

   $ mvn clean package  (to create the app)
   $ mvn gwt:devmode (to run the app in superdev mode)






