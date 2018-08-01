package tech.shunzi.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.shunzi.demo.event.plus.MasterData;
import tech.shunzi.demo.repo.MasterDataRepo;
import tech.shunzi.demo.service.MasterDataService;

import java.util.List;

@Service
public class MasterDataServiceImpl implements MasterDataService {

    @Autowired
    private MasterDataRepo repo;

    @Override
    public List<MasterData> saveMasterData(List<MasterData> data) {
        return repo.save(data);
    }
}
