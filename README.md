### Introduction

This project is a starter vaadin application replacing vaadin-client-compiler by GWT one, therefore you can use new features in the compiler like jsInterop.

It also uses new `net.ltgt.gwt-maven-plugin` for the compilation.

It depends on a [patched](https://gwt-review.googlesource.com/#/c/7857/) version of GWT-2.8.0-SNAPSHOT supporting Jetty.9 deployed in a private repo, but you could use master GWT if you dont need Jetty.9.

This version has also a customised `JettyLauncher` so as Jetty reads servlet 3.0 annotations in vaadin projects and hot-reloads whenever any object in the classpath changes.

### How it works

The trick is not depend on vaadin-client bundle in compilation because they override stuff in the gwt jars, but we extract all the needed vaadin classes to the `generated-sources` folder instead in the appropriate maven phase. 

### Building

To build the app usage:

    $ mvn clean package  (to create the app)
   
To debug in SuperDevMode:
   
    $ mvn gwt:devmode (to run the app in superdev mode)
    
    
### Issues

1. For some reason Vaadin bootstrap does not load the theme styles, or they are removed in some point. I'm facing the problem injecting some JS from server in order to add the style tag to the header, and add the appropriate theme class to the body.
2. We need a patched version of `MessageSender` (line 165) because it does not compiles with this setup, take a look to [this issue](https://dev.vaadin.com/ticket/19537)
3. Also a patched version of `LayoutManager` (line 265) is needed in order to avoid an assertion in SDM 

    
    
    






