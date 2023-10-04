
import java.util.Arrays;
import java.util.List;


	
	public class Main {

		public static void main(String[] args)
		{
			List<A> lst = Arrays.asList(
					new A(1, "Prince"),
					new A(2, "Busi")
					);
			for(A i : lst) {
				System.out.println(i);
			}
		}

	}

	class A
	{
		private Integer id;
		private String name;
		public A(Integer id, String name) 
		{
			this.name = name;
			this.id = id;
		}
		
		public String toString() {
			return " " + id + " __" + name  ;   
		}
		
		
	}



