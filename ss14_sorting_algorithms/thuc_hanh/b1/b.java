package ss14_sorting_algorithms.thuc_hanh.b1;

import ss14_sorting_algorithms.thuc_hanh.a1.AA;

import java.util.*;

public class b extends AA {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 2, 2, 4};
            boolean[] isDuplicate = new boolean[arr.length];
            Arrays.sort(arr);
            // Đánh dấu các giá trị bị trùng lặp
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    isDuplicate[i] = true;
                    isDuplicate[i + 1] = true;
                }
            }
            // Tạo danh sách chứa các giá trị không trùng lặp
            List<Integer> uniqueValues = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (!isDuplicate[i]) {
                    uniqueValues.add(arr[i]);
                }
            }
            // In ra các giá trị không trùng lặp
            System.out.println("Các giá trị không trùng lặp trong mảng:");
            for (int num : uniqueValues) {
                System.out.println(num);
            }
        }
    }








//        int[] array = {2, 4, 6, 8, 10};
//        int target = 14;
//        int[] result = findSumIndices(array, target);
//        if (result != null) {
//            System.out.println("Vị trí của hai số có tổng " + target + " là: " + result[0] + " và " + result[1]);
//        } else {
//            System.out.println("Không tìm thấy hai số có tổng " + target);
//        }
//    }
//    public static int[] findSumIndices(int[] arr, int N) {
//        Map<Integer, Integer> numMap = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            int complement = N - arr[i];
//            if (numMap.containsKey(complement)) {
//                return new int[]{numMap.get(complement), i};
//            }
//            numMap.put(arr[i], i);
//        }
//        return null;
//    }

//    public static void main(String[] args) {
//        String romanNumeral = "XI";
//        int decimal = romanToInt(romanNumeral);
//        System.out.println("Giá trị nguyên của chuỗi số La Mã " + romanNumeral + " là: " + decimal);
//    }
//    public static int romanToInt(String s) {
//        Map<Character, Integer> romanMap = new HashMap<>();
//        romanMap.put('I', 1);
//        romanMap.put('V', 5);
//        romanMap.put('X', 10);
//        romanMap.put('L', 50);
//        romanMap.put('C', 100);
//        romanMap.put('D', 500);
//        romanMap.put('M', 1000);
//        int result = 0;
//        int prevValue = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            char currentChar = s.charAt(i);
//            int currentValue = romanMap.get(currentChar);
//            if (currentValue < prevValue) {
//                result -= currentValue;
//            }
//            else {
//                result += currentValue;
//            }
//            prevValue = currentValue;
//        }
//        return result;
//    }
//        Scanner scanner = new Scanner(System.in);
//            System.out.print("Nhập số: ");
//            int num = scanner.nextInt();
//            int result = 0;
//
//            while (num > 0) {
//                int digit = num % 10;// lấy số cuối
//                result = (result * 10) + digit; // them số đó vào
//                num = num / 10; // bỏ số
//            }
//
//            System.out.println("Số ngược lại là: " + result);

//        int[] numbers = {1, 3, 4, 2, 5};
//        Arrays.sort(numbers);
//        int maxSum = 0;
//        int minSum = 0;
//        int max = numbers[numbers.length - 1];
//        int min = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            maxSum += numbers[i];
//            minSum += numbers[i];
//        }
//        System.out.println("Tổng 4 số lớn nhất:" + (maxSum- min));
//        System.out.println("Tổng 4 số nhỏ nhất:" +(minSum- max));
//
//


// for (String key : map.keySet()) {
//         int count = map.get(key);
//         System.out.println(count + key);
//         }