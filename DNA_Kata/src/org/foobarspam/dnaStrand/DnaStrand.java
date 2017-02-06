package org.foobarspam.dnaStrand;
public class DnaStrand {

		  public static String makeComplement(String dna) {
		    //Your code
		    //A complement T
		    //C complement G
		    String complemented = "";
		    String gatc = "ATGC";
		    for(int i=0; i<dna.length(); i++)
		    {
		    if(dna.charAt(i) == gatc.charAt(0))
		    {complemented+="T";}
		    
		    else if(dna.charAt(i) == gatc.charAt(1))
		    {complemented+="A";}

		    else if(dna.charAt(i) == gatc.charAt(2))
		    {complemented+="C";}
		    
		    else
		    {complemented+="G";}
		    }
		    return complemented;
		}
		
}
