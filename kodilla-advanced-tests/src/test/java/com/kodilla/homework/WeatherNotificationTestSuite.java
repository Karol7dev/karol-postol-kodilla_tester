//package com.kodilla.homework;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class WeatherNotificationTestSuite {
//
//    WeatherNotificationApp notificationApp = new WeatherNotificationApp();
//    WeatherSubscriber subscriber = Mockito.mock(WeatherSubscriber.class);
//    WeatherLocation location = Mockito.mock(WeatherLocation.class);
//    WeatherNotification notification = Mockito.mock(WeatherNotification.class);
//
//    @Test
//    public void clientNotSubscribedToGivenLocationShouldNotReceiveNotification(){
//        notificationApp.sendNotification(location, notification);
//        Mockito.verify(subscriber, Mockito.never()).receive(notification);
//    }
//
//
//    @Test
//    public void clientSubscribedToGivenLocationWillReceiveNotificationAboutThatLocation(){
//        notificationApp.subscribe(location, subscriber);
//        notificationApp.sendNotification(location, notification);
//        Mockito.verify(subscriber, Mockito.times(1)).receive(notification);
//    }
//
//    @Test
//    public void allClientSubscribedToGivenLocationWillReceiveNotificationAboutThatLocation(){
//        // given
//        WeatherSubscriber subscriber1 = Mockito.mock(WeatherSubscriber.class);
//        WeatherSubscriber subscriber2 = Mockito.mock(WeatherSubscriber.class);
//        WeatherSubscriber subscriber3 = Mockito.mock(WeatherSubscriber.class);
//        WeatherLocation location2 = Mockito.mock(WeatherLocation.class);
//
//        notificationApp.subscribe(location, subscriber1);
//        notificationApp.subscribe(location, subscriber2);
//        notificationApp.subscribe(location2, subscriber3);
//        // when
//        notificationApp.sendNotification(location, notification);
//        // then
//        Mockito.verify(subscriber1, Mockito.times(1)).receive(notification);
//        Mockito.verify(subscriber2, Mockito.times(1)).receive(notification);
//        Mockito.verify(subscriber3, Mockito.never()).receive(notification);
//    }
//
//    @Test
//    public void clientNotSubscribedShouldNotReceiveNotificationSentToAllUsersOfAllLocations(){
//        notificationApp.sendNotification(notification);
//        Mockito.verify(subscriber, Mockito.never()).receive(notification);
//    }
//
//    @Test
//    public void allUsersShouldReceiveNotificationSentToAllUsersFormAllLocations(){
//        WeatherSubscriber subscriber2 = Mockito.mock(WeatherSubscriber.class);
//        WeatherSubscriber subscriber3 = Mockito.mock(WeatherSubscriber.class);
//        WeatherSubscriber subscriber4 = Mockito.mock(WeatherSubscriber.class);
//
//        WeatherLocation location2 = Mockito.mock(WeatherLocation.class);
//
//        notificationApp.subscribe(location,subscriber2);
//        notificationApp.subscribe(location, subscriber3);
//        notificationApp.subscribe(location2, subscriber4);
//
//        notificationApp.sendNotification(notification);
//
//        Mockito.verify(subscriber, Mockito.never()).receive(notification);
//        Mockito.verify(subscriber2, Mockito.times(1)).receive(notification);
//        Mockito.verify(subscriber3, Mockito.times(1)).receive(notification);
//        Mockito.verify(subscriber4, Mockito.times(1)).receive(notification);
//    }
//
//    @Test
//    public void shouldAllowToRemoveLocation(){
//        // given
//        notificationApp.subscribe(location,subscriber);
//        WeatherLocation location2 = Mockito.mock(WeatherLocation.class);
//        assertTrue(notificationApp.locationExists(location)); // check if location really exists
//        // when
//        notificationApp.removeLocation(location);
//        // then
//        assertFalse(notificationApp.locationExists(location));
//    }
//
//    @Test
//    public void shouldAllowToUnsubscribeFromLocation(){
//        // given
//        WeatherSubscriber subscriber2 = Mockito.mock(WeatherSubscriber.class);
//        notificationApp.subscribe(location, subscriber);
//        notificationApp.subscribe(location, subscriber2);
//        // * just check if user is really
//        assertTrue(notificationApp.isSubscriberSubscribedToGivenLocation(location, subscriber));
//        assertTrue(notificationApp.isSubscriberSubscribedToGivenLocation(location, subscriber2));
//        // when
//        notificationApp.unsubscribe(location, subscriber);
//        notificationApp.unsubscribe(location, subscriber2);
//        // then
//        assertFalse(notificationApp.isSubscriberSubscribedToGivenLocation(location, subscriber));
//        assertFalse(notificationApp.isSubscriberSubscribedToGivenLocation(location, subscriber2));
//
//    }
//
//    @Test
//    public void shouldAllowToUnsubscribeFromAllLocations(){
//        // given
//        WeatherLocation location1 = Mockito.mock(WeatherLocation.class);
//        WeatherLocation location2 = Mockito.mock(WeatherLocation.class);
//        WeatherLocation location3 = Mockito.mock(WeatherLocation.class);
//        notificationApp.subscribe(location1, subscriber);
//        notificationApp.subscribe(location2, subscriber);
//        notificationApp.subscribe(location3, subscriber);
//        assertEquals(3, notificationApp.getSubscriberLocations(subscriber).size()); // check if client is subscribed
//        // when
//        notificationApp.unsubscribe(subscriber);
//        // then
//        assertEquals(0, notificationApp.getSubscriberLocations(subscriber).size());
//    }
//
//
//
//
//    // my extra functionalities
//
//    @Test
//    public void shouldReturnTrueIfSubscriberIsSubscribedToGivenLocation(){
//        WeatherSubscriber subscriber2 = Mockito.mock(WeatherSubscriber.class);
//        WeatherSubscriber subscriber3 = Mockito.mock(WeatherSubscriber.class); // not subscribed, should return false
//        WeatherLocation location1 = Mockito.mock(WeatherLocation.class);
//        notificationApp.subscribe(location, subscriber);
//        notificationApp.subscribe(location, subscriber2);
//        notificationApp.subscribe(location1, subscriber);
//        boolean actual1 = notificationApp.isSubscriberSubscribedToGivenLocation(location, subscriber);
//        boolean actual2 = notificationApp.isSubscriberSubscribedToGivenLocation(location, subscriber2);
//        boolean actual3 = notificationApp.isSubscriberSubscribedToGivenLocation(location, subscriber3);
//        boolean actual4 = notificationApp.isSubscriberSubscribedToGivenLocation(location1, subscriber);
//        assertTrue(actual1);
//        assertTrue(actual2);
//        assertFalse(actual3);
//        assertTrue(actual4);
//    }
//
//    @Test
//    public void shouldReturnCorrectNumberOfSubscribersSubscribedLocation(){
//        WeatherLocation location1 = Mockito.mock(WeatherLocation.class);
//        WeatherLocation location2 = Mockito.mock(WeatherLocation.class);
//        WeatherLocation location3 = Mockito.mock(WeatherLocation.class);
//        notificationApp.subscribe(location1, subscriber);
//        notificationApp.subscribe(location2, subscriber);
//        notificationApp.subscribe(location3, subscriber);
//
//        int locationsNumber = notificationApp.getSubscriberLocations(subscriber).size();
//        assertEquals(3,locationsNumber);
//
//    }
//}