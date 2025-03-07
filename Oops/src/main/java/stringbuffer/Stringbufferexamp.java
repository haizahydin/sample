package stringbuffer;

public class Stringbufferexamp {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("java");
		System.out.println(s);
		s.append(" is simple");
		System.out.println(s.capacity());
		System.out.println(s);
		s.insert(8,"powerful ");
		System.out.println(s);
		s.delete(5,10);
		System.out.println(s);
		System.out.println(s.capacity());
		s.replace(0,3,"python");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.capacity());

	}

}
