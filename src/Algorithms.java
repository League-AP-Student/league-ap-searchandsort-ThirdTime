import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int totalPearls = 0;
		for (Boolean oyster : oysters) {
			if (oyster.equals(true)) {
				totalPearls++;
			}
		}
		return totalPearls;
	}

	public static double findTallest(List<Double> heights) {
		double tallest = -1;
		for (Double height : heights) {
			if (height > tallest) {
				tallest = height;
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longestWord = "";
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}

	public static boolean containsSOS(List<String> messages) {
		for (String message : messages) {
			if (message.contains("... --- ...")) {
				return true;
			}
		}
		return false;

	}

	public static List<Double> sortScores(List<Double> examScores) {
		for (int repetitionNum = 0; repetitionNum < examScores.size(); repetitionNum++) {
			double lowestNum = 9999999;
			int lowestNumIndex = 0;
			for (int i = repetitionNum; i < examScores.size(); i++) {
				if (examScores.get(i) < lowestNum) {
					lowestNum = examScores.get(i);
					lowestNumIndex = i;
				}
			}
			Double tempVal = examScores.get(repetitionNum);
			examScores.set(repetitionNum, lowestNum);
			examScores.set(lowestNumIndex, tempVal);
		}
		return examScores;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			int shortestLength = 9999999;
			int shortestLengthIndex = 0;
			for (int j = i; j < unsortedSequences.size(); i++) {
				if(unsortedSequences.get(j).length() < shortestLength) {
					shortestLength = unsortedSequences.get(j).length();
				}
			}
			String tempVal = unsortedSequences.get(i);
			unsortedSequences.set(i, unsortedSequences.get(shortestLengthIndex));
			unsortedSequences.set(shortestLengthIndex, tempVal);
		}
		return unsortedSequences;
	}
	
	public static List<String> sortWords(List<String> words) {	
		for(int i = 0; i < words.size() - 1; i++) {
			for(int j = i; j > 0; j--) {
				if(words.get(j).compareTo(words.get(j-1)) < 0) {
					String tempVal = words.get(j);
					words.set(j, words.get(j - 1));
					words.set(j - 1, tempVal);
				}
			}
		}
		return words;
	}

}
