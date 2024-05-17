package programPractice;

public class ParameterConstructor {

	String animalname;
	String animaltype;
	public ParameterConstructor(String name, String type) {
	
	animalname =name;
	animaltype =type;
	}
	public void animaltype() {
		System.out.println("animal name is " + "''"+animalname +"''" +" animaltype is "+"''" +animaltype+"''");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ParameterConstructor para=	new ParameterConstructor("lion", "omivores");
		para.animaltype();
	}

}
