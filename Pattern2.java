/*
//Hollow star........................................................... (i)
public class Pattern2 {

    public static void Hollow(int R, int C) {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C ; j++) {
                if (i == 1 || j == 1 || i == R || j == C) {
                    System.out.print("*");
                }else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Hollow(4, 5);

    }
}
*/

/*       
//inverted and rotated half pyramid...................................(ii)
public class Pattern2 {

    public static void IandR(int n){
        for(int i=1; i<=n;i++){

            for (int j=1; j<= n-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
    
              System.out.println();
}
    }

public static void main(String[] args) {
    IandR(4);
    
}

}
*/

/*
//inverted half pyramid with number..........................(iii)

1 2 3 4 5 
1 2 3 4 
1 2 3
1 2
1

public class Pattern2 {

    public static void Inv_half_Pyramid_with_number(int n){
        for(int i=1;i<=n;i++){
             for(int j=1; j<= n-i+1;j++){
                System.out.print(j+" ");
             }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        Inv_half_Pyramid_with_number(5);
    }
} 
*/ 




/*
// floyd's triangle problem..........................(iv)
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 

public class Pattern2 {

     public static void floydTri(int n){
      int counter = 1;         
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
           counter++;
           }
           System.out.println();
     }

     }

     public static void main(String[] args) {
        floydTri(5);
     }
}

*/

/* 
// 0-1 pattern question ................................(v)
 1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1

public class Pattern2 {

    public static void pattern(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
    */
    /* 

    //Butterfly pattern....................................(vi)
    public class Pattern2 {
        public static void Butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
        for(int i=n;i>=1;i--){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(                                                                                                                                                                                            );
        }

        }

        public static void main(String[] args) {
            Butterfly(5);
        }
    }
        */

/*
// question solid rhombus......................(vii)
    *****
   *****
  *****
 *****
*****
  
   public class Pattern2 {
   
    public static void solid_rhombus(int n){
    
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    

    public static void main(String[] args) {
        solid_rhombus(9);
    }
   }
    */

    /*
     //question hollow rhomnbus...................(viii)
     * * * * * * 
    *         *
   *         *
  *         *
 *         *
* * * * * *
   
    public class Pattern2 {
         
        public static void Hollow_rhombus(int n){
        
            for(int i=1;i<=n;i++){
                //space
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // hollow rectangle
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }       
        }


        public static void main(String[] args) {
            Hollow_rhombus(6);
        }
    }
        */

    // Daimond pattern..........................................(ix)
    /* 
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    * 
    
    public class Pattern2 {
        public static void Daimond(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


            for(int i=n; i>=1; i--){
                for(int j=1;j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        public static void main(String[] args) {
            Daimond(5);
        }
    }*/