package gmms.service;

import gmms.dao.VmVehicleMapper;
import gmms.domain.db.VmVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wangfs on 2018-05-31 helloword.
 */
@Service
public class VmVehicleService {
    @Autowired(required = false)
    private VmVehicleMapper vmVehicleMapper;

    public VmVehicle getVmVEhicleById(String id){
        return vmVehicleMapper.selectByPrimaryKey(id);
    };
}
