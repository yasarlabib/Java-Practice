public class MadLibs {
  /*
  Your description here
  This program generates a mad libbed story.
  Author: Yasar
  */
  	public static void main(String[] args){
      //main character
      String name1 = "Goofy";
      //3 adjectives
      String adjective1 = "funny";
      String adjective2 = "cute";
      String adjective3 = "ugly";
      //1 verb
      String verb1 = "running";
      //6 nouns
      String noun1 = "car";
      String noun2 = "frame";
      String noun3 = "bottle";
      String noun4 = "bird";
      String noun5 = "penguin";
      String noun6 = "pen";
      //second character
      String name2 = "Bob";
      //1 number
      int number = 21;
      //1 place
      String place1 = "Kentucky";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
