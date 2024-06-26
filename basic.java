public class basic {
    public static void main(String[] args){
        System.out.println("Numbers in ascending order");
        printInc(5);
        System.out.println("Numbers in descending order");
        printDec(5);
        int s = sum(5);
        System.out.println("Sum of numbers: " + s);
        int p = prod(5);
        System.out.println("Factorial of numbers: " + p);
        System.out.println("Elements found in array:");
        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr, 0);
        System.out.print("Even elements found in array: ");
        evenArray(arr, 0);
        int[] arr2 = {1, 5, 8, 15, 8, 2, 15};
        System.out.print("Indices of 8 in array arr2: ");
        samenos(arr2, 0, 8);
        System.out.print("Indices of 15 in array arr2: ");
        samenos(arr2, 0, 15);
        int[] arr3 = {3, 7, 1, 9, 4};
        System.out.print("Maximum number in the array: ");
        int max = maxNum(arr3, 0);
        System.out.println(max);
        String s1 = "madam";
        String s2 = "abc";
        palindrome(s1);
        palindrome(s2);
    }

    // Ascending order
    public static void printInc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }

    // Reverse order
    public static void printDec(int m){
        if(m == 1){
            System.out.println(m);
            return;
        }
        System.out.println(m);
        printDec(m - 1);
    }

    // Sum of n numbers
    public static int sum(int s){
        if(s == 1){
            return 1;
        }
        return s + sum(s - 1);
    }

    // Factorial of n numbers
    public static int prod(int p){
        if(p == 1){
            return 1;
        }
        return p * prod(p - 1);
    }

    // Elements in array
    public static void printArr(int[] arr, int index){
        if(index == arr.length){
            System.out.println();
            return;
        }
        System.out.print(arr[index] + " ");
        printArr(arr, index + 1);
    }

    // Even elements in array
    public static void evenArray(int[] arr, int index){
        if(index == arr.length){
            System.out.println();
            return;
        }
        if(arr[index] % 2 == 0){
            System.out.print(arr[index] + " ");
        }
        evenArray(arr, index + 1);
    }

    // Indices of num in array
    public static void samenos(int[] arr2, int index2, int num){
        if(index2 == arr2.length){
            System.out.println();
            return;
        }
        if(arr2[index2] == num){
            System.out.print(index2 + " ");
        }
        samenos(arr2, index2 + 1, num);
    }

    // Maximum number in array
    public static int maxNum(int[] arr3, int idx){
        if(idx == arr3.length - 1){
            return arr3[idx];
        }
        int maxRest = maxNum(arr3, idx + 1);
        if(arr3[idx] > maxRest){
            return arr3[idx];
        } else {
            return maxRest;
        }
    }

    // Check palindrome
    public static void palindrome(String s1){
        if(isPalindrome(s1, 0, s1.length() - 1)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static boolean isPalindrome(String s, int left, int right){
        if(left >= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);
    }
}

