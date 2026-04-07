package SS03.KTDG.controller;

import SS03.KTDG.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public String getEmployees(Model model) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Nguyen Van A", "IT", 12000));
        list.add(new Employee(2, "Tran Thi B", "HR", 8000));
        list.add(new Employee(3, "Le Van C", "Finance", 15000));

        model.addAttribute("employees", list);

        return "employee-list";
    }
}
