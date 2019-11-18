//Author: Sungdong Kim
//PID: 730203629
//I pledge the UNC and COMP290 Honor Code
package comp290;

import java.util.Scanner;


class Jrep{
        public static void main(String arg[]) {
		String pattern = arg[0];
                Scanner s = new Scanner(System.in);
		if(arg[0].equals("--help")) {
			System.out.print("Usage: jrep[PATTERN]");
			System.exit(1);
		}
		if(arg[0] == null) {
			System.out.print("Usage: jrep[PATTERN]");
			System.exit(1);
		}
                while(s.hasNextLine()) {
			String curr = s.nextLine();
                        if(curr.contains(pattern)) {
                                System.out.println(curr);
                        }
                }
        }
}

