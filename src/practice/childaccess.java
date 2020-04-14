package practice;

public class childaccess extends Access {		
		private void method() {
				
	}
		public static void main(String[] args) {
			
			Access a = new Access();
			a.method(200);// this is protected method of Access parent class
		}

}
