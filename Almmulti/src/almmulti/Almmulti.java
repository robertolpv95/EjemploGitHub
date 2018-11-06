
package almmulti;

public class Almmulti {

    public static void main(String[] args) {
    
        Multimedia m1 = new Multimedia ("Hotel California","The Eagles",Formato.MP3,390);
        Multimedia m2 = new Multimedia ("One","Metallica",Formato.AVI,444);
        System.out.println(m1);
        System.out.println(m2);
        
        if(m1.equals(m2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }
        
    }
    
}
