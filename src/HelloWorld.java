 class ArrDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, 10, -4, 7, 2, -5};
        int i = getGreatestSum(arr);
        System.out.println(i);
    }

    public static int getGreatestSum(int[] arr){
        int greatestSum = 0;
        if(arr == null || arr.length == 0){
            return 0;
        }
        int temp = greatestSum;
        for(int i = 0;i < arr.length;i++){
            temp += arr[i];

            if(temp < 0){
                temp = 0;
            }

            if(temp > greatestSum){
                greatestSum = temp;
            }
        }
        if(greatestSum == 0){
            greatestSum = arr[0];
            for(int i = 1;i < arr.length;i++){
                if(greatestSum < arr[i]){
                    greatestSum = arr[i];
                }
            }
        }
        return greatestSum;
    }
}