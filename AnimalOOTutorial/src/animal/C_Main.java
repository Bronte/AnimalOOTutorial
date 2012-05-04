package animal;

public class C_Main {
    
    /**
     * @param args
     */
    public static void main( String[] args ) {
        /**
         * four-legged:
         */
        //ok lets see what the cat has to say
        C_Cat cat = new C_Cat();
        outputSpecial( cat );
        
        // dog
        C_Dog dog = new C_Dog();
        outputSpecial( dog );
        
        /**
         * eight-legged:
         */
        // normal spider
        C_NormalSpider normalSpider = new C_NormalSpider();
        outputSpecial( normalSpider );
        
        // poison spider:
        C_PoisonousSpider posionSpider = new C_PoisonousSpider();
        outputSpecial( posionSpider );
        
    }
    
    public static void outputSpecial( I_Animal animal ) {
        System.out.println( animal.getName() );
        System.out.println( animal.getLegs() );
        System.out.println( animal.getSound() );
    }
    
}
