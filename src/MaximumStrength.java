import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumStrength {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder finalOutput = new StringBuilder();
		final int cases;
		try {
			cases = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < cases; i++) {
				StringTokenizer sT = new StringTokenizer(br.readLine());
				String L = sT.nextToken();
				String R = sT.nextToken();
				
				while (L.length() < R.length()) L = "0" + L;

				if (L.equals(R)) {
					finalOutput.append(0 + "\n");;
				} else{
					for (int x = 0; x < L.length(); x++) {
						if (L.charAt(x) != R.charAt(x)) {
							// subtracting ASCII value from chars to get integer at position x
							int charL = L.charAt(x) - 48;
							int charR = R.charAt(x) - 48;
							int diff = Math.abs(charL - charR);
							// System.out.println("result: " + charL + ", " + charR + ", " + diff);
							int finalSum = diff + (Math.abs(x - (L.length() - 1)) * 9);
							finalOutput.append(finalSum + "\n");
							break;
						}					
					}
				}
			}
			
		} catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalOutput);
	}
}

