
// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;

import java.util.HashMap;

public class example {
    public static void main(String[] args) throws Exception {
        // String name = new String("Hello! My name is Quyet");
        // String new_string = "The sky is blue";

        // String updatedString = new_string.replace("blue", "red");
        // System.out.println(new_string.contains("freecodeCampe"));
        // System.out.println(updatedString);

        /* User Inputs */
        // Scanner scanner = new Scanner(System.in);

        /*----------------------------------How to input, output------------------------------ */
        // System.out.println("What is your name?");
        // String name = scanner.nextLine();

        // System.out.println("What is your height?");
        // float height = Float.parseFloat(scanner.nextLine());

        // System.out.println("How old are you?");
        // int age = scanner.nextInt(); // int age=Integer.parseInt(scanner.nextLine());

        /*----------------------------------Conditional Statements------------------------------ */
        // System.out.println("Input first number");
        // double firstnum = scanner.nextDouble();

        // System.out.println("Input second number");
        // // double secondnum = Double.parseDouble(scanner.nextLine());
        // double secondnum = scanner.nextDouble();

        // // clean up buffer
        // scanner.nextLine();

        // System.out.println("Which operation do you want to do?");
        // String operation = scanner.nextLine();

        // switch (operation) {
        // case "sum":
        // System.out.printf("%f + %f = %f", firstnum, secondnum, firstnum + secondnum);
        // break;
        // case "sub":
        // System.out.printf("%f -%f = %f", firstnum, secondnum, firstnum - secondnum);
        // break;
        // case "mul":
        // System.out.printf("%f * %f = %f", firstnum, secondnum, firstnum * secondnum);
        // break;
        // case "div":
        // System.out.printf("%f / %f = %f", firstnum, secondnum, firstnum / secondnum);
        // break;
        // default:
        // System.out.printf("%s is not a supported opration", operation);
        // }

        // if (operation.equals("sum")) {
        // System.out.printf("%f + %f = %f", firstnum, secondnum, firstnum + secondnum);
        // } else if (operation.equals("sub")) {
        // System.out.printf("%f -%f = %f", firstnum, secondnum, firstnum - secondnum);
        // } else if (operation.equals("mul")) {
        // System.out.printf("%f * %f = %f", firstnum, secondnum, firstnum * secondnum);
        // } else if (operation.equals("div")) {
        // System.out.printf("%f / %f = %f", firstnum, secondnum, firstnum / secondnum);
        // } else {
        // System.out.printf("%s is not a supported opration", operation);
        // }

        /*----------------------------------Arrays------------------------------ */
        // String vowels[] = { "hello", "yeah", "love", "baby", "oh" };

        // String copyArrays[] = Arrays.copyOf(vowels, vowels.length);
        // String new_copyArrays[] = Arrays.copyOfRange(vowels, 1, 4);

        // // Arrays.fill(vowels, "0");

        // System.out.println(Arrays.toString(vowels));
        // System.out.println(Arrays.toString(copyArrays));
        // System.out.println(Arrays.equals(vowels, copyArrays)); // not like String we
        // can use == but in array it will
        // // return false
        // System.out.println(Arrays.toString(new_copyArrays));

        // int startingIndex = 1;
        // int endingIndex = 4;

        // vowels[0] = "oh shit";
        // Arrays.sort(vowels);

        // String key = "love";

        // Arrays.sort(vowels, startingIndex, endingIndex);
        // int foundItemindex = Arrays.binarySearch(vowels, key);

        // System.out.println(Arrays.toString(vowels));
        // System.out.printf("{%s} is at the position %d", key, foundItemindex);

        // System.out.println("Welcome " + name);
        // System.out.printf("How are you, %s?", name);
        // System.out.println("\nYour height is " + height);
        // System.out.printf("\nYou are, %d?", age);
        // System.out.printf("\nSo you are %d", age);

        /*----------------------------------ArrayLists------------------------------ */
        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);
        // numbers.add(4);
        // numbers.add(5);
        // numbers.add(6);

        // numbers.remove(2); // remove value at index '2'
        // numbers.remove(Integer.valueOf(2)); // remove value '2'
        // // numbers.clear();//clear all the array list
        // numbers.set(3, Integer.valueOf(30)); // set value at index '2' = 30

        // // Sort the array list (like method sort of array)
        // // numbers.sort(Comparator.naturalOrder());
        // numbers.sort(Comparator.reverseOrder());

        // // forEach loop in array list
        // numbers.forEach(number -> {
        // numbers.set(numbers.indexOf(number), number * 2);
        // System.out.println(number * 2);
        // });

        // System.out.println(numbers.toString());
        // System.out.println(numbers.contains(Integer.valueOf(10)));
        // System.out.println(numbers.isEmpty());

        /*----------------------------------HashMap------------------------------ */
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Maths", 100);
        examScores.put("Literature", 75);
        examScores.put("English", 90);
        examScores.put("Physical Education", 90);
        examScores.put("Computer Programming", 100);

        // examScores.remove("Literature");
        // System.out.println(examScores.containsKey("Physical Education"));
        // System.out.println(examScores.containsValue(100));
        // System.out.println(examScores.containsValue(Integer.valueOf(100)));
        // System.out.println(examScores.isEmpty());

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
            System.out.println(subject + " - " + score);
        });

        System.out.println(examScores.toString());

        // examScores.clear();
        // System.out.println(examScores.toString());

        // System.out.println(examScores.size());
        // System.out.println(examScores.get("English"));
        // scanner.close();
    }
}
