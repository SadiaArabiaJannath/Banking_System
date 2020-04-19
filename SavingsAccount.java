class SavingsAccount extends Account{

	SavingsAccount(String name ,float balance){
		super(name , balance);
	}
	public float deposite(int amount){
		super.balance = super.balance + amount;
		return balance;
	}
	public void changeInterest(float interest){
		super.interest = interest;
	}
	public void addInterest(int year){
		for(int i = 1 ; i<=year ; i++){
			this.balance = balance + balance/100 * this.interest;
		}
	}
	public void withdraw(int amount){
		if((super.balance-amount)>=100){
			super.balance = super.balance-amount;
		}
		else{
			System.out.println("Must have at least 100$ amount remaining after withdrawal \nEnter a smaller amount");
		}
	}
}