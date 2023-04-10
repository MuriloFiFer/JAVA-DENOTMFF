package IteracaoWhile;

public class ExerciciosWhile {
        //Resolvendo lista extra vetores
        public void Exercicio1(){            //vetor A = vetorB
        int vetorA[]=new int[]{3,5,7,11,13};
        int vetorB[]=new int[5];
        int i=0;
        while(i<5) {    //while(i<vetorA.length)   lenght=tamanho  (vetorA.lenght = tamanho do vetor)
            vetorB[i]=vetorA[i];
            System.out.println("vetorB["+i+"]="+vetorB[i]);
            i++;
        }
        }

        public void Exercicio2(){
            int vetorA[]=new int[]{2,4,6,8,10,12,14,16};
            int vetorB[]=new int[8];
            int i=0;
            while(i<vetorA.length) {
                vetorB[i]=vetorA[i]*2;
                System.out.println("vetorB["+i+"]="+vetorB[i]);
                i++;
            }
        }

        public void Exercicio3(){                    //vetorB raiz (vetorA)
            int vetorA[]=new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
            int vetorB[]=new int[15];
            int i=0;
            while(i<15){
                vetorB[i]=vetorA[i]*vetorA[i];
                System.out.println("vetorB["+i+"]="+vetorB[i]);
                i++;
            }
        }

        public void Exercicio4(){                  //vetorB = sqrt(vetorA)
            int vetorA[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
            double vetorB[]=new double[15];
            int i=0;
            while(i<15){
                vetorB[i]=Math.sqrt(vetorA[i]);
                System.out.println("vetorB["+i+"]="+vetorB[i]);
            i++;     
               }
        }

        public void Exercicio5(){                //vetorB =   vetorA * i
            int vetorA[]=new int[]{1,2,3,4,5,6,7,8,9,10};
            int vetorB[]=new int[10];
            int i=0;
            while(i<10){
                vetorB[i]=vetorA[i]*i;
                System.out.println("vetorB["+i+"]="+vetorB[i]);
            i++;     
               }
        }
 
        public void Exercicio6(){                       //vetorC = (vetorA) + (vetorB)
            int vetorA[]=new int[]{1,2,3,4,5,6,7,8,9,10};
            int vetorB[]=new int[]{1,2,3,4,5,6,7,8,9,10};
            int vetorC[]=new int[10];
            int i=0;
            while(i<10){
                vetorC[i]=vetorA[i]+vetorB[i];
                System.out.println("vetorC["+i+"]="+vetorC[i]);
            i++;     
               }
        }   
}
