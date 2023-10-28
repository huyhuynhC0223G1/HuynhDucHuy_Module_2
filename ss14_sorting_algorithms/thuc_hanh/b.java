package ss14_sorting_algorithms.thuc_hanh;

import ss14_sorting_algorithms.thuc_hanh.a1.AA;

import java.util.*;
import java.util.stream.Stream;

public class b extends AA {
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(i);
        }

        Stream<Integer> stream = myList.stream();

        Stream<Integer> stream1= myList.parallelStream();
        Stream<Integer> stream2= stream.filter(p -> p > 90);
        stream2.forEach(p -> System.out.println("Hight p:" + p));
//        Stream<Integer> stream3= stream1.filter(p -> p > 90);
//        stream2.forEach(p -> System.out.println("Hight p:" + p));























//        String time1 = "11:20:30";
//        String time2 = "07:35:45";
//        String sum = calculateTimeSum(time1, time2);
//        System.out.println("Tổng hai chuỗi thời gian: " + sum);
    }
    public static String calculateTimeSum(String time1, String time2) {
        String[] parts1 = time1.split(":");
        String[] parts2 = time2.split(":");
        int hours = 0; int minutes = 0; int seconds = 0; int carryMinutes = 0; int carryHours = 0;
        for (int i = 2; i >= 0; i--) {
            int value1 = Integer.parseInt(parts1[i]);
            int value2 = Integer.parseInt(parts2[i]);
            int sum = value1 + value2 + carryMinutes;
            switch (i) {
                case 2:
                    seconds = sum % 60;
                    carryMinutes = sum / 60;
                    break;
                case 1:
                    minutes = sum % 60;
                    carryHours = sum / 60;
                    break;
                case 0:
                    hours = sum + carryHours;
                    break;
            }
        }
        String sumTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return sumTime;
    }
}

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