#### TODO

* NOTES.md document missing but referenced here

# Cross-origin resource sharing (CORS)
### *Pedestal demonstration sample application*

In this project we will demonstrate how one could proceed to create an app that
allows for [cross-origin resource sharing][wiki-cors], a situation where XMLHttpRequests
from domains other than the one the JS originated from, are permitted.

In order to fully demonstrate this feature, we must start not one, but two running
instances of this application on both ports `8080` and `8081`. A static page with
embedded javascript is served from <http://localhost:8080/js>, and it consumes an
SSE (server-sent events) EventSource found at the page being served from the
<http://localhost:8081/> domain.

1. Start the two instances on different ports by issuing the following commands
    in the terminal emulator / console window: `lein run 8080` and `lein run 8081`

1. Open the Javascript console, as all output from the sample will be displayed there.
    We'll assume that you know where to find it on your browser of choice.

1. Visit <http://localhost:8080/js> to load the event consumer, and watch the JavaScript
    console. The inline JavaScript returned will attempt to access a service on port 8081,
    a different origin. If allowed, the event source passes back an event containing the
    thread id, which is consumed and displayed in the console.

In the file `src/cors/service.clj`, you will find a definition of `cors-interceptor` that
adds CORS headers to the web server, when the origin matches the authorized origin.

In that same map you can also define the file-system path where the server should look for
resources to host. So in case you want to host additional assets, HTML/CSS/JS or other files,
you can place these in the `resources/public` folder of this project. Notice the `public/`
portion of the path can be changed, here in `service.clj` while the resources-path bit gets
defined in the `project.clj` file under a key of that same name.

<!--MISSING For more detailed information, please consult the `NOTES.md` document alongside this README.-->

## Credits and acknowledgements

This samples uses the `EventSource` polyfill from [Yaffle/EventSource][es]

## Logging configuration

To configure logging see config/logback.xml. By default, the app logs to stdout and logs/.
To learn more about configuring Logback, read its [documentation][logback].

## Additional resources

* [Other examples](https://github.com/pedestal/samples)


## License

*Copyright 2013 Relevance, Inc.*

The use and distribution terms for this software are covered by the
Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
which can be found in the file epl-v10.html at the root of this distribution.

By using this software in any fashion, you are agreeing to be bound by
the terms of this license.

You must not remove this notice, or any other, from this software.

[wiki-cors]: <http://en.wikipedia.org/wiki/Cross-origin_resource_sharing>
[wiki-sse]: <http://en.wikipedia.org/wiki/Server-sent_events>
[es]: <https://github.com/Yaffle/EventSource>
[logback]: <http://logback.qos.ch/documentation.html>