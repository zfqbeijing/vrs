package cn.com.vrs.service.serviceImpl;

import cn.com.vrs.dao.HrMapper;
import cn.com.vrs.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @Description TODD
 * @Author zhangFengQin
 * @Date Created in 2020/7/1 0001 10:48
 * @Version V 0.0.1
 * @Modified By:  
 *
 **/
@Service
public class HrServiceImpl implements HrService {

    @Autowired
    private HrMapper hrMapper;

    @Override
    public List findAll() {
        return hrMapper.selectAll();
    }
}
