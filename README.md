## Selenium Java Project
This is a sample Selenium Java project using Maven. It demonstrates how to set up a basic automated testing framework for web applications using Selenium WebDriver and TestNG.
## Prerequisites
Java JDK 8 or higher
Maven
Chrome or Firefox browser installed
WebDriver for Chrome or Firefox
## Getting Started
Clone the repository: git clone https:\/\/github.com\/Abhishek0O2\/selenium_java_project.git
Navigate to the project directory: cd selenium-java-project
Run the tests: mvn test
## Project Structure
src\/main\/java: Contains application code
src\/test\/java: Contains test code
src\/test\/resources: Contains test resources
pom.xml: Maven project configuration file
## Running Tests
To run the tests, simply execute mvn test in the project root directory. You can also run individual test classes using IDEs such as IntelliJ IDEA or Eclipse.
Configuration
You can configure the browser type, URL, and other settings in the src\/test\/resources\/config.properties file.
Reporting
TestNG generates test reports in the target\/surefire-reports directory. You can view the HTML reports to see test results.
## Contributing
Pull requests and contributions are welcome. For major changes, please open an issue first to discuss what you would like to change.
