package com.chi.config;

import com.chi.dao.DepartmentDao;
import com.chi.dao.EmployeeDao;
import com.chi.pojo.Department;
import com.chi.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    // 跳转到员工添加页面
    @GetMapping("/emp")
    public String toAddpage(Model model){
        // 查出所有的部门信息
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee, Model model){
        // 添加操作 farward
        // 调用底层保存员工信息
        System.out.println("employee=>"+employee);
        employeeDao.save(employee);

        return "redirect:/emps";
    }

    // 跳转到员工修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id, Model model){
        // 查出员工信息
        Employee employee = employeeDao.getEmployeeById(id);
        model.addAttribute("emp",employee);

        // 查出所有的部门信息
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    @RequestMapping("/updateEmp")
    public String updateEmp(Employee employee, Model model){
        // 添加操作 farward
        // 调用底层保存员工信息
        System.out.println("updateEmp=>"+employee);
        employeeDao.save(employee);

        return "redirect:/emps";
    }

    @RequestMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id, Model model){
        employeeDao.delete(id);
        return "redirect:/emps";
    }

}
