
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, CI/CD with Spring Boot + DevTools!";
    }
}