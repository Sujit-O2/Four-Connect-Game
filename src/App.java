                       //                                 sujit swain                         //
import java.util.Scanner;

public class App {
    static Scanner sc;
    static char fourConnect[][]=
    {
    {'-','-','-','-','-','-','-'},
    {'-','-','-','-','-','-','-'},
    {'-','-','-','-','-','-','-'},
    {'-','-','-','-','-','-','-'},
    {'-','-','-','-','-','-','-'},
    {'-','-','-','-','-','-','-'},
    {'-','-','-','-','-','-','-'}
};
    static int p1=6,p2=6,p3=6,p4=6,p5=6,p6=6,p7=6;
    static int c=1;
    public static void main(String[] args){
        char aa='X';
        printFourConnect();


        System.out.println("\n\n\n \t--------- Welcome to Four Connect Game --------");
        while(c==1){
        
        initFourConnect_OX(aa);
        VWinn();
        HWinn();
        rDigWin();
        lDigWin();
        printFourConnect();
        if(aa=='X'){
        aa='O';
        }
        else{
            aa='X';
        }
    }
sc.close();
System.out.println("");
}
    public static void printFourConnect(){
        for(char [] s:fourConnect){
        for(char c:s){
            System.out.print(c+" ");

        }
        System.out.println();
        
    }
}
    public static void initFourConnect_OX(char aa){
        int a;
        sc =new Scanner(System.in);
        System.out.print("\n\nEnter the position between for P1 "+aa+" (1-7) : ");
        a=Integer.parseInt(sc.next());
        switch(a){

            case 1:
            if(p1==-1){
                initFourConnect_OX(aa);
            }
            else{
            fourConnect[p1][0]=aa;
            p1--;}
            break;

            case 2:
            if(p2==-1){
                initFourConnect_OX(aa);
            }
            else{
            fourConnect[p2][1]=aa;
            p2--;}
            break;

            case 3:
            if(p3==-1){
                initFourConnect_OX(aa);
            }
            else{
            fourConnect[p3][2]=aa;
            p3--;}
            break;

            case 4:
            if(p4==-1){
                initFourConnect_OX(aa);
            }
            else{
            fourConnect[p4][3]=aa;
            p4--;}
            break;

            case 5:
            if(p5==-1){
                
                    initFourConnect_OX(aa);
                
            }else{
                fourConnect[p5][4]=aa;
            p5--;
            }
            
            break;

            case 6:
            if(p6==-1){
                initFourConnect_OX(aa);
            }
            else{
                fourConnect[p6][5]=aa;
            p6--;
            }
            
            break;
            case 7:
            if(p7==-1){
                initFourConnect_OX(aa);
            }
            else{
                fourConnect[p7][6]=aa;
            p7--;
            }
            
            break;

    

            default:
            System.out.println("\nInvalid inputTry again\n\n\n\n");
            initFourConnect_OX(aa);
        }}
        
        public static void VWinn(){
            for(int i=0;i<7;i++){
                for(int j=6;j>=3;j--){
                    if(fourConnect[j][i]=='O'&&fourConnect[j-1][i]=='O'&&fourConnect[j-2][i]=='O'&&fourConnect[j-3][i]=='O'){
                        System.out.println("\nP2 wins");
                        c=0;

                    }
                    if(fourConnect[j][i]=='X'&&fourConnect[j-1][i]=='X'&&fourConnect[j-2][i]=='X'&&fourConnect[j-3][i]=='X'){
                        System.out.println("\nP1 wins");
                        c= 0;

                    }

                }

            }
        }
        public static void HWinn(){
            for(int i=0;i<7;i++){
                for(int j=0;j<=3;j++){
                    if(fourConnect[i][j]=='O'&&fourConnect[i][j+1]=='O'&&fourConnect[i][j+2]=='O'&&fourConnect[i][j+3]=='O'){
                        System.out.println("\nP2 wins");
                        c= 0;

                    }
                    if(fourConnect[i][j]=='X'&&fourConnect[i][j+1]=='X'&&fourConnect[i][j+2]=='X'&&fourConnect[i][j+3]=='X'){
                        System.out.println("\nP1 wins");
                        c= 0;

                    }

                }

            }

        }



        public static void rDigWin(){
                
                    for(int j=0;j<4;j++){
                        for(int k=6;k>2;k--){
                            if(fourConnect[k][j]=='X'&&fourConnect[k-1][j+1]=='X'&&fourConnect[k-2][j+2]=='X'&&fourConnect[k-3][j+3]=='X'){
                                System.out.println("P1 wins");
                                c= 0;
                            }
                            if(fourConnect[k][j]=='O'&&fourConnect[k-1][j+1]=='O'&&fourConnect[k-2][j+2]=='O'&&fourConnect[k-3][j+3]=='O'){
                                System.out.println("P2 wins");
                                c= 0;
                            }
                        }
                    }
                
        }
        public static void lDigWin(){
           
                for(int j=6;j>2;j--){
                    for(int k=6;k>2;k--){
                        if(fourConnect[k][j]=='X'&&fourConnect[k-1][j-1]=='X'&&fourConnect[k-2][j-2]=='X'&&fourConnect[k-3][j-3]=='X'){
                            System.out.println("P1 wins");
                            c= 0;
                        }
                        if(fourConnect[k][j]=='O'&&fourConnect[k-1][j-1]=='O'&&fourConnect[k-2][j-2]=='O'&&fourConnect[k-3][j-3]=='O'){
                            System.out.println("P2 wins");
                            c= 0;
                        }
                    }
                }
            
            
    }
}
