public class ArrayAlgorithms {
    private ArrayAlgorithms() {}
    public static double average(int[] numlist) {
        int value = 0;
        for (int num : numlist) {
            value += num;
        }
        return (double) value / numlist.length;
    }
    public static int minimum(int[] numList) {
        int minimum = numList[0];
        for (int num : numList) {
            if (minimum > num) {
                minimum = num;
            }
        }
        return minimum;
    }
    public static int howManyContain(String[] strList, String target) {
        int value = 0;
        for (String str : strList) {
            if (str.indexOf(target) != -1) {
                value++;
            }
        }
        return value;
    }
    public static String[] stringToArray(String myStr) {
        String character = "";
        String[] strList = new String[myStr.length()];
        for (int i = 0; i < strList.length; i++ ) {
            character = myStr.substring(i, i +1);
            strList[i] = character;
        }
        return strList;
    }
    //    public static void introduceAdults(Person[] people) {
//        for (int i = 0; i < people.length; i++) {
//            if (people[i].getAge() >= 18) {
//                people[i].introduce();;
//            }
//        }
//    }
    public static void reversePrint(String[] wordList) {
        for (int f = wordList.length - 1; f > -1; f--) {
            for (int i = wordList[f].length() - 1; i > -1; i--) {
                System.out.print(wordList[f].substring(i, i +1));
            }
            System.out.println();
        }
    }
    public static int[] combine(int[] arr1, int[] arr2) {
        int[] combineArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combineArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combineArr[i + arr1.length] = arr2[i];
        }
        return combineArr;
    }
    public static void bookEnd(int[] nums, int num) {
        // IMPLEMENT ME
        nums[0] = num;
        nums[nums.length - 1] = num;
    }
    public static void multiplyBy(int[] numList, int multiplier) {
        // IMPLEMENT ME
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * multiplier;
        }
    }

    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        // IMPLEMENT ME
        int[] newNumList = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            newNumList[i] = numList[i] * multiplier;
        }
        return newNumList;
    }
    public static void addExclamation(String[] wordList) {
        // IMPLEMENT ME
        for (int i = 0; i < wordList.length; i++) {
            if (!(wordList[i].substring(wordList[i].length() - 1).equals("!"))) {
                wordList[i] += "!";
            }
        }
    }
    public static boolean[] isFreezing(int[] tempList) {
        boolean[] newTempList = new boolean[tempList.length];
        for (int i = 0; i < tempList.length;i++) {
            if (tempList[i] <= 32) {
                newTempList[i] = true;
            } else {
                newTempList[i] = false;
            }
        }
        return newTempList;
    }

    public static void shiftLeft(int[] numList) {
        int tempValue = 0;
        for (int i = 0; i < numList.length; i++) {
            if (!(i - 1 < 0)) {
                numList[i - 1] = numList[i];
            } else {
                tempValue = numList[0];
            }
        }
        numList[numList.length - 1] = tempValue;
    }

    public static void shiftRight(int[] numList) {
        int tempValue = numList[numList.length - 1];
        for (int i = numList.length - 1; i > 0; i--) {
            numList[i] = numList[i -1];
        }
        numList[0] = tempValue;
    }

    public static void reverse1(int[] numList) {
        int[] tempNumList = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            tempNumList[i] = numList[i];
        }
        for (int i = 0; i < tempNumList.length;i++ ) {
            numList[i] = tempNumList[tempNumList.length - i - 1];
        }
    }
    public static void reverse2(int[] numList) {
        int tempValue = 0;
        for (int i = 0; i < numList.length / 2; i++) {
            tempValue = numList[numList.length - 1 - i];
            numList[numList.length - 1 - i] = numList[i];
            numList[i] = tempValue;
        }
    }

    public static String longestString(String[] stringList) {
        String longestString = "";
        for (String string : stringList) {
            if (string.length() >= longestString.length()) {
                longestString = string;
            }
        }
        return longestString;
    }

    public static boolean containsPositive(int[] numList) {
        for (int num : numList) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    public static String[] makeLowercase(String[] wordList) {
        String[] tempList = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++ ) {
            tempList[i] = wordList[i].toLowerCase();
        }
        return tempList;
    }

    public static int endsInExclamations(String[] stringList) {
        int sum = 0;
        for (String string : stringList) {
            if (string.substring(string.length() - 1).equals("!")) {
                sum++;
            }
        }
        return sum;
    }

    public static void makeUppercase(String[] wordList){
        for (int i = 0; i < wordList.length; i++ ) {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        int[] tempList = new int[intArr1.length];
        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i] > intArr2[i]) {
                tempList[i] = intArr1[i];
            } else {
                tempList[i] = intArr2[i];
            }
        }
        return tempList;
    }

    public static int countConsecutiveDoubles(int[] numList) {
        int sum = 0;
        for (int i = 0; i < numList.length - 1; i ++) {
            if (numList[i] == numList[i + 1]) {
                sum++;
            }
        }
        return sum;
    }

    public static int longestStreak(int[] nums) {
        int sum = 1;
        int longestStreak = 1;
        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i] == nums[i + 1]) {
                sum++;
            } else {
                if (sum > longestStreak) {
                    longestStreak = sum;
                }
                sum = 1;
            }
        }
        if (sum > longestStreak) {
            longestStreak = sum;
        }
        return longestStreak;
    }

}


