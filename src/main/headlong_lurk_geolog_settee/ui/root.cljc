(ns headlong-lurk-geolog-settee.ui.root
  (:require
    [fulcro.client.mutations :as m]
    [fulcro.client.data-fetch :as df]
    [fulcro.client.alpha.dom :as dom]
    [fulcro.client.alpha.localized-dom :as ldom]
    [headlong-lurk-geolog-settee.api.mutations :as api]
    [fulcro.client.primitives :as prim :refer [defsc]]
    [fulcro.alpha.i18n :as i18n :refer [tr trf]]))

;; The main UI of your application

(defsc Root [this props]
  (ldom/div nil "TODO"))
