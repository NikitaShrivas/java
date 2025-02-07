package Com.Rays.String;

public class ParseStringsIntoPrimitiveData {

	public static void main(String[] args) {
		
		byte bt = Byte.parseByte("8");
		System.out.println("byte value " + bt);

		short s = Short.parseShort("7");
		System.out.println("short value " + s);

		int i = Integer.parseInt("6");
		System.out.println("int value " + i);

		long l = Long.parseLong("8888");
		System.out.println("long value " + l);

		float f = Float.parseFloat("8.3");
		System.out.println("float value " + f);

		double d = Double.parseDouble("6.6");
		System.out.println("double value " + d);

		boolean b = Boolean.parseBoolean("true");
		System.out.println("boolean value " + b);

		char ch = "c".charAt(0);
		System.out.println('c');

	}

}
