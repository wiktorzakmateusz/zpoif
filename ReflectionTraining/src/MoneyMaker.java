

public class MoneyMaker {
	private int balance;
	private String nick;
	public boolean isOld;
	
	
	public MoneyMaker(int balance, String nick, boolean isOld) {
		super();
		this.balance = balance;
		this.nick = nick;
		this.isOld = isOld;
	}

	public MoneyMaker() {
		balance = 6156;
		nick = "Incognito";
		isOld = false;	
	}
	
	public MoneyMaker(int balance, String nick) {
		this.balance = balance;
		this.nick = nick;
		isOld = false;
	}
	
	
	public void increaseBalance(int profit) {balance += profit;}
	
	private void setNick(String nick) {this.nick = nick;}

	public void setOld(boolean isOld) {this.isOld = isOld;}

	@Override
	public String toString() {
		return "I am " + nick + ", My balance is " + balance + ". Am I old? " + isOld; 
	}
}
	
	
