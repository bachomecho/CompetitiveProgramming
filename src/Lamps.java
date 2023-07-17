import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Lamps {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder finalOutput = new StringBuilder();
		final int cases;
		try {
			cases = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < cases; i++) {
				int q = Integer.parseInt(br.readLine());
				long finalSum = 0;
				Map<Long, List<Long>> pairsMap = new HashMap<>();
				for (int l = 0; l < q; l++) {
					StringTokenizer sT = new StringTokenizer(br.readLine());

					long aValue = Long.parseLong(sT.nextToken());
					long bValue = Long.parseLong(sT.nextToken());

					List<Long> bList = pairsMap.getOrDefault(aValue, new ArrayList<>());
					bList.add(bValue);
					pairsMap.put(aValue, bList);
				}
				
				for (Map.Entry<Long, List<Long>> set: pairsMap.entrySet()) {
					List<Long> bList = set.getValue();
    				bList.sort(Collections.reverseOrder());

					if (set.getKey() > bList.size()) {
						for (int m = 0; m < bList.size(); m++) finalSum += bList.get(m);
					} else{
						for (int m = 0; m < set.getKey(); m++) finalSum += bList.get(m);
					}
				}
				finalOutput.append(finalSum + "\n");
			}
		} catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalOutput);
	}
}

