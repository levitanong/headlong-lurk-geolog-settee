(ns headlong-lurk-geolog-settee.client-test-main
  (:require headlong-lurk-geolog-settee.tests-to-run
            [fulcro-spec.selectors :as sel]
            [fulcro-spec.suite :as suite]))

(enable-console-print!)

(suite/def-test-suite client-tests {:ns-regex #"headlong-lurk-geolog-settee..*-spec"}
  {:default   #{::sel/none :focused}
   :available #{:focused}})

