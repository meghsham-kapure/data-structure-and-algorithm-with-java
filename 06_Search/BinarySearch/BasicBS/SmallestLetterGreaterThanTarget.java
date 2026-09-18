
public class SmallestLetterGreaterThanTarget {
    public static void main(String args[]){
        char result = 'z';

        // result = nextGreatestLetter( new char [] {'c','f','j'}, 'c');
        // System.out.println('c'+"=>"+result);
        // result = nextGreatestLetter( new char [] {'c','f','j'}, 'f');
        // System.out.println('f'+"=>"+result);
        // result = nextGreatestLetter( new char [] {'c','f','j'}, 'j');
        // System.out.println('j'+"=>"+result);
        // result = nextGreatestLetter( new char [] {'c','f','j'}, 'a');
        // System.out.println('a'+"=>"+result);
        result = nextGreatestLetter( new char [] {'c','f','j'}, 'x');
        System.out.println('x'+"=>"+result);
        

            System.out.println("result=>"+result);
        
    }

    public  char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end  = arr.length-1;
        int mid = start + ( end - start ) / 2;

        if(target>=arr[arr.length-1]) return arr[0];

        while(start<=end){
            
            if (arr[mid] <= target) {
                start = mid +1;
                System.out.println("start = mid +1;");
            }
            else {
                end = mid - 1;
                System.out.println("end = mid - 1;");
            }
            mid = start + ( end - start ) / 2;
        }

        return arr[start];
    }
}