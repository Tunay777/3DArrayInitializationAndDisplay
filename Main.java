public class Main {
    public static void main(String[] args) {
        java.util.Scanner input=new java.util.Scanner(System.in);
        double [][][]myList3D=new double [2][3][3];
        int i=0;
        while (i<myList3D.length){
            int j=0;
            while(j<myList3D[i].length){
                int k=0;
                while(k<myList3D[i][j].length){

                    myList3D[i][j][k]=(int)(Math.random()*10);
                    k++;
                }
                j++;
            }
            i++;
        }
        for (int m=0;m< myList3D.length;m++){
            for (int j=0;j< myList3D[m].length;j++){
                for (int k=0;k< myList3D[m][j].length;k++){
                    System.out.print(myList3D[m][j][k]+" ");
                }
            }
        }
        }
    }
