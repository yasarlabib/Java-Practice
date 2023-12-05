// importing Arrays package
import java.util.Arrays;

public class Newsfeed {

    // topics array
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    // view count array
    int[] views = {0, 0, 0, 0};

    // constructor for the NewsFeed class 
    public Newsfeed(){
    }

    // getTopics will return an array of Strings that holds the topics 
    public String[] getTopics(){
        return topics;
    }

    // returns the trending topic
    public String getTopTopic(){
        return topics[0];
    }

    // updates the view count 
    public void viewTopic(int topicIndex){
        views[topicIndex] = views[topicIndex] +1;
    }

    public static void main(String[] args){
        // creating NewsFeed object 
        Newsfeed sampleFeed = new Newsfeed();
        // creating an array that holds the topics 
        String[] topics = sampleFeed.getTopics();
        // printing out the topics by calling the Arrays.toString method
        System.out.println(Arrays.toString(topics));
        //displays the top topic 
        System.out.println("The top topic is "+ sampleFeed.getTopTopic());
        // viewing topics 
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);
        // displays view count of topic 
        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
    }
}
