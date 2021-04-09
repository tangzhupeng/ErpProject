package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.service.perservice.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class EmpController {
    @Autowired
    EmpService empService;

    /**
     * 新增员工
     * @param emp
     */
    @PostMapping("/addEmp")
    @ResponseBody
    public void addEmp(ErpEmp emp){
        empService.addEmp(emp);
    }

    /**
     * 分页查询所有员工
     * @return
     */
    @GetMapping("/selectAllEmp")
    @ResponseBody
    public Map<String, Object> selectAllEmp(Integer pageNum, Integer size) {
        Map<String, Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpEmp> erpEmps = empService.selectAllEmp();
        map.put("total", page.getTotal());
        map.put("rows", erpEmps);
        return map;
    }

    /**
     * 不分页查询员工信息
     */
    @GetMapping("/selectAllEmpNo")
    @ResponseBody
    public List<ErpEmp> selectAllEmp(){
        List<ErpEmp> erpEmps = empService.selectAllEmp();
        return erpEmps;
    }

    /**
     * 修改员工
     * @param emp
     */
    @PostMapping("/updateEmp")
    @ResponseBody
    public void updateEmp(ErpEmp emp){
        System.out.println(emp);
        empService.updateEmp(emp);
    }

    /**
     * 删除员工
     * @param empId
     * @return
     */
    @PostMapping("/deleteEmp")
    @ResponseBody
    public Integer deleteEmp(Integer empId){
        return empService.deleteEmp(empId);
    }


}
