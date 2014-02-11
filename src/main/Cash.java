package main;

//-----------------------------------------------------------------------------
public class Cash {

	private int[] currency;
	
	// ------------------------------------------------------------------------
	public Cash(int[] newCurrency) {
		this.currency = newCurrency;
	}
	
	// ------------------------------------------------------------------------
	public void setCurrency(int[] newCurrency) {
		this.currency = newCurrency;
	}
	
	// ------------------------------------------------------------------------
	public int[] getCurrency() {
		return this.currency;
	}
	
	// ------------------------------------------------------------------------
	public int makeChange(int value) {
		if (value <= 0) {
			return 0;
		}
		
		int result = 0;
		int remainVal = value;
		int billIndex = this.currency.length;
		
		while (remainVal > 0) {
			// If the biggest bill is smaller than the number we give the bill
			if (this.currency[billIndex - 1] <= remainVal) {
				// we recover how many time the bill is inside the remainValue
				int res = remainVal / this.currency[billIndex - 1];
				result += res;
				remainVal -= (res*this.currency[billIndex - 1]);
			}
			// We go to the next smaller bill
			else {
				billIndex --;
			}
		}
		
		return result;
	}
	
	// ------------------------------------------------------------------------
	public static void main(String[] args) {
		int[] currency = {1,5,10,20,50,100};
		Cash cashObj = new Cash(currency);
		
		System.out.print("makeChange for $135 \n");
		int result = cashObj.makeChange(135);
		System.out.print("Result is : " + result + "\n");
	
	}
}
