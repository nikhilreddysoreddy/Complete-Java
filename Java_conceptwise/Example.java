public class Example{
    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=(int)(Math.random()*100);
            }
        }
        for(int m[]: arr){
            for(int n:m){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}