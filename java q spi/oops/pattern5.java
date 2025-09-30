class pattern5{
public static void main(String []args){
	int n=7;
int sp=n/2;
int st=1;

for(int i=1;i<=n;i++){
	for(int j=1;j<=sp;j++){
		int num=1;
		System.out.print("  ");
	}
	for(int k=1;k<=st;k++){
		System.out.print(num);
		if(k>1){
			if(k<=num/2){
				num++;
			}else{
				num--;
			}
		}
	}
	if(i<=n/2){
	sp--;
	st+=2;
	}
	else{
		sp++;
		st-=2;
	}
	System.out.println();
}
}
}