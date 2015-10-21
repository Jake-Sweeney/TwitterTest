package main.java;

/**
 * Created by Jake on 21/10/2015.
 */

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterStatus {

    //private String username;
    //private String password;
    private Twitter twitter;

   /* public TwitterStatus(String username, String password) {
        this.username = username;
        this.password = password;
    } */

    public TwitterStatus(Twitter twitter) {
        this.twitter = twitter;
    }


    public void updateStatus(String statusMessage) {
        try {
        Status status = twitter.updateStatus(statusMessage);
            System.out.println("Status has been updated to : "  +status.getText());
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }

}
