// importing Arrays package
import java.util.Arrays;

public class Newsfeed {

    // constructor for the NewsFeed class 
    public Newsfeed(){
    }

    // getTopics will return an array of Strings that holds the topics 
    public String[] getTopics(){
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }

    public static void main(String[] args){
        // creating NewsFeed object 
        Newsfeed sampleFeed = new Newsfeed();
        // creating an array that holds the topics 
        String[] topics = sampleFeed.getTopics();
        // printing out the topics by calling the Arrays.toString method
        System.out.println(Arrays.toString(topics));
    }
}
