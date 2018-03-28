(ns headlong-lurk-geolog-settee.intro
  (:require [devcards.core :as rc :refer-macros [defcard]]
            [headlong-lurk-geolog-settee.ui.components :as comp]))

(defcard SVGPlaceholder
  "# SVG Placeholder"
  (comp/ui-placeholder {:w 200 :h 200}))
