***`This is a simple project set up using Selenium webdriver and cucumber in JAVA`

# Page Object Model (POM)
   Usage: The entire structure of the pages package.
   Explanation: The Page Object Model is a design pattern that creates a separate class for each web page. These classes contain methods that represent the services offered by the page, rather than exposing the underlying WebElements.
   Example: The HomePage class encapsulates all interactions with the home page.
   Benefits:


    - Reduces code duplication
    - Improves test maintenance
    - Enhances readability


# Factory Pattern:
   Usage: BrowserFactory class
   Explanation: The Factory pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
   Example: BrowserFactory.createDriver() method creates different types of WebDriver instances based on the browser name provided.
   Benefits:

     - Encapsulates object creation logic
     - Provides flexibility to add new browser types easily

# Singleton Pattern (Thread-safe variant)
   Usage: DriverManager class
   Explanation: The Singleton pattern ensures a class has only one instance and provides a global point of access to it. In this case, we're using a thread-safe variant with ThreadLocal.
   Example: DriverManager uses ThreadLocal<WebDriver> to ensure each thread has its own unique instance of WebDriver.
   Benefits:

    - Ensures only one instance of WebDriver per thread
    - Provides a global point of access to the WebDriver instance
    - Manages the lifecycle of the WebDriver

# Builder Pattern
   Usage: Implicitly used in the ExtentReports setup
   Explanation: The Builder pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
   Example: While not explicitly implemented in our code, the ExtentReports library uses this pattern internally when setting up reports.
   Benefits:

    - Provides a flexible solution to various object creation problems

# Strategy Pattern
   Usage: Implicit in the way Cucumber works with step definitions
   Explanation: The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently from clients that use it.
   Example: Each step definition method in classes like HomePageSteps represents a different strategy for handling a specific step in a test scenario.
   Benefits:

    - Allows for easy addition of new test steps
    - Keeps test logic separate from the test runner

# Dependency Injection
   Usage: Implicit in the way Cucumber works with step definitions and page objects
   Explanation: Dependency Injection is a technique whereby one object supplies the dependencies of another object.
   Example: While not explicitly shown in the provided code, it's common in Cucumber frameworks to use a dependency injection container (like PicoContainer) to manage the lifecycle of objects like page objects and share them between step definition classes.
   Benefits:

    - Reduces hard-coding of dependencies
    - Makes the code more modular and easier to test

# Template Method Pattern
   Usage: BasePage class
   Explanation: The Template Method pattern defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
   Example: The BasePage class provides a template for all page objects, defining common elements like WebDriver and WebDriverWait.
   Benefits:

    - Promotes code reuse
    - Allows for easy implementation of common behavior across all page objects

These design patterns work together to create a robust, maintainable, and scalable test automation framework. They promote separation of concerns, improve code reusability, and make the framework more flexible for future enhancements.


# Run
   - Command: mvn clean test -Dbrowser=chrome
