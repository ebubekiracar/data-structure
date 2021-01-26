import java.util.Arrays;

public class BubbleSort {
 
  public static void main(String[] args) {
    //sabit dizi oluşturuldu
    int [] dizi ={5,9,12,3,25,34,0,52,46,2};
    //------------
    System.out.println("------------İlk Hali---------------");
    System.out.println(Arrays.toString(dizi));
    System.out.println("-----------------------------------");
    //---------------
    int tmp=0;
    for (int j=0 ;j<dizi.length;j++){
    for (int i=0 ; i < dizi.length-1 ;i++){
      if(dizi[i]>dizi[i+1]){
        tmp = dizi[i];
        dizi[i]=dizi[i+1];
        dizi[i+1]=tmp;
      }
      
    }
    System.out.println(Arrays.toString(dizi));
    }
    System.out.println("------------Son Hali---------------");
    System.out.println(Arrays.toString(dizi));
    System.out.println("-----------------------------------");
  }

}
