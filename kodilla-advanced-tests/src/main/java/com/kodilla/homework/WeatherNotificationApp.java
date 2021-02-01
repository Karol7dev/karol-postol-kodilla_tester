//package com.kodilla.homework;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class WeatherNotificationApp {
//    Map<WeatherLocation, Set<WeatherSubscriber>> subscriptions = new HashMap<>();
//
//    public void  subscribe(WeatherLocation location, WeatherSubscriber subscriber) {
//        Set<WeatherSubscriber> locationSubscribers = subscriptions.get(location);
//        if (locationSubscribers == null) {
//            locationSubscribers = new HashSet<>();
//            locationSubscribers.add(subscriber);
//            subscriptions.put(location, locationSubscribers);
//        } else {
//            locationSubscribers.add(subscriber);
//        }
//    }
//
//    public boolean locationExists(WeatherLocation location) {
//
//    }
//
//    public boolean locationExists(WeatherLocation location) {
//        return subscriptions.containsKey(location);
//    }
//
//    /*
//     * Send notification only to subscribers in particular location.
//     */
//    public void sendNotification(WeatherLocation location, WeatherNotification notification) {
//        for (Map.Entry<WeatherLocation, Set<WeatherSubscriber>> entry: subscriptions.entrySet()){
//            if(entry.getKey().equals(location)){
//                for(WeatherSubscriber subscriber: entry.getValue()){
//                    subscriber.receive(notification);
//                }
//            }
//        }
//    }
//
//    /*
//     * Send notification to all subscribers from all locations.
//     */
//    public void sendNotification(WeatherNotification notification) {
//        Set<WeatherSubscriber> notifiedSubscribers = new HashSet<>(); // used to keep track of notified customers to avoid notification dupliation
//        for(Map.Entry<WeatherLocation, Set<WeatherSubscriber>> entry: subscriptions.entrySet()){
//            for(WeatherSubscriber subscriber: entry.getValue()){
//                if(!notifiedSubscribers.contains(subscriber)){
//                    subscriber.receive(notification);
//                    notifiedSubscribers.add(subscriber);
//                }
//            }
//        }
//    }
//
//    public boolean isSubscriberSubscribedToGivenLocation(WeatherLocation location, WeatherSubscriber subscriber){
//        if(subscriptions.containsKey(location)){
//            Set<WeatherSubscriber> locationSubscribers = subscriptions.get(location);
//            return locationSubscribers.contains(subscriber);
//        }
//        return false;
//    }
//
//    // returns all locations to which subscriber is subscribed
//    public Set<WeatherLocation> getSubscriberLocations(WeatherSubscriber subscriber){
//        Set<WeatherLocation> subscribedLocations = new HashSet<>();
//        if(subscriptions.size() > 0){
//            for (Map.Entry<WeatherLocation, Set<WeatherSubscriber>> entry: subscriptions.entrySet()){
//                for(WeatherSubscriber sub : entry.getValue()){
//                    if(sub.equals(subscriber)){
//                        subscribedLocations.add(entry.getKey());
//                    }
//                }
//            }
//        }
//        return subscribedLocations;
//    }
//
//    public boolean unsubscribe(WeatherLocation location, WeatherSubscriber subscriber) {
//        if(subscriptions.size() > 0){
//            if(subscriptions.containsKey(location)){
//                if(subscriptions.get(location).contains(subscriber)){
//                    if(subscriptions.get(location).remove(subscriber)){
//                        return true;
//                    }
//                } else {
//                    return false;
//                }
//            }
//        }
//        return false;
//    }
//
//    public void unsubscribe(WeatherSubscriber subscriber){
//        if(subscriptions.size() > 0){
//            for(Map.Entry<WeatherLocation, Set<WeatherSubscriber>> entry: subscriptions.entrySet()){
//                unsubscribe(entry.getKey(), subscriber);
//            }
//        }
//    }
//
//    public void removeLocation(WeatherLocation location){
//        if(subscriptions.size() > 0){
//            if(subscriptions.containsKey(location)){
//                subscriptions.remove(location);
//            }
//        }
//    }
//}