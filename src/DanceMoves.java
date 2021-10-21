import java.util.*;
public class DanceMoves {
    /*package whatever //do not write package name here */
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int x=sc.nextInt();
                int y=sc.nextInt();
                if((x>=0 && y>=0) || (x<=0 && y<=0)){
                    if(x>y){
                        System.out.println(Math.abs(x-y));
                    }
                    else{
                        int z=y-x;
                        if(z%2==0){
                            System.out.println(z/2);
                        }
                        else{
                            System.out.println(z/2+2);
                        }
                    }
                }
                else{
                    int z=0;
                    if(x<0 && y>=0){
                        z=y-x;
                    }
                    else if(x>=0 && y<0){
                        z=x-y;
                    }
                    if(z%2==0){
                        System.out.println(z/2);
                    }
                    else{
                        System.out.println((z/2)+2);
                    }
                }
            }
        }
}

