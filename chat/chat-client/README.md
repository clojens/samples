#### TODO

* elaborate on the prerequisites, make a general statement with follow-up links
* fix the app

# Chat Sample

This is a sample chat application consisting of both a client and server app
to establish a connection between the two and, which demonstrates the use of
Pedestal with:

* Server-Sent Events (SSE)
* Cookies
* Routing
* Interceptors

## Prerequisites

All Pedestal libraries, both server and client, must be installed.

## Usage

### Client

Assuming you are at the root of the project, change your present/current working
directory (pwd/cwd) to that of the chat application client and fire up a
Read-Eval-Print-Loop (REPL) environment, move into the development namespace and
put a watcher on the development environment files. To do this issue these
commands at the virtual terminal:

```sh
cd chat/chat-client && lein repl
```

Once the REPL environment is up, type in:

```clojure
(dev)
(watch :development)
```

The output should match `#<Namespace dev>` on the first and
```
watching [:chat-client] / :development
:ok
```
on the second message printed after evaluating those expressions.


### Server

Now open another terminal window/tab to establish the server connection. First
you need to provide some public assets that we can use for the web page, to make
a symbolic link to those files already in the client will be sufficient for our
purpose of demonstration:

```sh
cd chat/chat-server

mkdir resources && cd resources

ln -s ../../chat-client/out/public

# Note:
# on windows do: xcopy /e ..\chat-client\out\public .\resources\public

cd ..
lein repl
```

Again, while in the REPL yet this time one for the server, require the development
namespace `dev` and finally launch a web server on port 8080 of your local machine:

```clojure
(require 'dev)
(dev/start)
```

You should see log output matching what you just did, then in a browser, navigate
to <http://localhost:8080/chat-client-dev.html> where you will witness the chat
client interface.

## Logging configuration

To configure logging see config/logback.xml. By default, the app logs to stdout
and logs.

To learn more about configuring Logback, read the appliance documentation found
at <http://logback.qos.ch/documentation.html>.

## Further exploration

Provide a username for the chat session, then use the interface to send a chat
message to the server. You should see this echoed on to your local screen.
If you are playing with a friend, you will both see each other's messages.

**Note:** Your chat session with the server is cookie-based, so if you thought
about chatting with yourself this way: **you cannot chat with yourself with
multiple browser tabs open**.

As an alternative, you **can** chat with yourself by using multiple browsers or
Chrome's "Incognito Mode" which will circumvent the reading of those cookies.

## Additional resources

* [Getting Started](http://pedestal.io/documentation/)
* [Overview of how pedestal-client applications work](http://pedestal.io/documentation/application-overview/)


## License

*Copyright 2013 Relevance, Inc.*

The use and distribution terms for this software are covered by the
Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
which can be found in the file epl-v10.html at the root of this distribution.

By using this software in any fashion, you are agreeing to be bound by
the terms of this license.

You must not remove this notice, or any other, from this software.
