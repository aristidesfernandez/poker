/*
 *
 * @author tide
 */
public class Escalera_real {
    
    public static   String[] manoJ1 = new String[5];          public static String[] manoJ2 = new String[5];
    public static char[] tipoJ1 = new char[5];                public static    char[] tipoJ2 = new char[5]; 
    public static int cj1=0,cj2=0,cj3=0,cj4=0, valJ1=0;       public static    int cp1=0,cp2=0,cp3=0,cp4=0, valJ2=0;
    
    
    
    public  void comparar_real () {  
    
           // identificacion escalera real para el jugador No "1"    10C JC QC KC AC
     
        for(int i=0;i<5;i++){
        
             // ESCALERA REAL DE TREBOL
             if ("10".equals(manoJ1[i])&&tipoJ1[i]=='C')
            { 
             cj1++;
            }
          
              if ("J".equals(manoJ1[i])&&tipoJ1[i]=='C')
            { 
             cj1++;
            }
            if ("Q".equals(manoJ1[i])&&tipoJ1[i]=='C')
            { 
             cj1++;
            }
             if ("K".equals(manoJ1[i])&&tipoJ1[i]=='C')
            { 
            cj1++;
            }
           if ("A".equals(manoJ1[i])&&tipoJ1[i]=='C')
            { 
             cj1++;
            }
           ////  ESCALERA REAL DE DIAMANTES
           
           if ("10".equals(manoJ1[i])&&tipoJ1[i]=='D')
            { 
             cj2++;
            }
              if ("J".equals(manoJ1[i])&&tipoJ1[i]=='D')
            { 
             cj2++;
            }
            if ("Q".equals(manoJ1[i])&&tipoJ1[i]=='D')
            { 
             cj2++;
            }
             if ("K".equals(manoJ1[i])&&tipoJ1[i]=='D')
            { 
             cj2++;
            }
           if ("A".equals(manoJ1[i])&&tipoJ1[i]=='D')
            { 
              cj2++;
            }
           /////ESCALERA REAL DE CORAZONES
           
             
           if ("10".equals(manoJ1[i])&&tipoJ1[i]=='H')
            { 
             cj3++;
            }
              if ("J".equals(manoJ1[i])&&tipoJ1[i]=='H')
            { 
             cj3++;
            }
            if ("Q".equals(manoJ1[i])&&tipoJ1[i]=='H')
            { 
             cj3++;
            }
             if ("K".equals(manoJ1[i])&&tipoJ1[i]=='H')
            { 
            cj3++;
            }
           if ("A".equals(manoJ1[i])&&tipoJ1[i]=='H')
            { 
             cj3++;
            }
           
             /////ESCALERA REAL DE ESPADA
             
           if ("10".equals(manoJ1[i])&&tipoJ1[i]=='S')
            { 
             cj4++;
            }
              if ("J".equals(manoJ1[i])&&tipoJ1[i]=='S')
            { 
             cj4++;
            }
            if ("Q".equals(manoJ1[i])&&tipoJ1[i]=='S')
            { 
             cj4++;
            }
             if ("K".equals(manoJ1[i])&&tipoJ1[i]=='S')
            { 
             cj4++;
            }
           if ("A".equals(manoJ1[i])&&tipoJ1[i]=='S')
            { 
             cj4++;
            }
        }
        
        
   
        
           // identificacion escalera real para el jugador No "2"    10C JC QC KC AC
     
        for(int j=0;j<5;j++){
        
             // ESCALERA REAL DE TREBOL
             if ("10".equals(manoJ2[j])&&tipoJ2[j]=='C')
            { 
             cp1++;
            }
          
              if ("J".equals(manoJ2[j])&&tipoJ2[j]=='C')
            { 
             cp1++;
            }
            if ("Q".equals(manoJ2[j])&&tipoJ2[j]=='C')
            { 
             cp1++;
            }
             if ("K".equals(manoJ2[j])&&tipoJ2[j]=='C')
            { 
            cp1++;
            }
           if ("A".equals(manoJ2[j])&&tipoJ2[j]=='C')
            { 
             cp1++;
            }
           ////  ESCALERA REAL DE DIAMANTES
           
           if ("10".equals(manoJ2[j])&&tipoJ2[j]=='D')
            { 
             cp2++;
            }
              if ("J".equals(manoJ2[j])&&tipoJ2[j]=='D')
            { 
             cp2++;
            }
            if ("Q".equals(manoJ2[j])&&tipoJ2[j]=='D')
            { 
             cp2++;
            }
             if ("K".equals(manoJ2[j])&&tipoJ2[j]=='D')
            { 
             cp2++;
            }
           if ("A".equals(manoJ2[j])&&tipoJ2[j]=='D')
            { 
              cp2++;
            }
           /////ESCALERA REAL DE CORAZONES
           
             
           if ("10".equals(manoJ2[j])&&tipoJ2[j]=='H')
            { 
             cp3++;
            }
              if ("J".equals(manoJ2[j])&&tipoJ2[j]=='H')
            { 
             cp3++;
            }
            if ("Q".equals(manoJ2[j])&&tipoJ2[j]=='H')
            { 
             cp3++;
            }
             if ("K".equals(manoJ2[j])&&tipoJ2[j]=='H')
            { 
            cp3++;
            }
           if ("A".equals(manoJ2[j])&&tipoJ2[j]=='H')
            { 
             cp3++;
            }
           
             /////ESCALERA REAL DE ESPADA
             
           if ("10".equals(manoJ2[j])&&tipoJ2[j]=='S')
            { 
             cp4++;
            }
              if ("J".equals(manoJ2[j])&&tipoJ2[j]=='S')
            { 
             cp4++;
            }
            if ("Q".equals(manoJ2[j])&&tipoJ2[j]=='S')
            { 
             cp4++;
            }
             if ("K".equals(manoJ2[j])&&tipoJ2[j]=='S')
            { 
             cp4++;
            }
           if ("A".equals(manoJ2[j])&&tipoJ2[j]=='S')
            { 
             cp4++;
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
              System.out.println("escalera real para el jugador No 1 -- Gana el juego");
           }
            if( valJ1==0&&valJ2==1){
              System.out.println("escalera real para el jugador No 2 -- Gana el juego");
           }
             if( valJ1==1&&valJ2==1){
              System.out.println("Ambos jugadores con escalera real -- Empate tecnico");
           }
    }   
    
    public void escalera_real(){
        
                      //ESCALERA REAL GANA EL JUGADOR 1
       //JUGADOR 1                             // JUGADOR 2 
       manoJ1[0]="A";                          manoJ2[0]="A";     
       manoJ1[1]="K";                          manoJ2[1]="J";
       manoJ1[2]="Q";                          manoJ2[2]="K";
       manoJ1[3]="10";                         manoJ2[3]="Q";
       manoJ1[4]="J";                          manoJ2[4]="10";

       
       tipoJ1[0]='S';                         tipoJ2[0]='D';
       tipoJ1[1]='S';                         tipoJ2[1]='D';
       tipoJ1[2]='S';                         tipoJ2[2]='D';
       tipoJ1[3]='S';                         tipoJ2[3]='D';
       tipoJ1[4]='S';                         tipoJ2[4]='D';
       
      
      System.out.println(" /////// @TEST ESCALERA REAL ///// ");         
      System.out.println("el jugador No 1 tiene la mano "+manoJ1[0]+tipoJ1[0]+" "+manoJ1[1]+tipoJ1[1]+" "+manoJ1[2]+tipoJ1[2]+" "+manoJ1[3]+tipoJ1[3]+" "+manoJ1[4]+tipoJ1[4]);  
      System.out.println("el jugador No 2 tiene la mano "+manoJ2[0]+tipoJ2[0]+" "+manoJ2[1]+tipoJ2[1]+" "+manoJ2[2]+tipoJ2[2]+" "+manoJ2[3]+tipoJ2[3]+" "+manoJ2[4]+tipoJ2[4]);  
      comparar_real ();
             
           
         
    }
  }
