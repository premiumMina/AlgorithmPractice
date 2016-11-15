package interview;

import java.util.HashMap;
import java.util.Scanner;

public class WordComb {

	public int solution(String[] searchWord, int[] searchCount, HashMap<String, String> sameSym) {
		/*
		 * 출력할 대표 단어 수 검색단어, 검색 횟수 총합
		 */
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		result.put(searchWord[0], searchCount[0]);
		for (int i = 1; i < searchWord.length; i++) {
			if(!sameSym.containsKey(searchWord[i])){
				result.put(searchWord[i], searchCount[i]);
			}else{
			
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int searchWordCount = sc.nextInt();
		String[] searchWord = new String[searchWordCount];
		int[] searchCount = new int[searchWordCount];
		for (int idx = 0; idx < searchWordCount; idx++) {
			searchWord[idx] = sc.next();
			searchCount[idx] = sc.nextInt();
		}

		int sameWordCount = sc.nextInt();
		HashMap<String, String> sameSym = new HashMap<String, String>();
		for (int idx = 0; idx < sameWordCount; idx++) {
			sameSym.put(sc.next(), sc.next());
		}

		new WordComb().solution(searchWord, searchCount, sameSym);
	}

}
