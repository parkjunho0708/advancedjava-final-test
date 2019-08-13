package prob03;

public class Money {
	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		return new Money(amount + money.getAmount());
	}

	public Money minus(Money money) {
		return new Money(amount - money.getAmount());
	}

	public Money multiply(Money money) {
		return new Money(amount * money.getAmount());
	}

	public Money devide(Money money) {
		return new Money(amount / money.getAmount());
	}

	@Override
	public boolean equals(Object money) {
		if (money instanceof Money) {
			return (((Money) money).getAmount() == amount);
		}
		return false;
	}

}
