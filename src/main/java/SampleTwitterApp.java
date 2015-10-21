package main.java;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

import java.util.Scanner;

/**
 * Created by Jake on 21/10/2015.
 */
public class SampleTwitterApp {

    public static void main(String[] args) {
        Twitter twitter = TwitterFactory.getSingleton();
        Scanner input = new Scanner(System.in);
        /*System.out.print("Enter user status message:\t");
        String statusMessage = input.nextLine();

        TwitterStatus twitterStatus = new TwitterStatus(twitter);
        twitterStatus.updateStatus(statusMessage);*/

        System.out.print("Enter your search query:\t");
        String searchQuery = input.nextLine();

        TwitterQuery twitterQuery = new TwitterQuery(twitter);
        twitterQuery.searchQuery(searchQuery);
    }
}
