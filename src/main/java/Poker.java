
/*
 *
 * @author tide
 */
public class  Poker{
      static String[] manoJ1 = new String[5];         static    String[] manoJ2 = new String[5];
      static  char[] tipoJ1 = new char[5];            static   char[] tipoJ2 = new char[5];    
      static String[] list = new String[5];           static int vandf1=0, vandf2=0,vandd1=0,vandd2=0, vand=0,vanj2=0, vand1=0, vand2=0;
      
    public void Poker(){
                   //FULL HOUSE GANA EL JUGADOR 2
       //JUGADOR 1                             // JUGADOR 2 
       manoJ1[0]="7";                          manoJ2[0]="7";     
       manoJ1[1]="6";                          manoJ2[1]="2";
       manoJ1[2]="5";                          manoJ2[2]="2";
       manoJ1[3]="5";                          manoJ2[3]="2";
       manoJ1[4]="5";                          manoJ2[4]="2";
       
       tipoJ1[0]='S';                         tipoJ2[0]='D';
       tipoJ1[1]='D';                         tipoJ2[1]='H';
       tipoJ1[2]='S';                         tipoJ2[2]='C';
       tipoJ1[3]='H';                         tipoJ2[3]='D';
       tipoJ1[4]='C';                         tipoJ2[4]='H';
       System.out.println("\n/////// @TEST POKER /////// ");
       System.out.println("el jugador No 1 tiene la mano "+manoJ1[0]+tipoJ1[0]+" "+manoJ1[1]+tipoJ1[1]+" "+manoJ1[2]+tipoJ1[2]+" "+manoJ1[3]+tipoJ1[3]+" "+manoJ1[4]+tipoJ1[4]);  
       System.out.println("el jugador No 2 tiene la mano "+manoJ2[0]+tipoJ2[0]+" "+manoJ2[1]+tipoJ2[1]+" "+manoJ2[2]+tipoJ2[2]+" "+manoJ2[3]+tipoJ2[3]+" "+manoJ2[4]+tipoJ2[4]);  
       comparar_poker();  
    
}
    
          static boolean numero(String num){
             for(int i=0; i<5;i++){
                 if(list[i] == null ? num == null : list[i].equals(num)){
                  return false;
                 }
                }
             vand++;
            // System.out.println(vand); 
             return true;   
                       
        }
         static boolean numero2(String num2){
              
              for(int n=0; n<5;n++){
                 if(list[n] == null ? num2 == null : list[n].equals(num2)){
                 return false;
                 }
                } vanj2++;  return true;               
            }
    public void comparar_poker(){
             // identificacion full house para el jugador No "1"    
        list = new String[5];
        for(int i=0;i<5;i++){
             int cntj1=0;
             for(int j=0;j<5;j++){            
                 if (manoJ1[i] == null ? manoJ1[j] == null : manoJ1[i].equals(manoJ1[j])){
                     cntj1++;                
                     if(numero( manoJ1[i])){
                          list[i]= manoJ1[i];
                        }
                    }  
                  if(j==4){ 
             if(list[i] != null){
                   if(cntj1==4&&vand<3){    // pregunta para poker       
                     vandd1=1;
                    }
             }
                 
                }
             }
            } 
             // identificacion full house para el jugador No "2"    7C 7D 7S KC KD
            list = new String[5];
            for(int i=0;i<5;i++){
             int cntj2=0;
             for(int j=0;j<5;j++){            
                    if (manoJ2[i] == null ? manoJ2[j] == null : manoJ2[i].equals(manoJ2[j])){
                          cntj2++;                
                          if(numero2( manoJ2[i])){
                             list[i]= manoJ2[i];
                            }
                    }
                    if(j==4){ 
                       
                  if(list[i] != null){
                  if(cntj2==4&&vanj2<3){  // pregunta para poker
                       vandd2=1;
                    }
                  if(cntj2==3&&vanj2<3){  // pregunta para full house
                       vandf2=1;
                        System.out.println(vandf2);
                    }
                 }
                }
                }
               
            }

              if( vandd1==1&&vandd2==0){
                   System.out.println("Poker para el jugador No 1 -- Gana el juego");
               }
              if( vandd1==0&&vandd2==1){
                   System.out.println("Poker para el jugador No 2 -- Gana el juego");
               }
              if( vandd1==1&&vandd2==1){
                   System.out.println("Poker  para ambos jugadores --  Empate tecnico");
               }
        } 

     }


