package practise_qs;
class circle{
    public int radiu;
    circle (int r){
        this.radiu = r;
        System.out.println(" i am circle paremerriexex constru");
    }
    
    public double area(){
        return Math.PI*this.radiu*this.radiu;
    }

}
class cylinder1 extends circle{
    public int height;
    // public double volumne(){
    //     return Math.PI*this.radiu*this.radiu;
    // }
    cylinder1(int r , int h){
        super(r);
        System.out.println(" i am cylinder 1 parameterized constructor");
        this.height =h;
    }

}
public class exe5 {
    public static void main(String[] args) {
        circle c = new circle(23);
        cylinder1 c1 = new cylinder1(23, 32)

        
    }
}
