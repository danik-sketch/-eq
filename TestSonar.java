// TestSonar.java
public class TestSonar {
    public static void main(String[] args) {
        // Явные ошибки для SonarLint:
        
        // 1. System.out вместо логгера - ДОЛЖЕН подчеркнуть
        System.out.println("Test");
        
        // 2. Неиспользуемая переменная
        int unused = 5;
        
        // 3. Магическое число
        int timeout = 30;
        
        // 4. Избыточное сравнение
        boolean flag = true;
        if (flag == true) {
            System.out.println("Redundant");
        }
        
        // 5. Потенциальный NPE
        String text = null;
        if (text.equals("test")) {
            System.out.println("NPE!");
        }
    }
}