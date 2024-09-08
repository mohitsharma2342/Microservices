# Spring 
 
Spring Bean is nothing special, any object in the Spring framework that we initialize through Spring container is called Spring Bean.


The IoC container is responsible to instantiate, configure and assemble the objects.
In this we basically we give the control to framework to creation of the object 


@Component annotation indicates to the Spring framework that this is a Java bean and it should be registered for component scanning so that it can be injected into other beans when required.

 @RestController Annotation is a specialized version of @Controller and it signifies that this class is a CONTROLLER and inside it, end-points are defined and these end-points return data either in JSON or XML Format.

Dependency Injection (DI) it’s one of the most common principles of modern software development and it allows us to achieve the principle of Inversion Of Control (IoC) i.e. shifting the creation, management and the lifecycle of objects from the programmer to the framework.


Can you explain the different types of autowiring in Spring?
Spring supports several types of autowiring including by type, by name, constructor, and autodetect. 
The default mode of the @Autowired is byType.
@Autowired typically uses by type, but it can work in conjunction with @Qualifier to specify by name.


Bean Scopes refers to the lifecycle of Bean that means when the object of Bean will be instantiated, how long does that object live, and how many objects will be created for that bean throughout. Basically, it controls the instance creation of the bean and it is managed by the spring container.

Singleton: Single bean instance per Spring IoC container.
Prototype: A new bean instance is created every time a bean is requested.

Request: Only a single instance will be created and available during the complete lifecycle of an HTTP request
Session: Only a single instance will be created and available during the complete lifecycle of an HTTP Session..
Global-Session: Scopes a single bean definition to the lifecycle of a global HTTP Session. It is also only valid in the context of a web-aware Spring ApplicationContext.


Spring Boot Actuator — To enable our project to be monitored by the EUREKA server and any other monitoring tools will be able to ping this service’s uptime.