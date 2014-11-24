Social Network Analysis with Signal/Collect - The Gephi Plugin
========================================================================================================================

This repository features a [Gephi](http://www.gephi.org) plugin developed to run Social Network Analysis methods with [Signal/Collect](http://uzh.github.io/signal-collect/)

### Get started

- Download and install the latest version of [Netbeans IDE](http://netbeans.org).
- Download a ZIP or fork and checkout the latest version of this repository:
- Start Netbeans and Open Project. This folder is automatically recognized as a module suite.
- Compile the Signal/Collect Social Network Analysis project according to the description in the [signal-collect-sna](https://github.com/fkzrh/signal-collect-sna) repository.
- Create a .jar-File out of the compiled project with the sbt "assembly" command.
- Right click on the project and select "Properties". Go to "Libraries and import this .jar-File into the NetBeans project as "Wrapped JAR".
- Right click on the project, select "Clean and Build" and then select 'Run'. This starts Gephi with this plugin.
- To package the project to a Gephi plugin, Select File > Package as > NBMs and create the NetBeans module which can be installed as a plugin in Gephi.

More info on developing a plugin for Gephi can be found in the [gephi-plugins](https://github.com/gephi/gephi-plugins) repository