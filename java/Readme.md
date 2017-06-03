# Testing `intercom-java`

- This is a sample repostiory in order to test the Intercom Java library that interacts with [Intercom's API](https://developers.intercom.io/reference)

## Install JDK
- Check for any minimum required version of the JDK on https://github.com/intercom/intercom-java
- Download appropriate / latest version of the Java SE Development Kit from Oracle http://www.oracle.com/technetwork/java/javase/downloads/

## Dependencies
- The `intercom-java` library uses several dependencies needed in order to work
- Listed in https://github.com/intercom/intercom-java/blob/master/build.gradle

# Running the code
- Select the appropriate directory needed for your type of installation

## IntelliJ - Gradle
- Add to `build.gradle`

### Step by Step
- Create Gradle, Java project
![Create Gradle, Java project](screenshots/intellij-gradle/IntelliJ Gradle 01.png)
- Specify details
![Specify details](screenshots/intellij-gradle/IntelliJ Gradle 02.png)
- Check "Auto Import" and "Create directories for empty content roots automatically"
![Java Create SDK](screenshots/intellij-gradle/IntelliJ Gradle 03.png)
- Specify project details
![Specify project details](screenshots/intellij-gradle/IntelliJ Gradle 04.png)
- Update `build.gradle` to include appropriate changes
![Update build.gradle](screenshots/intellij-gradle/IntelliJ Gradle 05.png)
   - If "Auto Import" not selected, can manually synchronize changes via View > Tool Windows > Gradle
![Gradle window](screenshots/intellij-gradle/IntelliJ Gradle 05 manual 01.png)
![Click Refresh](screenshots/intellij-gradle/IntelliJ Gradle 05 manual 02.png)
- Create new code `.java` file
![Create new code file](screenshots/intellij-gradle/IntelliJ Gradle 06.png)
- Make code changes and run project
![Run project via menu](screenshots/intellij-gradle/IntelliJ Gradle 07.png)
- Auto generated run profile
![Auto generated run profile](screenshots/intellij-gradle/IntelliJ Gradle 08.png)
   - If not auto generated, manually create and add a new Application Configuration
![Auto generated run profile](screenshots/intellij-gradle/IntelliJ Gradle 09i.png)
   - Select the appropriate Main class
![Auto generated run profile](screenshots/intellij-gradle/IntelliJ Gradle 09ii.png)
   - Completed run profile
![Auto generated run profile](screenshots/intellij-gradle/IntelliJ Gradle 09iii.png)

## IntelliJ - Manually Specify Dependencies

### Dependencies
- Download `.jar` files from repositories such as MvnRepository https://mvnrepository.com/
- Place `.jar` files in `dependencies` directory

### Step by Step
- Create Project
![Create project](screenshots/intellij-manual-dependencies/Java 01 - Create Project.png)
- Select Java app and create/select JDK if necessary
![Java Create SDK](screenshots/intellij-manual-dependencies/Java 02 - Create JDK.png)
- Create from a template and select Command Line App
![Select Command Line App](screenshots/intellij-manual-dependencies/Java 03 - Command Line App.png)
- Right click project > Module Settings to add dependencies
![Java Create SDK](screenshots/intellij-manual-dependencies/Java 04 - Manually Add Dependency.png)
- Manually select a Jar
![Java Create SDK](screenshots/intellij-manual-dependencies/Java 05 - Manually Add Jar.png)
- Added Jar
![Java Create SDK](screenshots/intellij-manual-dependencies/Java 06 - Added Jar.png)
- Import class as necessary
![Java Create SDK](screenshots/intellij-manual-dependencies/Java 07 - Import class.png)
- See working code
![Working code post import](screenshots/intellij-manual-dependencies/Java 08 - Working code.png)
- Create code and run project
![Run project](screenshots/intellij-manual-dependencies/Java 09 - Run.png)


## Command line

### Dependencies
- Download `.jar` files from repositories such as MvnRepository https://mvnrepository.com/
- Place `.jar` files in `dependencies` directory

### Compile
`javac -cp ./dependencies/*:./ Main.java`

### Run
`java -cp ./dependencies/*:./ Main`

## Command line - Gradle

### Get Dependencies & Compile
`./gradlew build`

### Run
`./gradlew run`
