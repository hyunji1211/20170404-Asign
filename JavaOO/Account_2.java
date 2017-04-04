package salaryman;

	public class Account_2 {
		private String owner;
		private long balance;

		public Account_2(String owner) {
			this.owner = owner;
		}

		public Account_2(long balance) {
			this.balance = balance;
		}

		public Account_2(String owner, long balance) {
			this(owner);
			this.balance = balance;
		}
		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public long getBalance() {
			return balance;
		}

		public void setBalance(long balance) {
			this.balance = balance;
		}
		
		public long deposit(long amount) {
			return this.balance += amount;
		}
		
		public long withdraw(long amount) {
			return this.balance -+amount;
		}

		public static void main(String[] args) {
			Account_2 act = new Account_2("", 100000);
			act.deposit(1000000);
			act.withdraw(500000);
			act.deposit(200000);
			act.withdraw(200000);
			System.out.printf("%d %n",act.getBalance());

		}

	}
