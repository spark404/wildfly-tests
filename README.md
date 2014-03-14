Test code
=========

Just some testcode to verify correct working of WSS using JAX-WS annotations.


Deploy server
=============

mvn -pl jaxws-tests wildfly:deploy


Execute client
==============

mvn -pl jaxws-client exec:java
