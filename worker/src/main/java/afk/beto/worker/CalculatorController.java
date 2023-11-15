package afk.beto.worker;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @PostMapping("/add")
    public int add(int a, int b) {
        return a + b;
    }

    @PostMapping("/subtract")
    public int subtract(int a, int b) {
        return a - b;
    }

    @PostMapping("/multiply")
    public int multiply(int a, int b) {
        return a * b;
    }

    @PostMapping("/divide")
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
