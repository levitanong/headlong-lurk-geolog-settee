(ns headlong-lurk-geolog-settee.CI-runner
  (:require
    headlong-lurk-geolog-settee.tests-to-run
    [doo.runner :refer-macros [doo-all-tests]]))

;; This file is for running JS tests via karma/node for CI server
(doo-all-tests #".*-spec")
