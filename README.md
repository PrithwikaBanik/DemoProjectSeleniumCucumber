This framework uses several design patterns to enhance the structure, maintainability, and scalability of the test automation setup:

- Page Object Model (POM): Organizes web pages into classes that provide methods for interacting with the page, reducing duplication and improving readability.
  
- Abstract Factory Pattern: Applied in `BrowserFactory`, it centralizes object creation logic for WebDriver instances, allowing flexibility in adding new browsers.
  
- Thread-Safe Singleton Pattern: Used in `DriverManager`, ensures each thread has its own WebDriver instance, managing the lifecycle of WebDriver effectively.

- Fluent Builder Pattern: Employed in the `ExtentReports` setup, this pattern constructs complex objects step-by-step, adding flexibility in configuration.

- Strategy Pattern: Implicitly utilized in Cucumber step definitions, allows interchangeable handling of test scenarios while keeping logic separate from the test runner.

- Dependency Injection: Manages lifecycle and sharing of objects (like page objects) between classes, improving modularity and reducing hard-coded dependencies.

- Template Method Pattern: Applied in `BasePage`, provides a reusable structure for common elements across page objects.

These patterns collectively reduce redundancy, improve test maintenance, and make the framework flexible for future enhancements. Use the command `mvn clean test -Dbrowser=chrome` to run tests.
