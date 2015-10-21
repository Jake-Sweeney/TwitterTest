package main.java;

import twitter4j.*;

/**
 * Created by Jake on 21/10/2015.
 */
public class TwitterQuery {

    private Twitter twitter;

    public TwitterQuery(Twitter twitter) {
        this.twitter = twitter;
    }

    public void searchQuery(String searchQuery) {
        try {
            Query query = new Query(searchQuery);
            query.setCount(150);
            QueryResult queryResult;
            queryResult = twitter.search(query);
            int count = queryResult.getCount();

            System.out.println("*************" + count);
            for(Status status : queryResult.getTweets()) {
                System.out.println("@" + status.getUser().getScreenName()
                        + " tweeted:\n" + status.getText()
                        + "\nGeoLocation: " + status.getGeoLocation()
                        + "\nPlace: " + status.getPlace()
                        + "\nUser: " + status.getUser()
                        + "\nFavourite Count: " + status.getFavoriteCount()
                        + "\nSource:"  + status.getSource());
                System.out.println("\n\n");
            }
        } catch(TwitterException e) {
            e.printStackTrace();
        }
    }

}
