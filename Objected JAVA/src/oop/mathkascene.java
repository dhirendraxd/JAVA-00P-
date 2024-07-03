package oop;

/**
 * Innermathkascene
 */
class square  {
    int side ;
    public int are(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }

    
}
public class mathkascene {
    public static void main(String[] args) {
     square sq = new square();
     System.out.println(sq.are());   
     System.out.println(sq.perimeter());
    }
}
