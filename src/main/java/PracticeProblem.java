public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int towerOfHanoi(int num){

		//if num < 3 return -1
		if(num < 3){
			return -1; 
		} else if (num == 3){
			//base case of num == 3, as the min number of moves goes (1,3,7)
			return 7;
		}

		//since the min number of moves is 2x + 1 from the last, recursively call the function with num-1
		return towerOfHanoi(num-1)*2+1;
	}

}
