
public class InfixToPostFix {

	static char[] stackOperator,stackOperand ;
	static int topOperator,topOperand;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void infixToPostFix(String strings) {
		stackOperand = new char[strings.length()];
		stackOperator = new char[strings.length()];
		init();
		
		String string =strings.replaceAll("\\s+","");
		
		for(int a=0;a<string.length();a++) {
			if( string.charAt(a)=='+' || string.charAt(a)=='*' || string.charAt(a)=='-'|| string.charAt(a)=='/') {
				
				 
				pushOperator(string.charAt(a));
			 	
			}else if(string.charAt(a)==')' ){
				
//				
				
				
				 
				 
				
			}else if(string.charAt(a)!='('){
				//System.out.println(string.charAt(a));
				pushOperand(string.charAt(a));
				
			}
	}
		while(stackOperatorIsEmpty()==false) {
			//	System.out.println("what? "+stackOperatorIsEmpty());
				 pushOperand(popOperator());
			}
		
		//System.out.println("");
 		for(char value:stackOperand) {
			System.out.print(value+" ");
		}
}
	
	private static boolean stackOperatorIsEmpty() {
		boolean empty = false;
		
		if(topOperator==-1) {
			empty=true;
		}
		return empty;
	}

	

	public static void init() {
		topOperand = -1;
		topOperator=-1;
		
	}
	public static void pushOperand(char x) {
		topOperand +=1;
		stackOperand[topOperand] =x;
		
	}
	public static char popOperand() {
		char x;
		x=stackOperand[topOperand];
		topOperand -=1;
		return x;
	}
	
	
	public static void pushOperator(char x) {
		topOperator +=1;
		stackOperator[topOperator] =x;
		
	}
	public static char popOperator() {
		char x;
		x=stackOperator[topOperator];
		topOperator -=1;
		return x;
	}
	
	
	

}
