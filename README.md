Nucleus Question
================

This is the Question handler for Project Nucleus. 

This project contains just one main verticle which is responsible for listening for resource address on message bus. 

DONE
----
* Configured listener
* Provided a initializer and finalizer mechanism for components to initialize and clean up themselves
* Created a data source registry and register it as component for initialization and finalization
* Provided Hikari connection pool from data source registry
* Processor layer is created which is going to take over the message processing from main verticle once message is read
* Logging and app configuration
* Provide implementations for CRUD handlers using Active JDBC

TODO
----
* Harden the implementation with respect to validation of JSON data types while creating and updating, including but not limited to taxonomy, dok, answers etc
* Provide not null constraint validator before going to DB. Currently it is done at DB
* While deleting a question, if the deleted question is open ended, then if there is no open ended question left, change grading type of assessment


To understand build related stuff, take a look at **BUILD_README.md**.


