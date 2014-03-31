Algs4Scala
==========

This is a simple lightweight template for getting started creating mixed Java and Scala project for Coursera Algorithms, Part I and Algorithms, Part II. It consists _only_ required and predefined Java classes from assignment WordNet from second part this course. However should be easy modified to any other assignment from this courses.

Why Scala?
----------

_The autograder currently supports only Java. Extending to other JVM languages is something that we'd like to support in the future_
[by instructor Kevin Wayne](https://class.coursera.org/algs4partII-003/forum/thread?thread_id=2)

Due to limitation to only Java and JVM 1.7 it is not possible to use any language other than Java (even Java 1.8 is not supported) for assignments. However this is common situation for whole industry. Usually Java-based commercial projects has no way to be rewritten from Java to Scala. Instead it is possible to start writing unit tests using Scala.

Workflow is following:
* The part of assignment that will be shipped to autograder should be written on Java, 
* Scala provides some interesting possibilities to write unit tests
 * For example [ScalaCheck](http://scalacheck.org/)

Thus, *using this template you could accomplish both programming assignments on Java and have practiced Scala while writing unit tests*.

Usage
-----

It uses the Simple Build Tool (SBT) to:

* download all the libraries on which the project depends, including Scala and unit tests frameworks, if necessary
* run your programs and tests
* create zip archive to be uploaded to Coursera
* to generate the necessary configuration files for importing your project into both Eclipse and Intellij IDEA IDEs

Assuming you have Java 1.5 or later installed, to get started:

1. Download the template:

        git clone https://github.com/akimboyko/Algs4Scala.git .
        
     Or, if you don't have git installed, download and unzip the files manually from [here](https://github.com/akimboyko/Algs4Scala/archive/master.zip).
       
2. Launch sbt:

        cd Algs4Scala
        ./sbt (or sbt.bat for Windows)
        
  This downloads all the dependencies for the project.

3. To load the project into Eclipse, at the SBT prompt:

        > eclipse with-sources=true
        
   Then from within Eclipse, select File->Import->General->Existing Projects Into Workspace, and select your project directory. 
   Install the Eclipse Scala IDE plugin from [here](http://scala-ide.org/download/current.html).

4. Or, to load the project into Intellij IDEA, at the SBT prompt:
   
        > gen-idea
        
   Then from within IDEA, select File -> Open Project, and select your project directory.

5. Put your solution for coding assignment as Java class files in src/main/java.

6. Write your tests in src/test/scala (there is one example of unit tests). To run all your tests:

        > test
        
7. To run just one test:

        > test-only WordNetSuite
        
9. To export Java files to zip file:

        > zip

9. To launch the Scala interpreter, at the sbt prompt:

        > console
        
   This allows you to 'play around' with Scala commands, with full access to all the libraries defined in your project. 
   Ctrl-D returns you to SBT.
   
10. To view / modify project configuration settings, see build.sbt in the project root directory. If you change anything, run

        > reload
        
   from within SBT for your changes to take effect.
   
   
Credits
=======

This template has been inspired by [scala-sbt-template by Damian Helme](https://github.com/dph01/scala-sbt-template)
