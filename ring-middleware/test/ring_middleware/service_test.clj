; Copyright 2013 Relevance, Inc.

; The use and distribution terms for this software are covered by the
; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
; which can be found in the file epl-v10.html at the root of this distribution.
;
; By using this software in any fashion, you are agreeing to be bound by
; the terms of this license.
;
; You must not remove this notice, or any other, from this software.

(ns ring-middleware.service-test
  (:require [clojure.test :refer :all]
            [clojure.data :refer [diff]]
            [io.pedestal.service.test :refer :all]
            [io.pedestal.service.http :as bootstrap]
            [ring-middleware.service :as service]
            [ring-middleware.server :as server]
            ))

(def service
  (::bootstrap/service-fn (bootstrap/create-servlet service/service)))

;(empty? (remove nil? (take 2 (diff (bootstrap/create-server)} {:a 1}))))

(deftest create-server-object
  (testing "the bare naked server object returned (not through http yet)"
    (testing "correct type and not empty"
      (is
       (not (empty? (server/create-server))))
      (is
       (map? (server/create-server)))
      )
    (testing "that no identical values can be returned"
      (is
       (not (empty?
             (remove nil? (take 2 (diff (server/create-server)
                                        (server/create-server))))))
       )
      )))


(deftest home-page-renders-correctly
  (is (.contains
       (:body (response-for service :get "/"))
       "Enter your name")))
