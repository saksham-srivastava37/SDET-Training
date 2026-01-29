package saksham;

class PatientRegistration{
	private String id;
	private String name;
	private int age;
	private String illness;
	
	void setInfo(String id, String name, int age, String illness) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.illness = illness;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIllness() {
		return illness;
	}
	
	void Display(){
		System.out.println("Patient ID: "+id);
		System.out.println("Patient Name: "+name);
		System.out.println("Patient Age: "+age);
		System.out.println("Patient Illness: "+illness);
	}
};

abstract class Doctor{
	public String doc_name;
	public String specialization;
	
	public void docInfo(String doc_name, String specialization) {
		System.out.println("Doctor Name: "+doc_name);
		System.out.println("Specialization: "+specialization);
	}
	
//	abstract void Diagnose();
}


class DocS extends Doctor{
	void Diagnose() {
		System.out.println("Health Issue Reported");
	}
}




public class HealthcareSector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PatientRegistration pr = new PatientRegistration();
		pr.setInfo("A01","John",31,"Dengue");
		pr.Display();
		
		
		
		DocS D = new DocS();
		D.docInfo("Dr. Kapoor","Physician" );
     	D.Diagnose();
		
		

	}

}
