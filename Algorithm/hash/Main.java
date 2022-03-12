package hash;

public class Main {

	public static void main(String[] args) {
		ChainHash<Integer, String> ch = new ChainHash(13);
		int result = ch.add(1, "삼성컴퓨터");
		System.out.println(result);
		result = ch.add(1, "LG노트북");
		System.out.println(result);
		result = ch.add(14, "애플맥북");
		System.out.println(result);
		result = ch.add(14, "삼성프린터");
		System.out.println(result);
		
		ch.dump();

	}

}
