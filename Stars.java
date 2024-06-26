public class Stars {
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++) {
            System.out.println("*");
            if(i >= 5) break;
            for(int j = 0; j < i; j++) {
                System.out.println();    
            }
        }

        System.out.println("\n");

        for(int i = 1; i < 8; i++) {
            System.out.print("*");
            if(i >= 7) break;
            for(int j = 0; j < i; j++) {
                System.out.print(" ");    
            }
        }

        System.out.println("\n");

        for(int i = 0; i < 5; i++) {
            if(!(i % 2 == 0)) {
                System.out.print(" ");
            }
            if(i >= 5) break;
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
                System.out.print(" "); 
            }
            System.out.println();
        }
    } 
}