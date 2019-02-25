
public class EquationValidationChecker {
	static char[] stack;
	static int top;
	static char x;
	
 

	public static void equation(String strings) {
		
		//will split x = ((2 + 2)*3) to  x and ((2 + 2)*3) at '= '
		String[] regexs=strings.split("= ");
		
		//will only pass ((2 + 2)*3) to validation
		validationChecker(regexs[1]);
		 
		 
		
	}
	
	public static void validationChecker(String strings) {
		
		//declaring stack with the length of ((2 + 2)*3)
		stack= new char[strings.length()];
		
		//initializing stack
		init();
		
		//delacring variable for later use
		boolean valid = false;
 
		
		//will go through each char of string  ((2 + 2)*3)
		for(int a=0; a<strings.length();a++) {
			
			//check if value is '(' or '{' or '['
			if(strings.charAt(a)=='('||strings.charAt(a)=='{'||strings.charAt(a)=='[') {
				//if value is '(' or '{' or '[' it will be pushed to stack
				push(strings.charAt(a));
			}
			//if value is ')' or '}' or ']'  then it will check to determine is it valid or not
			else if(strings.charAt(a)==')'||strings.charAt(a)=='}'||strings.charAt(a)==']') {
				//if stack is empty without any opening bracket then it is empty
				//sameTypeParenthesis will check  if ')'  should check '(' not '{' or '['
				//also stack poping takes place form sameTypeParenthesis function.
				if(isStackEmpty()|| sameTypeParenthesis(strings.charAt(a))) {
					//if stack is empty of , closing of any parenthesis doesnot find its opening then it equation will be invalid
				valid=false;
				
				}else {
					valid=true;
//				
					
				
				}
			
			}
		}
		
		System.out.println(valid?"Valid":"Invalid");
		 
	}
	
	 
// 				//sameTypeParenthesis will check  if ')'  should check '(' not '{' or '['
	private static boolean sameTypeParenthesis(char charAt) {
		
		//boolean 
						if(charAt==')' ) {
							if( pop()=='(' ) {
								return false;
							}else {
								
								return true;
							}
								
							}
						
					 
					if(charAt=='}' ) {
						if( pop()=='}' ) {
							return false;
						}else {
							
							return true;
						}
							
						
					}
				if(charAt==']' ) {
					if( pop()==']' ) {
						return false;
					}else {
						
						return true;
					}
						
					}
				
				//program never reach this point just for fulfilling requirements of java cause we will only have ),], or }
				
				return false;
					
	
		 
	}

	//initalizing stack
	public static void init() {
		top=-1;
	}

	
	//pushing in stack takes place here
	private static void push(char charAt) {
	top+=1;
	stack[top]=charAt;
	//System.out.println("pushed "+ charAt);
		
	}
	
	
	//poping of stack takes plae here
	public static char pop() {
						
						
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
