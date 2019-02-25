
public class PostfixCalculator {

	static int[] stack;
	static int top;
	static int x;
	 
	
	public static void calculator(String string) {
		
		stack = new int[string.length()];
		String stringWithNoWhiteSpcae =string.replaceAll("\\s+","");
		//System.out.println(stringWithNoWhiteSpcae);
		// System.out.println(stringWithNoWhiteSpcae);
		
		int firstOperand,secondOperand ;
		char operator;
		int result = 0,finalAnswer;
		
		for(int a=0;a<stringWithNoWhiteSpcae.length();a++) {
			
			
			//System.out.print(string.charAt(a));
			
			 
			  if(stringWithNoWhiteSpcae.charAt(a)=='+'|| stringWithNoWhiteSpcae.charAt(a)=='-'||stringWithNoWhiteSpcae.charAt(a)=='*'||stringWithNoWhiteSpcae.charAt(a)=='/') {
			
				 // System.out.println("sign");
					
					secondOperand= pop();
					firstOperand=pop();
					operator=stringWithNoWhiteSpcae.charAt(a);
					
					result=performOperation(operator,firstOperand,secondOperand);
					 push(result);
				  //System.out.println("inside not operator push number "+( (int)stringWithNoWhiteSpcae.charAt(a)-48)+"  "+stringWithNoWhiteSpcae.charAt(a));
				 // System.out.println((int) stringWithNoWhiteSpcae.indexOf(a));
				 
			}else {
				
				 //System.out.println(( (int)stringWithNoWhiteSpcae.charAt(a)-48));
				  push( (int) stringWithNoWhiteSpcae.charAt(a)-48);
				
				
				 
				}
 
				
			
			}
			
		  System.out.println(result);
			
		
	}
	private static int performOperation(char operator, int firstOperand, int secondOperand) {
	int result = 0;
//		switch(operator) {
//	 case '+': result= firstOperand+secondOperand;
//	 case '-': result= firstOperand-secondOperand;
//	 case '*': result= firstOperand*secondOperand;
//	 case '/': result= firstOperand/secondOperand;
//	 
//	 }
	if(operator =='+') {
	//	System.out.println("inside + operator");
		result= firstOperand+secondOperand;
	}else if(operator =='-') {
		result= firstOperand-secondOperand;
	}else if(operator =='*') {
		result= firstOperand*secondOperand;
	}else if(operator =='/') {
		result= firstOperand/secondOperand;
	}
		
	//System.out.println(result);
	return result;
		
		
	}
		//initalizing stack
		public static void init() {
			top=-1;
		}

		
		//pushing in stack takes place here
		private static void push(int result) {
		top+=1;
		stack[top]=result;
		//System.out.println("pushed "+ charAt);
			
		}
		
		
		//poping of stack takes plae here
		public static int pop() {
							
							
						try {
					 			x=stack[top];
					 		}catch(Exception e) {
					 			e.printStackTrace();
					 	}finally {
					 		top -=1;
					 		//System.out.println("x : "+x);	
					 		
					 	}
					 		
					 		
						return  x;
									
								
									
			
			
		}
		
		
		//check if the stack is empty
		public static boolean isStackEmpty() {
			boolean empty = false;
			
			if(top==-1) {
				empty=true;
			}
			return empty;
		}
		
		
		
		
	
		
}



