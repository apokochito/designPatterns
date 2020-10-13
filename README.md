# designPatterns

A repository with different design of patterns on Java

1. Singleton (**master branch**)

    Description
    
    - This is useful when exactly one object is needed to coordinate actions across the system. The term comes from the mathematical concept of a singleton. Others design patterns can use it like abstract factory, builder and prototype.
    
    Implementation
    
    - Ensure only one instance of the singleton class ever exists.
    - Provide global access to that instance.
  
    Advantage
  
    - Saves memory because object is not created at each request. Only single instance is reused again and again.
  
    Usage
  
    - Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.
    
    Code
    
    In **eager** initialization, the instance of Singleton Class is created at the time of class loading, but it has a drawback that instance is created even though client application might not be using it.

2. Factory

    Description

    - In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

3. Strategy

4. Adapter

5. Proxy

6. Initialization on demand holder

7. Builder

8. Template

9. Chain of responability

10. State

11. Observer
