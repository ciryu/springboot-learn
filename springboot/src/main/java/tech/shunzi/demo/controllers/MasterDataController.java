package tech.shunzi.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.shunzi.demo.event.plus.MasterData;
import tech.shunzi.demo.service.MasterDataService;

import java.util.List;

@RestController
@RequestMapping("/master-data")
public class MasterDataController {

    @Autowired
    private MasterDataService masterDataService;

    @PostMapping("/save")
    public List<MasterData> save(@RequestBody List<MasterData> data)
    {
        return masterDataService.saveMasterData(data);
    }
}
