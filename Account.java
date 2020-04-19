abstract class Account{
	String name;
	float balance;
	static float interest = (float) 3.75f;
	Account(String name , float balance){
		this.name = name;
		this.balance = balance;
	}

	abstract float deposite(int amount);

	abstract void withdraw(int amount);

	abstract void changeInterest(float interest);

	abstract void addInterest(int year);
}