package dailypractice;

public class RemoveString {
	
	public static String remove(String base, String remove) {

		  return base.replaceAll(getRegExp(remove), "");
		}

		private static String getRegExp(String remove) {

		  StringBuilder regExp = new StringBuilder();

		  for (Character caracter : remove.toCharArray()) {
		    regExp.append("[").append(Character.toLowerCase(caracter))
		      .append(Character.toUpperCase(caracter)).append("]");
		  }

		  return regExp.toString();
		}

	public static void main(String[] args) {
		System.out.println(remove("Hello there", "llo"));
		
	}

}
