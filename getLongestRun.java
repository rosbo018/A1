class getLongestRun{
	public static void main(String[] args){
		int[] intArr = new int[args.length];
		for (int i = 0; i<args.length;i++){
			intArr[i] = Integer.parseInt(args[i]);
		}
		int longestCount = 1;
		for (int i = 0; i<intArr.length-1;i++){
			if(intArr[i] == intArr[i+1]){
				int temp = 0;
				for (int j = i; j<intArr.length;j++){
					if(intArr[j] == intArr[i]){
						temp++;
					}
				}
				if(temp>longestCount){
					longestCount = temp;
				}
			}
		}
		System.out.println(longestCount);


	}
	
}