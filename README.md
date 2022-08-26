# HeroKuapp-Automation
-----------------------
Automation framework using BDD framework 
This is a maven based project framework is based BDD using POM design pattern where in for every web page there has been created class containing all the functionality of that specific webpage.

For executing the specific feature file use the command
-------------------------------------------------------
mvn clean 
mvn test -Dcucumber.filter.tags="@NameOfTheTagPresentAtTopOfEveryFeatureFile"

For executing the set of multiple feature files use the command
---------------------------------------------------------------
mvn clean 
mvn test -Dcucumber.filter.tags="@NameOfTheTagPresentAtTopOfEveryFeatureFile or @NameOfTheTagPresentAtTopOfEveryFeatureFile or ....."
