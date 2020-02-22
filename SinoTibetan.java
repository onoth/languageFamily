package testGround;

public class SinoTibetan extends Language {
	
	int speakers;
    String languageName;


	public SinoTibetan(String languageName, int speakers) {
		super(languageName, speakers, "Asia", "subject-object-verb");
			if (languageName.contains("Chinese")) {
				this.wordOrder = "subject-verb-object";}
		this.languageName = this.name;
		this.speakers = this.numSpeakers;
}


	@Override
	public void getInfo() {
	System.out.println(languageName + " is spoken by " + speakers + " people mainly in " + regionsSpeaker + ".");
	System.out.println("The language follows the word order: " + wordOrder);
	System.out.println("Fun fact: " + languageName + " is an ergative language.");
	}
	

}
