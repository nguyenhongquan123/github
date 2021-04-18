package source;
import java.util.*;
public class source {
	

		 public String GiaiPTBAC2(int a, int b, int c) {
			if (a == 0) {
				if (b == 0) {
					if (c == 0)
						return ("PT vo so nghiem:");
					else
						return ("PT vo nghiem:");
				} else
					return("PT co 1 nghiem la x=" + (-c / b));
			} else {
				double x1, x2;
				double delta = Math.pow(b, 2) - 4 * a * c;
				if (delta < 0)
					return("PT vo nghiem");
				else if (delta > 0) {
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					return("PT co nghiem x1=" + x1) +("PT co nghiem x2=" + x2);
				} else
					return("PT co nghiem kep x1=x2=" + (-b / (2 * a)));
			}
		}
		 public String checkNguyenTo(int n){
			  if(n<=2){
			    return ("Yes");
			  }else {
			   for(int i =2;i<=Math.sqrt(n);i++){
				   if(n % i == 0)
					   return ("No");
			   }
			  }
			  return ("Yes");
		}
		public String GiaiPTBAC1(int aNumber, int bNumber) {
			if (aNumber == 0) {
	            if (bNumber == 0) {
	                return ("VSN");
	            } else {
	                return ("VN");
	            }
	        } else {
	            double nghiem = (double) -bNumber / aNumber;   // 
	            return Double.toString(nghiem);
	        }
		}
		public String checkSDX(int number) {
			int script=number;
			int x=0;
			while(script!=0) {
				x=(x*10)+script%10;
				script=script/10;
			}
			if(x==script) {
				return ("Yes");
			}
			return ("No");
		}

	}
