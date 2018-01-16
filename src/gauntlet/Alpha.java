package gauntlet;

public class Alpha {
	public static void main(String[] args) {
		Beta betaObject = new Beta();
		betaObject.f();
		betaObject.g();
		
		Gamma gammaObject = new Gamma();
		gammaObject.g();
		gammaObject.h();
		
		Delta deltaObject = new Delta();
		deltaObject.publicMethod();
		//deltaObject.privateMethod();
		
		Epsilon epsilonObject = new Epsilon(10);
		System.out.println(epsilonObject.finalVariable);
		
		gammaObject = new Gamma();
		betaObject = new Gamma();
		gammaObject.f();
		betaObject.f();
		gammaObject.h();
	}
}
