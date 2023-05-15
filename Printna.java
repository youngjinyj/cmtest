package fileInterface;

import java.util.Calendar;
import java.util.Locale;

public class Printna {

	public static void main(String[] args) {
		long n = 461012;
		System.out.format("%d%n",n);
		System.out.format("%08d%n",n);
		System.out.format("%+8d%n",n);
		System.out.format("%,8d%n",n);
		System.out.format("%+,8d%n%n",n);
		
		double pi = Math.PI;
		System.out.format("%f%n",pi);
		System.out.format("%.3f%n",pi);
		System.out.format("%10.3f%n",pi);
		System.out.format("%-10.4f%n%n",pi);
		System.out.format(Locale.FRANCE,"%-10.4f%n%n",pi);
		
		Calendar c = Calendar.getInstance();
		System.out.format("%tB%te,%tY%n",c,c,c);
		System.out.format("%tl:%tM,%tp%n",c,c,c);
		System.out.format("%tD%n",c);
		System.out.println("git hub 변경 관리를 위해 추가함");
	}

}
