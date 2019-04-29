(ns demo.core
  (:require [reagent.core :as reagent]
            ["react-dropzone" :default Dropzone]))

(defn- root-el []
  [:> Dropzone {:on-drop #(js/alert "DROP")}
   [:div "YO"]])

(defn mount-root []
  (reagent/render [root-el]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (mount-root))
