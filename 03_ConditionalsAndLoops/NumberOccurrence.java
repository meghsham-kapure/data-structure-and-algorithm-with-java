public class NumberOccurrence {
    public static void main(String[] args) {

        numberOccurrenceInNumber(70666068, 6);
    
    }
    
    public static void numberOccurrenceInString(String numberString, char target) {
        int occurrence = 0 ;
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i)==target) occurrence++;
        }

        System.out.println("In "+numberString+", "+target+" occurred "+occurrence+" times." );

    }

    public static void numberOccurrenceInNumber( int number, int target){
        int copy  = number;
        int occurrence = 0;
        
        while (copy> 0){
            int digit = copy % 10;
            if (digit==target) occurrence++;
            copy /= 10;
        }

        System.out.println("In "+number+", "+target+" occurred "+occurrence+" times." );
   
    }
}
