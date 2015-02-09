import java.math.BigDecimal;
import java.util.Currency;
import java.util.Scanner;


public class Money {
	BigDecimal  value;
	Currency currency;
	
	public Money(BigDecimal value, Currency currency){
		this.value = value;
		this.currency = currency;
	}
	public BigDecimal getValue() {
		return value;
	}
	public static Money parse(String moneyString){
		Scanner s = new Scanner(moneyString);
		String valueString = s.next();
		String currencyString = s.next();
		
		BigDecimal value = new BigDecimal(valueString);
		Currency currency = Currency.getInstance(currencyString);
		
		return new Money(value,currency);
	}
	
	public Currency getCurrency() {
		return currency;
	}
	@Override
	public String toString() {
		return String.format("%s,%s", value, currency.getSymbol());
	}
	

}
