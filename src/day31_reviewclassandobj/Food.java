package day31_reviewclassandobj;

class Food {
	  String flavor;
	  String nation;

	  // default constructor
	  public Food() {
	    flavor = "unknown";
	    nation = "unknown";
	  }

	  // Overload constructor
	  // Parameterize constructor
	  public Food(String flavor, String national) {
	    this.flavor = flavor; // naming convention in parameterize constructor
	    this.nation = national;// not recommend, but it's doable
	  }

	  void smell() {
	    System.out.println("Hmmm, " + flavor + " " + nation + " smell good");
	  }
	}