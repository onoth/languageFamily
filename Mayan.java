package testGround;

class Mayan extends Language {
		//private static final String Speakers = null;
	    int speakers;
	    String languageName;


		public Mayan(String languageName, int speakers) {
			super(languageName, speakers, "Central America", "verb-object-subject");
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

