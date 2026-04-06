package SS02.hw03;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    // Hiển thị form login (GET)
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    // Xử lý submit (POST)
    @PostMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session,
            Model model
    ) {

        if ("admin".equals(username) && "admin123".equals(password)) {
            session.setAttribute("loggedUser", "admin");
            session.setAttribute("role", "ADMIN");
            return "redirect:/orders";
        }

        if ("staff".equals(username) && "staff123".equals(password)) {
            session.setAttribute("loggedUser", "staff");
            session.setAttribute("role", "STAFF");
            return "redirect:/orders";
        }

        model.addAttribute("error", "Sai tài khoản hoặc mật khẩu!");
        return "login";
    }
}