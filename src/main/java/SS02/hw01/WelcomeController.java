package SS02.hw01;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("name", "Nguyễn Văn A");
        return "welcome"; // gọi welcome.jsp
    }
}