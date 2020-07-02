package cn.com.vrs.controller;

import cn.com.vrs.service.serviceImpl.HrServiceImpl;
import cn.com.vrs.utils.Result;
import cn.com.vrs.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Description TODD
 * @Author zhangFengQin
 * @Date Created in 2020/7/1 0001 10:49
 * @Version V 0.0.1
 * @Modified By:  
 *
 **/
@RestController
public class HrController {

    @Autowired
    private HrServiceImpl hrService;


    @ResponseBody
    @GetMapping(value = "/findAll")
    public Result findAll(){
        return new Result(true, StatusCode.OK,"查询成功",hrService.findAll());
    }


}
