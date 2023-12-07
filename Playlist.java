// importing ArrayList package 
import java.util.ArrayList;

class Playlist {
    public static void main(String[] args) {
        // creating ArrayList object 
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        // adding songs to the ArrayList 
        desertIslandPlaylist.add("Kaise Hua");
        desertIslandPlaylist.add("Saari Duniya Jaale Denge");
        desertIslandPlaylist.add("Vaaste");
        desertIslandPlaylist.add("O Saathi");
        desertIslandPlaylist.add("Nai Lagda");
        desertIslandPlaylist.add("Nayan");
      
        // printing out initial playlist 
        System.out.println(desertIslandPlaylist);
        // printing size of initial playlist
        System.out.println(desertIslandPlaylist.size());
        // removing the 5th song in the playlist 
        desertIslandPlaylist.remove(4);
      
        // System.out.println(desertIslandPlaylist);
        // System.out.println(desertIslandPlaylist.size());

        // swapping songs in the playlist 
        int songA = desertIslandPlaylist.indexOf("Kaise Hua");
        int songB = desertIslandPlaylist.indexOf("Vaaste");
        String tempA = "Kaise Hua";  
        desertIslandPlaylist.set(songA, "Vaaste");
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(songB, tempA);
        System.out.println(desertIslandPlaylist);
      }
  
}
