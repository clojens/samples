; Copyright 2013 Relevance, Inc.

; The use and distribution terms for this software are covered by the
; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
; which can be found in the file epl-v10.html at the root of this distribution.
;
; By using this software in any fashion, you are agreeing to be bound by
; the terms of this license.
;
; You must not remove this notice, or any other, from this software.

(defproject chat-client "0.1.0-SNAPSHOT"
  :description "Pedestal chat application sample, client-app"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.namespace "0.2.4"]
                 [domina "1.0.1"]
                 [ch.qos.logback/logback-classic "1.0.13"]
                 [org.clojure/clojurescript "0.0-1859"]
                 [io.pedestal/pedestal.app "0.2.0"]
                 [io.pedestal/pedestal.app-tools "0.2.0"]]
  :profiles {:dev {:source-paths ["dev"]}}
  :source-paths ["app/src" "app/templates"]
  :resource-paths ["config"]
  :aliases {"dumbrepl" ["trampoline" "run" "-m" "clojure.main/main"]})
