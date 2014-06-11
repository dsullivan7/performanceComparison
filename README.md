Performace Comparison between Java and Node.js
==============================================

Setup
-----

`git clone https://github.com/dsullivan7/performanceComparison.git`

Run
---

###Fibonacci

####Node
`cd node`

`node fib 42`

####Java
`cd java`

`javac fib.java`

`java fib 42`

###Multiple Requests

####Node
`cd node`

`npm install`

`node multirequest 40 http://proxyhost:proxyport`

####Java
`cd java`

`javac mulirequest.java`

`java -DproxyHost=proxyHost -DproxyPort=proxyPort multirequest 40`
