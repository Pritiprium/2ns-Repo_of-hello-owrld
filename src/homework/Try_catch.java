package homework;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc";
	
		int [] a = {3,5,7};

		try {			 
		//--	s = null;
			System.out.println(s.length());	
			System.out.println(s.charAt(5));
		}
		catch (java.lang.NullPointerException n) {
			System.out.println("found null");
		}
		catch (java.lang.StringIndexOutOfBoundsException b ) {
			System.out.println("found exception");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("aaray index of a   " +a[2]);
		}
	}

}
