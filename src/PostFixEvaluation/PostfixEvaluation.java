package PostFixEvaluation;



public class PostfixEvaluation {
String expression = "20 2 / 8 2 * +";
	
	IntegerClass object = new IntegerClass(20);
	
	
	public boolean isOperator(char c) {
		if(c == '+' || c== '-' || c== '*'|| c== '/') {
			return true;
		}
		else {
			return false;
		}
	}
	

//	isOperator is ready
	public int evaluate(int val1 , int val2, char a) {
		if(a == '+') {
			return (val1 + val2);
		}else if(a == '-') {
			return (val1 - val2);
		}else if(a == '+') {
			return (val1 + val2);
		}else if(a == '*') {
			return (val1 * val2);
		}else {
			return (val2 / val1);
		}
		
	}
	
	public void postfixEvaluator(String expression) {
		StringBuilder postFix = new StringBuilder() ;
		
		char[] array = expression.toCharArray();
//		int final_Result;
		
		for(int i=0;i<array.length;i++) {
			if(Character.isDigit(array[i])) {
				postFix.append(array[i]);
			}else if(array[i] == ' ') {
				object.push(Integer.parseInt(postFix.toString()));
				postFix.setLength(0); ;
			} else if(isOperator(array[i])) {
				int val1 = object.pop();
				int val2 = object.pop();
				 int result =  evaluate(val1,val2,array[i]);
				 object.push(result);
			}else {
				 System.out.println("Evaluated");
				
			}
//			return final_Result;
		}
		System.out.println(object.pop());
//		return object.pop();
	}
	}
