class countNoOfObjects{
    static int i;
    public countNoOfObjects(){
        i++;
    }
    public void counter(){
        System.out.println(i);
    }
}
//Count the number of objects created 
public class example2 {
    public static void main(String[] args){
        countNoOfObjects obj = new countNoOfObjects();
        countNoOfObjects obj1 = new countNoOfObjects();
        countNoOfObjects obj2 = new countNoOfObjects();
        obj.counter();
    }
}
