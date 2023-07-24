import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ComputerGame {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder finalOutput = new StringBuilder();
		final int cases;
		try {
			cases = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < cases; i++) {
				long a[] = new long[4];
				StringTokenizer sT = new StringTokenizer(br.readLine());
				
				for (int k = 0; k < 4; k++) {
					a[k] = Integer.parseInt(sT.nextToken());
				}
				if (a[3]*a[1] >= a[0]) {
					finalOutput.append(-1 + "\n");
					continue;
				}

				long left = 0; long right = a[1];
				long answer = -1;

				while (left <= right) {
					long mid = left + (right - left)/2;
					long formula = mid*a[2] + (a[1]-mid)*a[3];
					if (formula < a[0]) {
						answer = mid;
						left = mid + 1;
					} else {right = mid - 1;}
				}
				finalOutput.append(answer + "\n");
			}
			
		} catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalOutput);
	}
}

