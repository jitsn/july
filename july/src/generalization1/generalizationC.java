package generalization1;

public class generalizationC extends generalizationA {
	public  void asn() {
		System.out.println("asn method from generalizationA completed in generalizationC ");
	}
	public  void bns() {
	System.out.println("bns method from generalizationA completed in generalizationC");	
	}
	public  void jkh() {
		System.out.println("jkh method from generalizationA completed in generalizationC");
	}
	public static void main(String[] args) {
		//generalizationA F=new generalizationA();
		generalizationB H=new generalizationB();
		H.asn();
		H.bns();
		H.jkh();
		
		
		generalizationC K=new generalizationC();
		K.asn();
		K.bns();
		K.jkh();
		K.asn();
	}
}
