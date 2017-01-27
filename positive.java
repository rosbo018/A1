class positive{
	public static void main(String[] args){
		int count= 0;
		for (int i = 0; i<args.length; i++){
			if (Integer.parseInt(args[i]) > 0){
				count++;
			}
		}
		System.out.println(count);
	}
}