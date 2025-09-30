class pattern4{
public static void main(String []args){

int n=7;
for(int i=1;i<=n;i++){
	for (int j=1;j<=n;j++){
		if(j==1||j==4&&i==1||i==2&&j==3||i==3&&j==2||j==2&&i==5||j==3&&i==6||j==4&&i==7){
			System.out.print("* ");
		}
		
		else{
			System.out.print("  ");
	}
	}
	System.out.println();
	

}
}
}