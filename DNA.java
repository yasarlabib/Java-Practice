public class DNA{
    public static void main(String[] args){
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
    
        // modify which DNA is being used
        String dna = dna1;
        // String dna = dna2;
        // String dna = dna3;
    
        // finding length of DNA strands 
        int length = dna.length();
        System.out.println("length: " + length);
    
        // checking if the DNA strand has the start codon 'ATG'
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);
    
        // checking if the DNA strand has the stop codon 'TGA'
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);
    
        // checking if there is a protein
        if(start != -1 && stop != -1 && (stop - start) % 3 == 0){
            String protein = dna.substring(start, stop+3);
            System.out.println("Condition 1, 2, and 3 are satisfied.");
        } 
        else{
            System.out.println("No protein.");
        }
    }
}
