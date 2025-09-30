class single{
public static void main(String[] args){
int n=8874;
int single=isSingle(n)
if (single<10){

System.out.println(single);
}
else{
isSingle(single)
}
}



static int isSingle(int n){
int sum =0
while(n>0){
int temp=n%10;
sum =sum+temp;
n=n/10;
}
return sum;
}
}