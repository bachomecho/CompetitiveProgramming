import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder finalOutput = new StringBuilder();
		final int cases;
		int placeholder = 0;
		try {
			cases = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < cases; i++) {

				finalOutput.append(placeholder + "\n");
				}
			
		} catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalOutput);
	}
}

