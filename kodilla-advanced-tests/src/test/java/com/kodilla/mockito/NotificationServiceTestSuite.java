package com.kodilla.mockito;
import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class NotificationServiceTestSuite {

    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);


    @Test
    public void notSubscribedClientShouldNotReceiveNotification(){
        notificationService.sendNotification(notification); // wysylanie powiadomienia
        Mockito.verify(client, Mockito.never()).receive(notification); // sprawdzenie czy klient NIGDY nie wywola metody RECEIVE
    }

    @Test
    public void subscribedClientShouldReceiveNotification(){
        notificationService.addSubscriber(client);
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients(){
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);

        notificationService.addSubscriber(client1);
        notificationService.addSubscriber(client2);
        notificationService.addSubscriber(client3);

        notificationService.sendNotification(notification);

        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber(){
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification(){
        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }
}