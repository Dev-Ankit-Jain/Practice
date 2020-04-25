package ArrayAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
	
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());

		while (testCases-- > 0) {
			int size = Integer.parseInt(reader.readLine());
			String[] elements = reader.readLine().split(" ");
			StringBuffer sb = new StringBuffer();
			for(int i=elements.length-1; i>=0;i--) {
				sb.append(elements[i] + " ");
			}
			System.out.println(sb);
		}
	}

}
