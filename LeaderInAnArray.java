package ArrayAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInAnArray {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());

		while (testCases-- > 0) {
			
			//Hidden 1
			//Hidden 2
			int size = Integer.parseInt(reader.readLine());
			String[] elements = reader.readLine().split(" ");
			int maxElement = Integer.parseInt(elements[size - 1]);
			List result = new ArrayList<String>();
			for (int i = size - 1; i >= 0; i--) {
				int element = Integer.parseInt(elements[i]);
				if (element >= maxElement) {
					result.add(element);
					maxElement = element;
				}
			}
			StringBuffer sb =new StringBuffer();
			for(int i=result.size()-1; i>=0; i--)
			sb.append(result.get(i)+ " ");
			
			System.out.println(sb);
		}

	}

}
