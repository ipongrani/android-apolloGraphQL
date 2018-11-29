package com.ipong.rani.bluecare.firebaseNotification;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import com.ipong.rani.bluecare.MainActivity;
import com.ipong.rani.bluecare.R;

public class NotificationHelper {
    /* NotificationData publish*/
    public static void displayNotification(Context context, String title, String body) {
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder( context, MainActivity.CHANNEL_ID )
                        .setSmallIcon( R.drawable.ic_notification )
                        .setContentTitle( title )
                        .setContentText( body )
                        .setPriority( NotificationCompat.PRIORITY_DEFAULT );

        NotificationManagerCompat mNotificationMgr = NotificationManagerCompat.from( context );
        mNotificationMgr.notify( 1, mBuilder.build() );
    }






}
