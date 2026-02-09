class ArrayExample {
    public static void main(String[] args) {
        // Создаём массив
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Выводим элементы массива
        System.out.println("Элементы массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        // Сумма элементов
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сумма всех элементов: " + sum);
    }
}