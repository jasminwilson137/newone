package corejava;

public class CmdlLineArgs 
{
	public static void main(String[] args) {
		//for (int i= 0;  i < args.length; i++) {
			//System.out.println(args[i]);
		//}
		int total=0;
		for (String s : args) {
			total = total + Integer.parseInt(s);
		}
		System.out.println("Total:" +total);
		
		int x=10; //primitive variable
		Integer obj = x;
		int z=obj;
		
		System.out.println(x+obj *z);
	}
}
