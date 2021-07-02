package day16_JUnit;

public class Money {
	private int value;
	private String currency;
	
	public Money() {super();};
	public Money(int value, String currency) {
		super();
		this.value = value;
		this.currency = currency;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + value;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Money [value=" + value + ", currency=" + currency + "]";
	}
	
	public Money addMoney(Money m) throws NotSameCurrencyException {
		Money mm = new Money();
		if(m.currency != this.currency) {
			throw new NotSameCurrencyException("Different Currency !");
		}
		else {
			
			mm.value = this.value + m.value;
			mm.currency = this.currency;
		}
		return mm;
		
	}
}
