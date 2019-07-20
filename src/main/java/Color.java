
/**
 *
 * @author tide
 */
public class Color {
    
    static String[] manoJ1 = new String[5];         static    String[] manoJ2 = new String[5];
    static  char[] tipoJ1 = new char[5];            static   char[] tipoJ2 = new char[5];    
    static String[] list = new String[5];           static int vandf1=0, vandf2=0,vandd1=0,vandd2=0, vand=0,vanj2=0, vand1=0, vand2=0;
    static int cj1=0,cj2=0,cj3=0,cj4=0, valJ1=0;    static    int cp1=0,cp2=0,cp3=0,cp4=0, valJ2=0; 
    
     public void color(){
        
                      //COLOR GANA EL JUGADOR 1
       //JUGADOR 1                             // JUGADOR 2 
       manoJ1[0]="4";                          manoJ2[0]="4";     
       manoJ1[1]="6";                          manoJ2[1]="3";
       manoJ1[2]="Q";                          manoJ2[2]="K";
       manoJ1[3]="10";                         manoJ2[3]="8";
       manoJ1[4]="9";                          manoJ2[4]="10";

       
       tipoJ1[0]='D';                         tipoJ2[0]='S';
       tipoJ1[1]='D';                         tipoJ2[1]='S';
       tipoJ1[2]='D';                         tipoJ2[2]='S';
       tipoJ1[3]='D';                         tipoJ2[3]='H';
       tipoJ1[4]='D';                         tipoJ2[4]='S';
      System.out.println("\n///////   @COLOR   /////// ");               
      System.out.println("el jugador No 1 tiene la mano "+manoJ1[0]+tipoJ1[0]+" "+manoJ1[1]+tipoJ1[1]+" "+manoJ1[2]+tipoJ1[2]+" "+manoJ1[3]+tipoJ1[3]+" "+manoJ1[4]+tipoJ1[4]);  
      System.out.println("el jugador No 2 tiene la mano "+manoJ2[0]+tipoJ2[0]+" "+manoJ2[1]+tipoJ2[1]+" "+manoJ2[2]+tipoJ2[2]+" "+manoJ2[3]+tipoJ2[3]+" "+manoJ2[4]+tipoJ2[4]);  
        
      comparar_color ();     
     }
     
    public void comparar_color (){
         
          // identificacion escalera real para el jugador No "1"    10C JC QC KC AC
     
        for(int i=0;i<5;i++){
        
             // COLOR DE TREBOL  JUGADOR UNO
             if (tipoJ1[i]=='S')
            { 
             cj1++;
            }
             
            else{
                 cj1=0;
             }
           // COLOR DE DIAMANTES  JUGADOR UNO
              if (tipoJ1[i]=='D')
            { 
             cj2++;
             // System.out.println(cj2);
            }else{
                 cj2=0;
             }
               // COLOR DE CORAZONES  JUGADOR UNO
               if (tipoJ1[i]=='H')
            { 
             cj3++;
             // System.out.println(cj3);
            }else{
                 cj3=0;
             }
                // COLOR DE ESPADAS  JUGADOR UNO
                if (tipoJ1[i]=='C')
            { 
             cj4++;
              //System.out.println(cj4);
            }else{
                 cj4=0;
             }
        }
              
           // identificacion escalera real para el jugador No "2"    10C JC QC KC AC
     
        for(int j=0;j<5;j++){

             // COLOR DE TREBOL  JUGADOR DOS
             if (tipoJ2[j]=='C')
            { 
             cp1++;
            }else{
                 cp1=0;
             }
           // COLOR DE DIAMANTES  JUGADOR DOS
              if (tipoJ2[j]=='D')
            { 
             cp2++;
              //System.out.println(cp2);
            }else{
                 cp2=0;
             }
               // COLOR DE CORAZONES  JUGADOR DOS
               if (tipoJ2[j]=='H')
            { 
             cp3++;
              //System.out.println(cp3);
            }else{
                 cp3=0;
             }
                // COLOR DE ESPADAS  JUGADOR DOS
                if (tipoJ2[j]=='S')
            { 
             cp4++;
              //System.out.println(cp4);
            }else{
                 cp4=0;
             }
        }
        
        /// IMPRIMIR
           if( cj1==5||cj2==5||cj3==5||cj4==5){
               valJ1=1;
             }   
          if( cp1==5||cp2==5||cp3==5||cp4==5){
               valJ2=1;
            } 
         
          
            if( valJ1==1&&valJ2==0){
              System.out.println("Color para el jugador No 1 -- Gana el juego");
           }
            if( valJ1==0&&valJ2==1){
              System.out.println("Color para el jugador No 2 -- Gana el juego");
           }
             if( valJ1==1&&valJ2==1){
              System.out.println("Ambos jugadores poseen Color -- Empate tecnico");
           }
        
     }
    
}
