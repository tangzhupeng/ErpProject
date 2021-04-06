//package cn.gson.jindie.model.service.perservice;//package cn.gson.jindie.model.service.perservice;
//
//import cn.gson.jindie.model.mapper.permapper.UserMapper;
//import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService implements UserDetailsService {
//    @Autowired(required=false)
//    public UserMapper userMapper;
//
//    @Override
//    public UserDetails loadUserByUsername(String emp_name) throws UsernameNotFoundException {
//        ErpEmp emp = userMapper.selectUserByEname(emp_name);
//        if(emp == null){
//            throw new UsernameNotFoundException("用户不存在");
//        }
//        emp.setRoles(userMapper.selectEmpRoleByEid(emp.getEmpId()));
//        return emp;
//    }
//}
