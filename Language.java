package testGround;

public class Language{
	  
	  // instance fields
	  protected String name;
	  protected int numSpeakers;
	  protected String regionsSpeaker;
	  protected String wordOrder;
	  
	  //constructor
	  public Language(String name, int numSpeakers, String regionsSpeaker, String wordOrder){
	    this.name = name;
	    this.numSpeakers = numSpeakers;
	    this.regionsSpeaker = regionsSpeaker;
	    this.wordOrder = wordOrder;
	  }
	  
	  public void getInfo(){
	    System.out.println(name + " is spoken by\n" +
	                      numSpeakers + " people mainly in " + regionsSpeaker + "\n"
	                      + "The language follows the word order: " + wordOrder);
	  }
	  
	  
	  public static void main(String[] args){
	    Language greek = new Language("Greek", 200000, "Europe","subject-verb-object");
	    
	    // call 
	    greek.getInfo();
	    
	    System.out.println("\n");
	    // call mayan
	    Mayan kiche = new Mayan("Ki'che'", 2330000);
	    // get info
	    kiche.getInfo();
	    
	    System.out.println("\n");
	    
	    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
	    mandarin.getInfo();
	    
	    System.out.println("\n");
	    
	    SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
	    burmese.getInfo();
	    
	  }

	}