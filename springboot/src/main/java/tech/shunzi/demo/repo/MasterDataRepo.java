package tech.shunzi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.shunzi.demo.event.plus.MasterData;

@Repository
public interface MasterDataRepo extends JpaRepository<MasterData, String> {
}
