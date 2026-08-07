public class forLoop{
public static void main(String args[]){

    String array[] = new String[]{"yuvraj","kumar","prince","kumar","raj"};
    printArray(array);
    printArrayForEach(array);
}

public static void printArrayForEach(String[] array){
    for(String name: array){
         System.out.println(name);
    } 
    
}

public static void printArray(String[] array){
    for(int i=0; i<array.length; i++){
        System.out.println(array[i]);
    }

   }
}