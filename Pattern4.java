public class Pattern4 {
    public static void main(String[]args){
        int rows = 4;
        for(int i = 0; i<rows; i++){
            for (int j = 0;j<rows; j++){
                if((i==0 && j>=2) || (i==2 && j==3) || (i==3) && (j>=2)){
                    System.out.print("*");

                }else{
                    System.out.print("#");
                }
             } System.out.println(" ");
        } 

    }
    
}