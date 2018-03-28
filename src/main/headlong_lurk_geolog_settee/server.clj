(ns headlong-lurk-geolog-settee.server
  (:require
    [fulcro.easy-server :refer [make-fulcro-server]]
    ; MUST require these, or you won't get them installed.
    [headlong-lurk-geolog-settee.api.read]
    [headlong-lurk-geolog-settee.api.mutations]))

(defn build-server
  [{:keys [config] :or {config "config/dev.edn"}}]
  (make-fulcro-server
    :parser-injections #{:config}
    :config-path config))



