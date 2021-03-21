# Entwurfsmuster
design patterns implemented with Java

<!-- toc -->

- [creation pattern](#creation-pattern)
- [structure pattern](#structure-pattern)
- [behavioral pattern](#behavioral-pattern)
  * [Command pattern](#command-pattern)
    + [Intention](#intention)
    + [first impression out of definition](#first-impression-out-of-definition)
    + [motivation](#motivation)
    + [basic idea of the pattern](#basic-idea-of-the-pattern)
    + [actors](#actors)
    + [additional thoughts](#additional-thoughts)
    + [when to use](#when-to-use)

<!-- tocstop -->

## creation pattern

## structure pattern

## behavioral pattern
### Command pattern
#### intention
"Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations." - GoF

#### first impression out of definition
|part of definition| interpretation|
|--|--|
|"Encapsulate a request as an object"| isolate a request/method/invocation and wrap those as an object|
|"thereby letting you parameterize clients with different requests"| so you can make this wrapped objects parameterisable by clients for different scenarios|
|"queue or log requests"| you can concatenate an amount of wrapped request objects in a wait list to invoke them in an order. You can also log this wrapped requests |
|and support undoable operations| you also can design undo operations to this wrapped requests |
|||

#### motivation
- if you don't know about the receiver
- or you don't want to know about the receiver or receivers
- if you don't have to know about the operation 
- or you don't want to know about the operation

#### basic idea of the pattern
- a request will be store in an object
- this object can be stored and passed around like other objects
- this wrapped request object is a "command"

#### actors
|actor|responsibility| example |
|--|--|--|
|client| the guy who configures/instanciate concrete commands and sets it receiver| the user who configures the google assist commands and connects it to receiver |
|invoker|the guy who provides commands in a defined way. The guy who triggers the commands| a smarthome remote with buttons for different commands
|Command|this guy is an abstract class or interface which provides the interface-method called "execute"| kind of smarthome protocol |
|concrete command| concrete capsulated request, which enables the execution of a operations. It is the bridge between concrete receiver and requested action | turn on my AVM Fritz smart bulb or turn on my smart thermostat |
|receiver|this is a concrete class which will receive a command and executes the messages/requests from concrete command class| for example the concrete AVM Smart bulb or AVM smart thermostat |

#### additional thoughts
There are often scenarios where a client has to execute multiple commands by one invoke-operation. For Example: "I want to turn on all bulbs and set the temperature in my living room to 23 degree."

That means one invoker method will execute a series of commands. In GoF they are speaking about **macro commands**.

A macro command is also a subclass of a abstract command interface. They do not have explicit receiver, because they are executing a list of other commands. These concrete commands have their receiver. 

#### when to use
- if you need a "callback" (like in javascript) for object orientated languages. It is a object-oriented replacement for callbacks - GoF
- if you want to specify, queue and execute requests at different time
- if requests should be independent from its original request
- if you want to support an undo mechanism
- if you want to have a history list of all your executions and unexecutions
- if you want to implement transactions. Each command has the interface "execute" so every transaction has to fullfil this interface. You can easily extend your system with transactions/commands.