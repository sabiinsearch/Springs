@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    public String home() {
        return "Hello, World! located in groovy file in src"
    }

}