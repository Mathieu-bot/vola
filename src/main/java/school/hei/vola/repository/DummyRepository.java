package school.hei.vola.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.vola.PojaGenerated;
import school.hei.vola.repository.model.Dummy;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

  @Override
  List<Dummy> findAll();
}
