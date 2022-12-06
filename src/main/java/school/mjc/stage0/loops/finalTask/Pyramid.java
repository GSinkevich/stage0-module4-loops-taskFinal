package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int currentNumber = cathetusLength;
        for (int i = 0; i < cathetusLength ; i++) {
            for (int j = 0; j < cathetusLength+i; j++) {
                if (j >= cathetusLength-i-1 && j <= cathetusLength+i-1 ){
                    if(currentNumber-j >= 1){
                        System.out.print(currentNumber-j);
                    }
                    else{
                        System.out.print(j-currentNumber+2);
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
