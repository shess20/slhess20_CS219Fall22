package HW5;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles) {
        for (int i = 0; i <= word.length() - 1; i++) {
            int j = 0;
            String f = "";
            boolean c = false;
            while(j <= tiles.length()- 1 && !c) {
                if (tiles.charAt(j) == word.charAt(i)) {
                    f += tiles.charAt(j);
                    tiles = tiles.substring(0, j) + tiles.substring(j + 1);
                    c = true;
                }
                j++;
            }
            if (f.length() == 0) {
                return false;
            }
        }
       return true;
    }

   public static void main(String [] args) {
       System.out.println(canSpell("boot", "axobasrto"));
       System.out.println(!canSpell("hippo", "haxobapsrito"));
       System.out.println(canSpell("Hello", "KHpilbkuleoop"));
       System.out.println(!canSpell("New York", "hiwekrj sod LSusk jhY"));
       System.out.println(canSpell("sierra", "pskjilerlram"));
   }
}
