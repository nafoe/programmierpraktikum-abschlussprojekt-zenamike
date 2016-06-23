# CRC CARDS

### Package: cycle

| Class: Cycle                                 |
|----------------------------------------------|
|__Responsibility:__                           |
| Manage cycles/ phases of the test driven development, such as writing the failing test, making the test pass and refacoring the code which made the test pass.
|__Collaborators:__                             |
| AbstractCycleElement                         | 

| Class: AbstractCycleElement                  |
|----------------------------------------------|
|__Responsibility:__                           |
| Representing a single phase of the TDD cycle.
|__Collaborators:__                             |
| Cycle                                        |

| Class: Refactor extends AbstractCycleElement |
|----------------------------------------------|
|__Responsibility:__                           |
| Representing the refactor phase of the cycle.|
|__Collaborators:__                             |
| Cycle                                        |


| Class: TestFail extends AbstractCycleElement | 
|----------------------------------------------|
|__Responsibility:__                           |
| Representing the phase where the user writes a failing test.
|__Collaborators:__                             |
| Cycle                                        |

| Class: TestSucceed extends AbstractCycleElement | 
|-------------------------------------------------|
|__Responsibility:__                              |
| Representing the phase where the user writes a program which makes the test pass. 
|__Collaborators:__                               |
| Cycle                                           |

### Package: controller

| Class: AbstractController                    | 
|----------------------------------------------|
|__Responsibility:__                           |
| To handle the scenes from the fxml-files in a general way. Making the Controller work internaly different, but we can work with them the same.
|__Collaborators:__                            |
| ControllerLoader, AbstractCycleElement       |

| Class: AbstractControllerLoader              | 
|----------------------------------------------|
|__Responsibility:__                           |
| On the one side to wrap and therefore to avoid duplicating code.
|__Collaborators:__                            |
| CustomController                             |

**_NOTE:_** Classes which extend from `AbstractController` and `AbstractControllerLoader` are not listed because on the first meeting we only discussed the back-end rather than the front-end. Later on it will be added.

### Package: plugin

| Interface: Plugin                            | 
|----------------------------------------------|
|__Responsibility:__                           |
| To make it easier to develop the extensions (`babysteps`, `tracking`, `ATDD`) and use them. Through this plugin we are able to decide which information the plugins can receive and keep a smaller [cohesion](https://en.wikipedia.org/wiki/Cohesion_(computer_science))
|__Collaborators:__                            |
| PluginManager                                |

| Interface: PluginManager                     | 
|----------------------------------------------|
|__Responsibility:__                           |
| To handle the plugins.                       |
|__Collaborators:__                            |
| Plugin                                       |


| Class: PluginLoader                          | 
|----------------------------------------------|
|__Responsibility:__                           |
| Load the plugins from a specified directory  |
|__Collaborators:__                            |
| Plugin, PluginManager                        |

**_NOTE:_** Classes who implement the `PluginManager` and `Plugin` will be specified later.

### Package: util


| Class: XMLWriter                              |
|-----------------------------------------------|
|__Responsibility:__
|Wrapping the needed functionalities of [Java SAX Parser](https://docs.oracle.com/javase/tutorial/jaxp/sax/parsing.html) to write easier to XML files.
|__Collaborators:__                             |
|                                               |

| Class: XMLReader                              |
|-----------------------------------------------|
|__Repsonsibility:__
| Wrapping the needed functionalities of [Java SAX Parser](https://docs.oracle.com/javase/tutorial/jaxp/sax/parsing.html) to read easier from XML files. |
|                                               |


