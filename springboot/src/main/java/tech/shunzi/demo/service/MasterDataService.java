package tech.shunzi.demo.service;

import tech.shunzi.demo.event.plus.MasterData;

import java.util.List;

public interface MasterDataService {
    List<MasterData> saveMasterData(List<MasterData> data);
}
