import java.util.*;

public class Test {
	static void f(String[] S){
		ArrayList<String> L = new ArrayList<String>();
		int n = S.length;
		Random gen = new Random();
		for (String s : S) L.add(s);
		for (int i = 0; i<n ; i++){
			int j = gen.nextInt(L.size());
			String s = L.get(j);
			S[i] = s;
			L.remove(s);
		}
	}
	public static void main(String[] args){
		String[] names = {"ted","allice","poppy","nelson","tarra","rosie"};
		f(names);
		for (String s : names) System.out.println(s);
	}
}
