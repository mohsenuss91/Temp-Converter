/**
 * This class is used to convert Celcius to Fahrenheit and vice versa
 * @author Conor McAvinue
 *
 *
 */
public class Convert {
	Convert() {
		
	}
	/**
	 * This method takes in a temperature in Celsius and converts it to Fahrenheit
	 * @param CelTemp
	 * @return FahrTemp
	 */
	public int CelToFahr(int CelTemp){
		int FahrTemp = Math.round((CelTemp*9)/5 + 32);
		return FahrTemp;
	}
	/**
	 * This method takes in a temperature in Fahrenheit and converts it to Celsius
	 * @param FahrTemp
	 * @return CelTemp
	 */
	public int FahrToCel(int FahrTemp){
		int CelTemp = Math.round((FahrTemp-32)*5/9);
		return CelTemp;
	}
}
