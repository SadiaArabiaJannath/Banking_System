class CurrentAccount extends Account{

	CurrentAccount(String name , float balance){
		super(name , balance);
	}
	public void changeInterest(float interest){
		super.interest = interest;
	}
	public void addInterest(int year){
		for(int i = 1 ; i<=year ; i++){
			super.balance = balance + balance/100 * super.interest;
		}
	}
	public float deposite(int amount){
		super.balance = super.balance+amount;
		return balance;
	}
	public void withdraw(int amount){
		this.balance = this.balance - amount;
	}
}