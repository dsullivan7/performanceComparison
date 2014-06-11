Performace Comparison between Java and Node.js
==============================================

Setup
-----

`git clone https://github.com/dsullivan7/performanceComparison.git`

Run
---

Fibonacci

```cd node
node fib 42
```

```cd java
javac fib.java
java fib 42
```

Multiple Requests

```cd node
node multirequest 40 http://proxyhost:proxyport
```

```cd java
javac mulirequest.java
java -DproxyHost=proxyHost -DproxyPort=proxyPort multirequest 40 
```
