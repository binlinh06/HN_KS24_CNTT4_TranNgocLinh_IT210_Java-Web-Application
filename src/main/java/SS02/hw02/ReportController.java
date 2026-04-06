package SS02.hw02;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReportController {

    @RequestMapping("/report")
    public String report(Model model) {

        // Tạo dữ liệu giả
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nguyễn Văn A", 9));
        students.add(new Student(2, "Trần Thị B", 7));
        students.add(new Student(3, "Lê Văn C", 4));

        // Đẩy sang JSP
        model.addAttribute("students", students);

        return "report"; // gọi report.jsp
    }
}
