# helloworld-app

This app is structured differently than most pedestal-app applications in that
behavior, rendering, templates and start are all collapsed into start. This was
done just to demonstrate a more compact application as opposed to the regular
plugin generates ones which normally, using `lein new pedestal-app ...` commands,
contain several files to harbor these codebits.

## Usage

First step is to open a terminal window on your machine, then issue the
following command inside this project root folder:

```
lein repl
```

Next, while inside the REPL environment, evaluate these expressions:

```clojure
(require 'dev)
(dev/start)
```

You should observe a `nil` on the first and `:ok` output on the second expression,
this means you have successfully started the web server and can now browser to
<http://localhost:3000/helloworld-app-dev.html>.

To explore more about the app, including topics such as the Data UI or the Render,
visit <http://localhost:3000/> to, e.g. take a look at the tools available to you
(right hand bottom menu, the menu becomes visible only on mouse over).

## Other resources / references

* [Getting Started](https://github.com/pedestal/pedestal/tree/master/app#usage)
* [Overview of how pedestal applications work](http://pedestal.io/documentation/application-overview/)

## License

*Copyright 2013 Relevance, Inc.*

The use and distribution terms for this software are covered by the
Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
which can be found in the file epl-v10.html at the root of this distribution.

By using this software in any fashion, you are agreeing to be bound by
the terms of this license.

You must not remove this notice, or any other, from this software.