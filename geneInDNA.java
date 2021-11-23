/**
 * Description: In DNA gene starts with the start codon-"ATG" and ends with the 
 * end codon- "TAA". And gene is the sequence of characters in between start and
 * end codon and including them.
 * 
 * @author (Saimon Ahmed) 
 * @version (11/23/2021)
 */
public class FindingGeneInDNA {
    
    public String findGeneInDNA(String dna) {
        int startIndex = dna.indexOf("ATG"); // find the start codon
        if (startIndex == -1) { // N0 "ATG"
            return "";
        }
        int endIndex = dna.indexOf("TAA", startIndex+3);
        if (endIndex == -1) { // NO "TAA"
            return "";
        }
        return dna.substring(startIndex, endIndex+3);
    }
    
    public void testFindGeneInDNA() {
        String dna = "CCTTAAATGCCTAATCGTAA";
        String gene = findGeneInDNA(dna);
        System.out.println("Gene in this DNA is " + gene);
        
        
    }    
    

}
