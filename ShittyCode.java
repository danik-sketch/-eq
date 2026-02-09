import java.security.*;
import java.sql.*;
import java.util.*;

public class ShittyCode {
    
    // 1. ХАРДКОД ПАРОЛЯ (Critical Security)
    private String DB_PASSWORD = "root123";
    public static final String API_KEY = "sk_live_1234567890abcdef";
    
    // 2. ПУБЛИЧНОЕ ПОЛЕ (Major)
    public int publicField = 666;
    
    // 3. НЕИСПОЛЬЗУЕМОЕ ПОЛЕ (Major)
    private String neverUsed = "wasted";
    
    // 4. СТАТИЧЕСКОЕ НЕ ФАЙНАЛ (Major)
    public static List<String> users = new ArrayList<>();
    
    public void doEverythingBad() throws Exception {
        
        // 5. SYSTEM.OUT ВМЕСТО ЛОГГЕРА (Major)
        System.out.println("Starting shitty code...");
        
        // 6. SQL ИНЪЕКЦИЯ (Critical)
        String userInput = "admin' OR '1'='1";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", DB_PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'");
        
        // 7. ХРАНЕНИЕ ПАРОЛЯ В ПЕРЕМЕННОЙ (Critical)
        String plainPassword = "superSecret123";
        
        // 8. СЛАБАЯ КРИПТОГРАФИЯ (Critical)
        MessageDigest md = MessageDigest.getInstance("MD5");
        String hash = new String(md.digest(plainPassword.getBytes()));
        
        // 9. ПРЕДСКАЗУЕМЫЙ РАНДОМ (Major)
        Random rand = new Random(12345); // Фиксированный seed
        int token = rand.nextInt();
        
        // 10. NPE РИСК (Critical)
        String nullString = null;
        if (nullString.equals("test")) {
            System.out.println("Will never happen");
        }
        
        
        // 12. СЛИШКОМ ОБЩЕЕ ИСКЛЮЧЕНИЕ (Major)
        throw new RuntimeException("Something bad happened");
        
        // 13. НЕДОСТИЖИМЫЙ КОД (Major)
        // System.out.println("Unreachable");
    }
    
    // 15. СЛИШКОМ МНОГО ПАРАМЕТРОВ (Major)
    public void tooManyParams(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        System.out.println(a + b + c + d + e + f + g + h + i + j);
    }
    
    // 16. ПУСТОЙ МЕТОД (Minor)
    public void emptyMethod() {
    }
    
    // 17. ИЗБЫТОЧНОЕ УСЛОВИЕ (Minor)
    public boolean check(boolean flag) {
        if (flag == true) {
            return true;
        } else {
            return false;
        }
    }
    
    // 18. МАГИЧЕСКИЕ ЧИСЛА (Minor)
    public void magicNumbers() {
        int timeout = 30; // Что такое 30?
        int port = 8080; // Что такое 8080?
        int maxUsers = 100; // Что такое 100?
    }
    
    // 19. НЕЭФФЕКТИВНАЯ КОНКАТЕНАЦИЯ В ЦИКЛЕ (Major)
    public String buildString() {
        String result = "";
        for (int i = 0; i < 100; i++) {
            result += i; // ОЧЕНЬ МЕДЛЕННО!
        }
        return result;
    }
    
    // 20. СИНХРОНИЗАЦИЯ ПО НЕФИНАЛЬНОМУ ПОЛЮ (Critical)
    private Object lock = new Object();
    
    public void badSynchronization() {
        synchronized (lock) {
            System.out.println("Bad sync");
        }
    }
    
    // 21. PRINTSTACKTRACE (Major)
    public void logError() {
        try {
            throw new Exception("Test");
        } catch (Exception e) {
            e.printStackTrace(); // НЕЛЬЗЯ!
        }
    }
    
    // 22. ВОЗВРАТ NULL (Major)
    public String getUser() {
        return null; // ПЛОХАЯ ПРАКТИКА
    }
    
    // 23. RAW TYPE (Minor)
    public void rawTypeUsage() {
        List list = new ArrayList(); // БЕЗ GENERICS!
        list.add("string");
        list.add(123);
    }
    
    // 24. SYSTEM.EXIT (Critical)
    public void exitApp() {
        System.exit(1); // НИКОГДА НЕ ДЕЛАЙТЕ ЭТОГО
    }
    
    // 25. БЕСКОНЕЧНЫЙ ЦИКЛ (Major)
    public void infiniteLoop() {
        while (true) {
            // never ends
        }
    }
    
    // 26. ПЕРЕКРЕСТНЫЙ КЛАСС (God Class)
    // Этот класс делает слишком много!
    public void processData() { /* ... */ }
    public void calculateStats() { /* ... */ }
    public void sendEmail() { /* ... */ }
    public void updateDB() { /* ... */ }
    public void generateReport() { /* ... */ }
    public void backupData() { /* ... */ }
    public void validateInput() { /* ... */ }
    public void parseXML() { /* ... */ }
    public void callAPI() { /* ... */ }
    public void cleanup() { /* ... */ }
    
    // 27. ДУБЛИРОВАНИЕ КОДА (Major)
    public void duplicateCode1() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    
    public void duplicateCode2() {
        int x = 5;
        int y = 10;
        int total = x + y;
        System.out.println("Sum: " + total);
    }
    
    // 28. КОММЕНТАРИЙ TODO (Info)
    // TODO: Пофиксить эту хрень потом
    public void unfinishedMethod() {
        // нужно доделать
    }
    
    // 29. СЛОЖНАЯ ЦИКЛОМАТИЧЕСКАЯ СЛОЖНОСТЬ (Major)
    public void complexMethod(int x, int y, int z) {
        if (x > 0) {
            if (y < 10) {
                for (int i = 0; i < 10; i++) {
                    if (z == i) {
                        while (x < 100) {
                            switch (y) {
                                case 1:
                                    System.out.println("1");
                                    break;
                                case 2:
                                    System.out.println("2");
                                    break;
                                default:
                                    System.out.println("other");
                            }
                            x++;
                        }
                    }
                }
            }
        }
    }
    
    // 30. НЕИСПОЛЬЗУЕМЫЙ ПАРАМЕТР (Minor)
    public void unusedParameter(String notUsed) {
        System.out.println("Hello");
    }
}

// 31. КЛАСС С ОДНИМ МЕТОДОМ (Utility Class должен быть final)
class Utility {
    private Utility() {}
    public static void help() {
        System.out.println("Help");
    }
}