; Copyright 2013 Relevance, Inc.

; The use and distribution terms for this software are covered by the
; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
; which can be found in the file epl-v10.html at the root of this distribution.
;
; By using this software in any fashion, you are agreeing to be bound by
; the terms of this license.
;
; You must not remove this notice, or any other, from this software.

(defproject template-server "0.1.0-SNAPSHOT"
  :description "Demonstrates Pedestal page rendering via different template libraries."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [io.pedestal/pedestal.service "0.2.0"]
                 [io.pedestal/pedestal.jetty "0.2.0"]
                 [ch.qos.logback/logback-classic "1.0.13"]
                 [org.slf4j/jul-to-slf4j "1.7.5"]
                 [org.slf4j/jcl-over-slf4j "1.7.5"]
                 [org.slf4j/log4j-over-slf4j "1.7.5"]
                 [hiccup "1.0.4"]
                 [enlive "1.1.4"]
                 [comb "0.1.0"]
                 [org.antlr/stringtemplate "4.0.2"]
                 [de.ubercode.clostache/clostache "1.3.1"]]
  :profiles {:dev {:source-paths ["dev"]}}
  :resource-paths ["config" "resources"]
  :main ^{:skip-aot true} template-server.server)
