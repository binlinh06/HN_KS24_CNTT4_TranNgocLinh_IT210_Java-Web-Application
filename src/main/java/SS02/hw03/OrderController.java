package SS02.hw03;


import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class OrderController {

    @GetMapping("/orders")
    public String orders(
            HttpSession session,
            HttpServletRequest request,
            Model model
    ) {

        // kiểm tra login
        if (session.getAttribute("loggedUser") == null) {
            return "redirect:/login";
        }

        // fake data
        List<Order> list = new ArrayList<>();
        list.add(new Order("OD01", "Áo thun", 120000, new Date()));
        list.add(new Order("OD02", "Quần jean", 350000, new Date()));
        list.add(new Order("OD03", "Giày sneaker", 800000, new Date()));

        model.addAttribute("orders", list);

        // application scope
        ServletContext application = request.getServletContext();

        synchronized (application) {
            Integer count = (Integer) application.getAttribute("totalViewCount");
            if (count == null) count = 0;
            application.setAttribute("totalViewCount", count + 1);
        }

        return "orders";
    }
}
