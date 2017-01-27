class twoRun{
	public static void main(String[] args){
		int[] intArr = new int[args.length];
		for (int i = 0; i<args.length;i++){
			intArr[i] = Integer.parseInt(args[i]);
		}
		int two = intArr[0];
		boolean isTwo = false;
		for (int i = 1; i<intArr.length;i++){
			if(two == intArr[i]){
				isTwo = true;
				break;
			}
			two = intArr[i];
		}
		System.out.println(isTwo);
	}
}