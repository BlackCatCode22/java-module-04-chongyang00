package chong.zoo.com;
public class Hyena extends chong.zoo.com.Animal{

    static int numOfHyenas = 0;


    public Hyena (String someName){
        super(someName);
        numOfHyenas++;
    }
}

