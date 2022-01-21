# Stateful Knowledge Session using KieSession

From Drools 6.0 onwards a new approach is used to create a **Knowledge Base** and a 
**Knowledge Session**. Knowledge base is an interface that manages a set of rules and processes.
The main task of the knowledge base is to store and re-use rules because creation of rules is 
very expensive. These are commonly referred to as knowledge definitions or knowledge. Knowledge base 
provides methods for creating a Session.

The knowledge session can be of two types:

* **Stateless Knowledge Session**
* **Stateful Knowledge Session**

Stateful sessions are longer lived and allow iterative changes over time. 